package loopexaple;

public class WhileExample2 {

	public static void main(String[] args) {

		int dan = 2;
		int times = 1;

		while (dan <= 9) {
			if ((dan % 2) != 0) {
				dan++;
				continue;
			}
			System.out.println(dan + "��");
			times = 1; // �� �ʱ�ȭ�� ����ߵȴ�..!!
			while (times <= 9) {
				if(times > dan) break;
				System.out.println(dan + "X" + times + "=" + dan * times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
