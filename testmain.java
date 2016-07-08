public class testmain {
public static void main(String[] args) {

       
        Card a1= new Card(10, "clubs");
        Card a2 = new Card(10,"diamonds");
        Card a3= new Card(10, "spades");
        Card a4 = new Card(8,"clubs");
        Card a5= new Card(10, "hearts");
       
        Card b1 = new Card(1,"clubs");
        Card b2= new Card(1, "diamonds");
        Card b3 = new Card(6,"spades");
        Card b4= new Card(6, "hearts");
        Card b5 = new Card(5,"clubs");
       
        Poker p1 = new Poker();
       
        System.out.println(p1.checkRank(a1, a2, a3, a4, a5));
        System.out.println(p1.checkRank(b1, b2, b3, b4, b5));
        System.out.println(p1.compareHands(a1, a2, a3, a4, a5, b1, b2, b3, b4, b5));
    }
}
