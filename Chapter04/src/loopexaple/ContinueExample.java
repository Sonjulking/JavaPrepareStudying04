package loopexaple;

public class ContinueExample { //1부터 짝수만 더해주는 예제

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num ++) {
			if((num % 2) == 1) {
				continue;
			}
			total += num;
		}
		System.out.println(total);
	}

}
