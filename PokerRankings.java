   
    
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



      }
