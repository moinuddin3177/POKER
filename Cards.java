public class Cards {
    private int type, value;
    private String[] suit = {"Clubs",  "Diamonds","Hearts", "Spades"};
    private String[] cardValue = {"","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

     Cards(int values, int types) {
        this.type = types; 
        this.value = values;
    }
     
    public String display() {
        String finalCard = cardValue[value] + " of " + suit[type];

        return finalCard;
    }
    
    public static String compare(Cards a,Cards b ){
    	String greatest=" ";
    	if(a.value > b.value){
    		greatest = a.display();
    	}else if(a.value<b.value){
    	greatest = b.display();
    	}else if(a.value == b.value){
    		if(a.type >b.type){
    			greatest = a.display();
    		}else
    			greatest = b.display();	
    	}
    	return greatest;   	
    }
    public static void main(String[] args)
    {
        Cards c1= new Cards(6,2);
        Cards c2 = new Cards(6,1);
        System.out.println(c1.compare(c1,c2));
        


    }
    
    
    
    
}





