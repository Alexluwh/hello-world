package decide;

import java.util.Scanner;

public class Decide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		初始化
		Scanner in = new Scanner(System.in);

		System.out.println(5 == 5.0);
		double a = 1.0;
		double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(a == b);
		System.out.println("a=" + a + ";b=" + b);
		System.out.println(Math.abs(a - b) < 1e-6);

//		请输入投币金额

		System.out.print("请投币：");
		int amount = in.nextInt();
		System.out.println(amount);
		System.out.println(amount >= 10);
		if (amount >= 10) {
			// 打印车票
			System.out.println("*Java城际铁路专线*");
			System.out.println("票价：10元");
			// 计算并打印找零
			System.out.println("找零：" + (amount - 10));
		}

//		分支 switch case
		int type = in.nextInt();
		switch (type) {
		case 1:
		case 2:
			System.out.println("你好");
			break;
		case 3:
			System.out.println("晚上好");
		case 4:
			System.out.println("再见");
			break;
		default:
			System.out.println("啊，什么啊？");
			break;
		}

	}

}
