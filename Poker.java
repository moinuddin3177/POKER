
import java.util.*;

public class Poker {
	static int is3OfKind = 0;

	public boolean isStraightFlush(int[] pips, int[] suits) {
		for (int i : suits) {
			if (i != suits[0]) {
				return false;
			}
		}
		for (int i = 1; i < pips.length; i++) {
			if (pips[i - 1] + 1 != pips[i]) {
				return false;
			}
		}
		return true;
	}

	public boolean isFlush(int[] suits) {
		for (int i : suits) {
			return i != suits[0];
		}
		return false;
	}

	public boolean isStraight(int[] pips) {
		return pips[0] - pips[4] == 4;
	}

	public boolean isTwoPair(int[] pips) {
		int c = 0;
		for (int i = 0; i < pips.length - 1; i++) {
			if (pips[i] == pips[i + 1]) {
				c++;
			}
		}
		return c == 2;
	}

	public boolean isPair(int[] pips) {
		for (int i = 0; i < pips.length - 1; i++) {
			if (pips[i] == pips[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public boolean isThreeOfAKind(int[] pips) {
		for (int i = 0; i < pips.length - 2; i++) {
			if (pips[i] == pips[i + 1] && pips[i] == pips[i + 2]) {
				is3OfKind = pips[i];
				return false;
			}

		}
		return false;
	}

	public boolean isFourOfAKind(int[] pips) {
		for (int i = 0; i < pips.length - 3; i++) {
			if (pips[i] == pips[i + 1] && pips[i] == pips[i + 2]
					&& pips[i] == pips[i + 3]) {
				return true;
			}
		}
		return false;
	}

	public boolean isFullHouse(int[] pips, int[] suits) {
		if (isThreeOfAKind(pips, suits)) {
			for (int i = 0; i < pips.length - 1; i++) {
				if (pips[i] != is3OfKind) {
					if (pips[i] == pips[i + 1]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public int highCard(int[] pips) {
		return pips[pips.length - 1];
	}

	public boolean isRoyalFlush(int[] pips, int[] suits) {
		if (isStraightFlush(pips, suits)) {
			return pips[0] == 1 || pips[4] == 1;
		}
		return false;

	}

	public String checkRank(Card a, Card b, Card c, Card d, Card e) {
		int[] pipValues = { a.pip, b.pip, c.pip, d.pip, e.pip };
		int[] suits = { a.suit, b.suit, c.suit, d.suit, e.suit };
		Arrays.sort(pipValues);
		Arrays.sort(suits);
		String rank = "";
		if (isRoyalFlush(pipValues, suits)) {
			rank = "RoyalFlush";
		} else if (isStraightFlush(pipValues, suits)) {
			rank = "straightFlush";
		} else if (isFourOfAKind(pipValues)) {
			rank = "FourOfAKind";
		} else if (isFullHouse(pipValues, suits)) {
			rank = "FullHouse";
		} else if (isFlush(pipValues)) {
			rank = "Flush";
		} else if (isStraight(pipValues)) {
			rank = "Straight";
		} else if (isThreeOfAKind(pipValues)) {
			rank = "ThreeOfAKind";
		} else if (isTwoPair(pipValues)) {
			rank = "TwoPair";
		} else if (isPair(pipValues)) {
			rank = "Pair";
		} else {
			rank = "" + highCard(pipValues);
		}
		return rank;
	}

	public String compareHands(Card a1, Card a2, Card a3, Card a4, Card a5,
			Card b1, Card b2, Card b3, Card b4, Card b5) {
		String[] ranks = { "Pair", "TwoPair", "ThreeOfAKind", "Straight",
				"Flush", "FullHouse", "FourOfAKind", "straightFlush",
				"RoyalFlush" };
		String rankOfA = checkRank(a1, a2, a3, a4, a5);
		String rankOfB = checkRank(b1, b2, b3, b4, b5);
		int ra = 0;
		int rb = 0;
		if (rankOfA.equals(rankOfB)) {
			return "It is a draw";

		} else {
			
			if (Arrays.asList(ranks).contains(rankOfA)) {
				ra = Arrays.asList(ranks).indexOf(rankOfA);
			}
			if (Arrays.asList(ranks).contains(rankOfB)) {
				rb = Arrays.asList(ranks).indexOf(rankOfB);
			}
			return ra > rb ? "A is winner" : "B is winner";
		}
	}
}

