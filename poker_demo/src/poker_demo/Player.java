package poker_demo;

import java.util.LinkedList;

public class Player {
	
	final static int MAX_CARDS_COUNT = 5;
private LinkedList<Card> cardList;
	
	//static int NUM_OF_CARDS = 52;
	
	public Player()
	{
		cardList = new LinkedList<Card>();
	}
	
	public void put(Card card)
	{
		cardList.addFirst(card);
	}
	
	public Card get() {
		return cardList.removeLast();
	}
	
	public boolean isEmpty()
	{
		return cardList.size() == 0;
	}
	
	public void displayCards()
	{
		for (int i=0; i<cardList.size(); i++)
		{
			Card card = cardList.get(i);
			System.out.println(card.getPattern() + card.getNumber());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.put(new Card(0,1)); //Club Ace
		System.out.println("The player's cards are listed as follows:");
		player.displayCards();

	}

}
