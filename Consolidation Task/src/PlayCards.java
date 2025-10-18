public class PlayCards {

	private PackCards pc;

	/*
	 * Just creates a pack of cards and prints them out
	 */
	public PlayCards(int n) {
		pc = new PackCards(n);
		pc.printPack();
	}

	/*
	 * Test total numerical value of pack
	 */
	

	 
	public void testTotal() {
		System.out.println();
		System.out.println(pc.totalPack());
	}
	

	
	/*
	 * Test to find all cards of specified suit in pack
	 */
	
	/* Remove comments to testSuit()
	 
	public void testSuit(String suit) {
		ArrayList<Card> hand = null;
    	hand = pc.findSuit(suit);
		System.out.println();
		for (Card c : hand) {
			System.out.println(c.cardString());
		}
	}
	
*/ // Remove comment to testSuit()
	
	/*
	 * Test to find largest card in suit
	 */
	
	/* Remove comments to testLargest()
	 
	public void testLargest() {
		Card c = pc.findLargest();
		System.out.println();
		System.out.println(c.cardString());
	}
	
 */ // Remove comments to testLargest()
	
	/* Remove comments to testDuplicate()
	 
	public void testDuplicate() {
		System.out.println();
		if (pc.hasDuplicate()) {
			Card d = pc.getDuplicate();
			System.out.println("There is a duplicate: " + d.cardString());
		} else
			System.out.println("There are no duplicates in this pack");
	}
	
	*/ // Remove comment to testDuplicate()
	
}
