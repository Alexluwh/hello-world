package circulate;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
//		while (number>0) {
//			number=number/10;
//			count=count+1;
//		}
		do {
			number = number / 10;
			count = count + 1;
		} while (number > 0);
		System.out.println(count);
	}

}
