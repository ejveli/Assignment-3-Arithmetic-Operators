package assignment_3;

public class Question_5 {

	public static void main(String[] args) {

		
		int hours,minutes,second;
		int inputSecond=3695;
		
		hours=inputSecond/3600;
		minutes=(inputSecond-hours*3600)/60;
		second=((inputSecond-hours*3600-minutes*60))%60;
		
		System.out.println("inputSecond is "+inputSecond);
		System.out.println(hours+" hours "+minutes+" minutes "+second+" seconds");
		
	}

}
