package com.hk.blackjack;

public class CardDeck {
	private Card[] cards;
	
	//기본생성자 만드시구
	//cards변수에 52개의 Card객체 주소값을 
	//저장할 수 있는 배열을 객체화 하세요!!
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		cards = new Card[52];
		//52개의 카드 생성!!
		//배열에 차곡차곡 주소값을 넣어줄꺼에요.
		
		int oneCardCnt = 13; //한 모양의 카드 갯수
		String[] shapes = {"spade", "heart", "clover", "diamond"};
		
		int idx = 0;
		for(int i=0; i<shapes.length; i++) {		 //4	
			for(int z=0; z<oneCardCnt; z++) { //13				
				Card c = new Card(shapes[i], z);
				cards[idx++] = c;
			}
		}
		
		shuffleCards();
	}
	
	
	private void shuffleCards() {
		
	}
	
	public void showCards() {
		for(Card c : cards) {
			System.out.println(c);
		}
	}
}









