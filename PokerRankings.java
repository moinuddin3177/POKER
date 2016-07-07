   
    
    public class PokerRankings {



          public boolean isStraightFlush(int[] pips, int[] suits) {
		
		for (int i : suits) {
			
			if(i != suits[0]) {
				return false;
			}
		}
		
		for (int i = 1; i < pips.length; i++) {
			if (pips[i-1] + 1 != pips[i]) {
				return false;
			}
		}
			
		return true;
		
	  }

          public static boolean isThreeOfAKind(int[] pips, int[] suits) {
		
		int c = 0;
		for (int i = 0; i < pips.length-2; i++) {
			
			if(pips[i] == pips[i+1] && pips[i] == pips[i+2]) {
				c++;
			}
			
		}
		
		return c == 1;
	}
	
        public static int highCard(int[] pips, int[] suits) {
		
		return pips[pips.length-1];
	}


      }
