package loopexaple;

public class ForExample {

	public static void main(String[] args) {

		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) {
			sum += num;
		}
		/*	for(num = 1, sum = 0; num <= 10; ) {
			sum += num;
		}
		for( ; ; ) =>while(true)¶û °°À½
		 */
		System.out.println(sum);
		System.out.println(num);
	}

}
