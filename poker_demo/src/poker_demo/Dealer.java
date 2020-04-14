package poker_demo;

import java.util.LinkedList;

public class Dealer extends Person {

	private DeckOfCards deck = new DeckOfCards(true);
	
	public Dealer() {
		super();
	}
	
	public Dealer(String name, char gender, int age){
		super(name,gender,age);
	}

	public void deal(Player p)
	{
		Card card = deck.get(); //Remove one card from the deck(cardlist)
		p.put(card); //Deal the card to the specified player
	}
	
	public void recycle(Player p)
	{
		Card card = p.get(); //Remove one card from the player
		deck.put(card); //Put it back to the deck
	}
	
	public void recycleAll(Player p)
	{
		while(!p.isEmpty()) {
		Card card = p.get(); //Remove all cards from the player
		deck.put(card); //Put it back to the deck
		}
	}
	
	public void shuffle()
	{
		deck.shuffle();
	}
	
	public int cardCount() {
		return deck.cardCount();
	}
	
	public boolean isEmpty()
	{
		return deck.cardCount() == 0;
	}
	
	public void displayCards()
	{
		System.out.println("Dealer " + this.name + "'s cards (" + this.cardCount() + " in total )");
		deck.displayCards();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Mary",'F',18);
		Player p2 = new Player("Vinh",'M',23);
		Dealer d = new Dealer("Te", 'M', 24);
		//System.out.println("Player 1's cards: ");
		p1.displayCards();
		//System.out.println("Player 2's cards: ");
		p2.displayCards();
	//	System.out.println("Dealer's cards: ");
		d.displayCards();
		
		d.deal(p1);
		d.deal(p1);
		d.deal(p2);
		//System.out.println("Player 1's cards: ");
		p1.displayCards();
		//System.out.println("Player 2's cards: ");
		p2.displayCards();
		//System.out.println("Dealer's cards: ");
		d.displayCards();
	}

}
