package circulate;

import java.util.Scanner;

public class Guess_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//[0,1)-->[0,100)-->[1,100]
		int number = (int) (Math.random() * 100 + 1);
		int a;
		int count=0;
		do {
			a=in.nextInt();
			count=count+1;
			if (a>number) {
				System.out.println("ƫ��");
			} else {
				System.out.println("ƫС");
			}
		} while (a!=number);
		System.out.println("��ϲ��¶��ˣ������"+count+"��");
	}

}
