package com.Cards;

public class Test {
	public static void main(String[] args) {
		DeckOfCards card = new DeckOfCards();
		
		card.cardCreation();
		card.shuffle();
		card.distribute();
	}
}
