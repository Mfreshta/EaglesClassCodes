package selection;

public class ConditionalOperators {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 15;

		String x = num1 > num2 ? "num1 is more than num2" : "num1 is less num2";

		int y = num1 > num2 ? num1-- : num1++;
		
		
//		conditions ? true : false; 
		System.out.println(x);
		
		
		double grade = 59;
		String s = "The student is ";
		s += (grade >= 60) ? "passing." : "failing.";
		
		
		int t = 1;
		
		
		
		t += 10;  // 11
		t = t + 10;
		
		System.out.println(t);
		
		
		System.out.println(s);
	}

}
