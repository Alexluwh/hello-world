package circulate;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化
		int balance = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			// 请输入投币金额

			System.out.print("请投币：");
			int amount = in.nextInt();
			balance = balance + amount;
			System.out.println(amount);
			System.out.println(amount >= 10);
			if (balance >= 10) {
				// 打印车票
				System.out.println("*Java城际铁路专线*");
				System.out.println("票价：10元");
				// 计算并打印找零
				System.out.println("找零：" + (balance - 10));
				balance = 0;
			}
		}

	}

}
