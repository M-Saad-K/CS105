/*
 * A class to model a playing card.
 */
public class Card {

	private int number;
	private String suit;

	/*
	 * Randomly creates a card numbered 1 to 13 (ace = 1!) and labelled "Hearts","Clubs","Diamonds" or "Spades".
	 */
	public Card() {
		double randomNum = Math.random() * 4.0;
		if (randomNum < 1.0)
			suit = "Hearts";
		else if (randomNum < 2.0)
			suit = "Clubs";
		else if (randomNum < 3.0)
			suit = "Diamonds";
		else
			suit = "Spades";
		randomNum = Math.random() * 13.0;
		number = (int) randomNum + 1;
	}
	/*
	 * Creates a card with specified number and suit
	 */
	public Card (int n, String s) {
		number = n;
		suit = s;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getSuit () {
		return suit;
	}

	/*
	 * Converts Card to String representation e.g. "Ace of Spades"
	 */
	public String cardString() {
		// System.out.println(number + " " + suit);
		String stringNum = "";
		switch (number) {
		case 1:
			stringNum = "Ace";
			break;
		case 2:
			stringNum = "Two";
			break;
		case 3:
			stringNum = "Three";
			break;
		case 4:
			stringNum = "Four";
			break;
		case 5:
			stringNum = "Five";
			break;
		case 6:
			stringNum = "Six";
			break;
		case 7:
			stringNum = "Seven";
			break;
		case 8:
			stringNum = "Eight";
			break;
		case 9:
			stringNum = "Nine";
			break;
		case 10:
			stringNum = "Ten";
			break;
		case 11:
			stringNum = "Jack";
			break;
		case 12:
			stringNum = "Queen";
			break;
		case 13:
			stringNum = "King";
			break;
		default:
			System.out.println("Error in Card - illegal number");
		}
		return stringNum + " of " + suit;
	}
}
