import java.util.*;

public class Card {
	int suit;
	int pip;
	private String[] suits = { "clubs", "diamonds", "hearts", "spades" };
	private String[] cardValue = { "", "Ace", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Jack", "Queen", "King" };

	Card(int values, String type) {
		this.pip = values;
		this.suit = Arrays.asList(suits).indexOf(type);

	}

	public String display() {

		String finalCard = cardValue[pip] + " of " + suits[suit];
		return finalCard;
	}

	public int compare(Card c) {
		return pip - c.pip;

	}

}
