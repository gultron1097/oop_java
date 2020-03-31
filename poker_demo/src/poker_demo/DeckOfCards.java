package poker_demo;

public class DeckOfCards {
	
	static int NUM_OF_CARDS = 52;
	Card[] cards = new Card[NUM_OF_CARDS]; //it stores 52 cards
	
	public DeckOfCards()
	{
		for(int i = 1; i <= NUM_OF_CARDS; i++)
		{
			cards[i-1] = new Card(i);
		}
	}
	
	public void displayCards()
	{
		for (int i=0; i<DeckOfCards.NUM_OF_CARDS; i++)
		{
			Card card = cards[i];
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
				Card temp = cards[i];
				cards[i] = cards[j];
				cards[j] = temp;
			}
			else {
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards myDeck = new DeckOfCards();
		System.out.println("Before shuffling, the deck of cards is as follos:");
		myDeck.displayCards();
		
		//Invoke/call the method Shuffle
		myDeck.shuffle();
		
		System.out.println("After shuffling, the deck of cards is as follos:");
		myDeck.displayCards();

	}

}
