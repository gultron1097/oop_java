package poker_demo;

import java.util.*;

public class DeckOfCards {
	private LinkedList<Card> cardList;
	
	static int NUM_OF_CARDS = 52;
	
	
	public DeckOfCards()
	{
		cardList = new LinkedList<Card>();
		for(int i = 1; i <= NUM_OF_CARDS; i++)
		{
			
			this.put(new Card(i));
		}
	}
	
	public DeckOfCards(boolean is_shuffle) {
		cardList = new LinkedList<Card>();
		
		for(int i = 0; i < DeckOfCards.NUM_OF_CARDS; i++)
		{
			this.put(new Card(i+1));
		}
		if(is_shuffle)
			this.shuffle();
	}
	
	public void put(Card card)
	{
		cardList.addFirst(card);
	}
	
	public Card get() {
		return cardList.removeLast();
	}
	
	
	public int cardCount()
	{
		return cardList.size();
	}
	public void displayCards()
	{
		for (int i=0; i<cardList.size(); i++)
		{
			Card card = cardList.get(i);
			System.out.println(card.getPattern() + card.getNumber());
		}
	}
	
	public void shuffle()
	{
		int N = DeckOfCards.NUM_OF_CARDS; //Shuffle times
		int i, j; //Correspond to two chosen cards to be exchanged
		for(int k = 1; k <=  N ; k++)
		{
			i = (int)(Math.random() * 51) + 1;
			j = (int)(Math.random() * 51) + 1;
			if(i!=j)
			{
				//Swap to cards
				Card temp = cardList.get(i);
				cardList.set(i, cardList.get(j));
				cardList.set(j,temp); 
			}
			else {
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards myDeck = new DeckOfCards();
		System.out.println("Before shuffling, the deck of cards is as follows:");
		myDeck.displayCards();
		
		//Invoke/call the method Shuffle
		myDeck.shuffle();
		
		System.out.println("After shuffling, the deck of cards is as follows:");
		myDeck.displayCards();

	}

}
