import java.util.*;
public class Card {
    public int suit, pip;
    private String[] suits = {"clubs",  "diamonds","hearts", "spades"};
    private String[] cardValue = {"","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};



    Card(int values, String type) {
        this.pip = values;
        this.suit = Arrays.asList(suits).indexOf(type);

    }

    public String display() {

        String finalCard = cardValue[pip] + " of " + suits[suit];
        return finalCard;
    }

    public String compare(Card a,Card b ){
        String greatest=" ";
        if(a.pip > b.pip){
            greatest = "c1";
        }else if(a.pip<b.pip){
            greatest = "c2";
        }else if(a.pip == b.pip){
            if(a.suit >b.suit){
                greatest = "c1";
            }else
                greatest = "c2";   
        }
        return greatest;      
    }


}
