package com.hk.blackjack;

public class Main {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gm = new Gamer();
		Dealer dl = new Dealer();

		gm.addCard(cd.pick());
		gm.addCard(cd.pick());
		gm.addCard(cd.pick());
		
		dl.addCard(cd.pick());
		dl.addCard(cd.pick());
		dl.addCard(cd.pick());
		
		gm.openCards();
		System.out.println("------");
		dl.openCards();
		
		Rule.getWinner(gm, dl);
	}

}
