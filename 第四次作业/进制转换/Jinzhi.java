package ����ת��;
import java.util.Scanner;

public class Jinzhi{
	public static void main(String[] args) {
		try {
		System.out.println("������һ��ʮ��������");
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		long b=Long.parseLong(a,16);
		System.out.println("ת��Ϊ16����Ϊ��"+b);
		in.close();
		}
		catch(NumberFormatException a) {
			System.out.println("�������ݸ�ʽ����");
		}
	}
}