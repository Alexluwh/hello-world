package decide;

import java.util.Scanner;

public class Decide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ʼ��
		Scanner in = new Scanner(System.in);

		System.out.println(5 == 5.0);
		double a = 1.0;
		double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(a == b);
		System.out.println("a=" + a + ";b=" + b);
		System.out.println(Math.abs(a - b) < 1e-6);

//		������Ͷ�ҽ��

		System.out.print("��Ͷ�ң�");
		int amount = in.nextInt();
		System.out.println(amount);
		System.out.println(amount >= 10);
		if (amount >= 10) {
			// ��ӡ��Ʊ
			System.out.println("*Java�Ǽ���·ר��*");
			System.out.println("Ʊ�ۣ�10Ԫ");
			// ���㲢��ӡ����
			System.out.println("���㣺" + (amount - 10));
		}

//		��֧ switch case
		int type = in.nextInt();
		switch (type) {
		case 1:
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("���Ϻ�");
		case 4:
			System.out.println("�ټ�");
			break;
		default:
			System.out.println("����ʲô����");
			break;
		}

	}

}