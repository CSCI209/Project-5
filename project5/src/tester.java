import java.util.*;

/**
 * A terminal based tester class for the deck, card, player, and game classes.
 * @author Bryan Jun
 * @author Gunnar Bowman
 */
public class tester {
	public static void main(String[] args) {
		Deck d1 = new Deck();
		Card c1 = new Card(Suit.heart,7);
		Card c2 = new Card(Suit.heart, 3);
		/*
		 * Code to test the deck class
		 */
		System.out.println("Expect false: " + d1.isEmpty());
		System.out.println("Expect all card names: \n" + d1.toString());
		d1.shuffle();
		System.out.println("Expect shuffled cards: \n" + d1.toString());
		for (int i = 1; i <= 52; i++)
			d1.deal();
		System.out.println("Expect true: " + d1.isEmpty());
		/*
		 * Code to test the card class
		 */
		System.out.println("Expect false: " + c1.isFaceUp());
		c1.turn();
		System.out.println("Expect true: " + c1.isFaceUp());
		System.out.println("Expect hearts: " + c1.getSuit());
		System.out.println("Expect 7: " + c1.getRank());
		System.out.println("Expect 4: " + c1.compareTo(c2));
		System.out.println("Expect 7 of Hearts: " + c1.toString());
		
	}
	

	
}
