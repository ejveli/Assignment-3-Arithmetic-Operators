package assignment_3;

public class Question_4 {

	public static void main(String[] args) {

		int num1=10,num2=20;
		
		System.out.println("n1="+num1+"\nn2="+num2);
		System.out.println("---------------------");
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("n1="+num1+"\nn2="+num2);
		
	}

}
