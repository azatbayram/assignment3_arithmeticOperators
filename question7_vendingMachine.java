package assignment3_arithmeticOperators;

public class question7_vendingMachine {

	public static void main(String[] args) {
		
		int price=95;
		int quarters=0;
		int dimes=0;
		int nickles=0;
		
	    quarters=(100-price)/15;
	    dimes=(100-price-(quarters*15))/10;
	    nickles=(100-price-(quarters*15)-(dimes*10))/5;
	
	   
		System.out.println("Price in cents : " + price);

	    System.out.println("Your change is " +  quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");  

	    
	    /* Note: We can do the same work with this code too
		int price=95;
		int quarters=0;
		int dimes=0;
		int nickles=0;
		
		if((100-price)%15==0) {
			
			quarters=(100-price)/15;
		}
		else if ((100-price)%10==0) {
			
			dimes=(100-price)/10;
		}
	    else {
	    	quarters=(100-price)/15;
	    	dimes=(100-price-(quarters*15))/10;
	    	nickles=(100-price-(quarters*15)-(dimes*10))/5;
	
	    }
		
		System.out.println("Price in cents : " + price);

	    System.out.println("Your change is " +  quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles"); 
	      
	     */
	}

}
