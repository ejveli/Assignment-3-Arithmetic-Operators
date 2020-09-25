package assignment_3;

public class Question_6 {

	public static void main(String[] args) {

		int NumberOfMilligram=100;
		int lethalOverdose=10_000;
		int drink=lethalOverdose/NumberOfMilligram;
		
		System.out.println("Number of milligrams in drink: "+NumberOfMilligram);
		System.out.println("It would take about "+drink+" drinks for a lethal overdose");
		
	}

}
