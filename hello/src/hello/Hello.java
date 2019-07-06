package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		/**输入、变量与赋值*/
		System.out.println("你好");
		Scanner in = new Scanner(System.in);
		// System.out.println("echo:"+in.nextLine());
		// System.out.println(2+3+"=2+3="+(2+3));
		// System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));
		// final int amount = 100;
		int amount = 100;
		int prise = 0;
		// amount=50;
		// System.out.println(prise);
		// int prise;
		System.out.print("请输入票面：");
		amount = in.nextInt();
		System.out.print("请输入金额：");
		prise = in.nextInt();
		System.out.println(amount + "-" + prise + "=" + (amount - prise));
		/**浮点数计算*/
		int foot=0;
//		double inch=0;
		int inch =0;
		System.out.println(1.2-1.1);
		foot = in.nextInt();
//		inch = in.nextDouble();
		inch = in.nextInt();
//		System.out.println((foot+inch/12)*0.3048);
		System.out.println((foot+inch/12.0)*0.3048);
		/**类型转换*/
//		System.out.println((int)(foot+inch/12.0)*0.3048*100);
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
		double b=10.3;
		int a=(int)b;
		
	}

}
