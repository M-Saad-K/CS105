/*
 * Models a pack of cards with methods to discover 'interesting' things about the pack.
 */
import java.util.ArrayList;

public class PackCards {

	private final ArrayList<Card> pack;

		/*
		 * Create a random pack of size n
		 */
		public PackCards(int n) {
			Card c;
			pack = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				c = new Card();
				pack.add(c);
			}
		}

		public void printPack() {
			for (Card c : pack) {
				System.out.println(c.cardString());
			}
		}

		/*
		 * Total the numerical value of all the cards in the pack
		 */
		public int totalPack() {
			return  pack.size();
		}

		/*
		 * Find all the cards of a suit specified by String e.g. "Spades"
		 */
	//	public ArrayList<Card> findSuit(String suit) {
	//
	//	}

		/*
		 * Find largest card in pack taking into account numerical value and suit
		 * Diamonds is lowest, then Clubs, then Hearts, then Spades is largest.
		 */
	//	public Card findLargest() {
	//
	//	}

		/*
		 * Return true if there is a duplicate card in the pack
		 */
	//	public boolean hasDuplicate() {
	//
	//	}

		/*
		 * Return any duplicate card, 'null otherwise
		 */
	//	public Card getDuplicate() {
	//


}

