package com.hk.blackjack;

public class Gamer {
	protected Card[] myCards = new Card[10];
		
	//카드 주소값을 외부로부터 받아서 myCards배열에 차곡차곡
	//저장한다.
	public void addCard (Card card) {
		for(int i=0; i<myCards.length; i++) {
			if(myCards[i] == null) {
				myCards[i] = card;
				return;
			}
		}
	}
	
	public void openCards() {
		int sum = 0;
		for(Card c : myCards) {
			if(c != null) {
				System.out.println(c);
				sum += c.value;
			}			
		}
		System.out.printf("sum : %d\n", sum);
	}
}









