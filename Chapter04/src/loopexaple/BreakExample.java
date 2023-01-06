package loopexaple;

public class BreakExample {

	public static void main(String[] args) {

		int sum1 = 0;
		int num1 = 1;
		
		while(true) {
			sum1 += num1;
			if(sum1 > 100)
				break;
			num1 ++;
		}
		System.out.println(sum1);
		System.out.println(num1);
		
		int sum2 = 0;
		int num2 = 1;
		
		while(sum2 < 100) {
			sum2 += num2;
			num2++;
		}
		System.out.println(sum2);
		System.out.println(num2);
	}

}
