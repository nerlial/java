package ����ת��;

import java.util.*;
import java.text.*;

public class Riqi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ʱ�䣨��ʽΪyyyy/mm/dd��:");
		String Exdate = in.next();
		// ע�⣺SimpleDateFormat���캯������ʽ��strDate����ʽ�������
		DateFormat a = new SimpleDateFormat("yyyy/mm/dd");
		DateFormat b = new SimpleDateFormat("yyyy��mm��dd��");
		in.close();

		try {
			Date date = a.parse(Exdate);// �������yyyy/mm/dd��ʽתΪDate��ʽ
			String c = b.format(date);// ��Date��ʽת��Ϊ�ַ���
			System.out.println(c);
		} 
		catch (ParseException e) {
			e.printStackTrace();
			System.out.println("����������ڸ�ʽ����");
		}
	}
}
