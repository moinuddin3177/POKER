import java.util.*;
public class Poker {
    static int is3OfKind = 0;
    public  boolean isStraightFlush(int[] pips, int[] suits) {
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
    public  boolean isFlush(int[] pips, int[] suits) {
        for (int i : suits) {
            if(i != suits[0]) {
                return false;
            }
        }
        return true;
    }
    public  boolean isStraight(int[] pips, int[] suits) {
        for (int i = 1; i < pips.length; i++) {
            if (pips[i-1] + 1 != pips[i]) {
                return false;
            }
        }
        return true;
    }
    public  boolean isTwoPair(int[] pips, int[] suits) {
        int c = 0;
        for (int i = 0; i < pips.length-1; i++) {
            if(pips[i] == pips[i+1] ) {
                c++;
            }
        }
        return c == 2;
    }
    public  boolean isPair(int[] pips, int[] suits) {
        int c = 0;
        for (int i = 0; i < pips.length-1; i++) {
            if(pips[i] == pips[i+1] ) {
                c++;
            }
        }
        return c == 1;
    }
    public  boolean isThreeOfAKind(int[] pips, int[] suits) {
        int c = 0;
        for (int i = 0; i < pips.length-2; i++) {
            if(pips[i] == pips[i+1] && pips[i] == pips[i+2]) {
                c++;
                is3OfKind = pips[i];
            }
           
        }
        return c == 1;
    }
    public  boolean isFourOfAKind(int[] pips, int[] suits) {
        int c = 0;
        for (int i = 0; i < pips.length-3; i++) {
            if(pips[i] == pips[i+1] && pips[i] == pips[i+2] && pips[i] == pips[i+3]) {
                c++;
            }
        }
        return c == 1;
    }
    public boolean isFullHouse(int []pips,int[] suits){
        int n=0;
        if(isThreeOfAKind(pips,suits)){
        for (int i = 0; i < pips.length-1; i++) {        
            if(pips[i] != is3OfKind){
                if(pips[i] == pips[i+1]){
                    n++ ;
                }
            }
        }
    }
        return n==1;
    }
    public  int highCard(int[] pips, int[] suits) {
        return pips[pips.length-1];
    }
    public  boolean isRoyalFlush(int[] pips, int[] suits) {
        if (pips[0] == 1 ) {
            for (int i = 1; i < pips.length; i++) {
                if (pips[i] != 9+i) return false;
            }
            return true;
        }
        return false;

    }
