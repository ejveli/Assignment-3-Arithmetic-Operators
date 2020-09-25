package assignment_3;

public class Question_7 {

	public static void main(String[] args) {

		
		int quarters,dimes,nikles;
		int price=95;
		
		quarters=(100-price)/25;
		dimes=((100-price)-quarters*25)/10;
		nikles=((100-price)-(quarters*25)-(dimes*10))/5;
				
				
				
		System.out.println("Price in cents : "+price);
		System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nikles+" nikles");
		
		
	}

}
