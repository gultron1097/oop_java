package poker_demo;

public class Card {
	static String[] PATTERNS = {"club", "diamon", "heart", "space"};
	int pid; //Index of the pattern, ranging from 0-3
	int number; //point of the card, ranging from 1-13
	
	/**
	 * Given the pattern index and point of a card,
	 * Convert them into the id of the filename of the card image
	 * @return
	 */
	
	public static int getFileID(int pid, int number)
	{
		return pid * 13 + number;
	}
	
	public static int getPatternID(int fid)
	{
		return Math.floorDiv(fid - 1, 13);
	}
	
	public static int getNumber(int fid)
	{
		return Math.floorMod(fid - 1, 13) + 1;
	}
	
	
	public Card()
	{
		this.pid = 0;
		this.number = 0;
	}
	
	public Card(int pid, int number)
	{
		this.pid = pid;
		this.number = number;
	}
	
	public Card(int fid)
	{
		this.pid = Card.getPatternID(fid);
		this.number = Card.getNumber(fid);
	}
	
	public String getPattern()
	{
		return Card.PATTERNS[this.pid];
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	public static void main(String[] args)
	{
		int pid, number, fid;
		
		pid = 2;
		number = 13;
		fid = Card.getFileID(pid, number);
		System.out.println("Pattern index: " + pid + ", number: " + number + ", its file id: " + fid);
		
		pid = Card.getPatternID(fid);
		System.out.println("Given file id: " + fid + ", we have pid: " + pid );
		
		number = Card.getNumber(fid);
		System.out.println("Given file id: " + fid + ", we have number: " + number );
	}

}
