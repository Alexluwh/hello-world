package circulate;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ʼ��
		Scanner in = new Scanner(System.in);

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
	}

}