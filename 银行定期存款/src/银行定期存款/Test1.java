package ���ж��ڴ��;

class DepositAccount {
	private String number;            //�˺�
	private String name;              //����
	private double left;             //���
	static double interest;          //������

	public static void setInterest(double d ) {      //����������
		interest = d;
	}
	
	public double calYearInterest() {      //��������Ϣ
		return left * interest;
	}
	
	public DepositAccount(String num,String na,double le) {    //����
		number = num;
		name = na;
		left = le;
	}

	public void cun(double cash) {          //���
		System.out.println("���˻�ԭ����" + left);
		System.out.println("�����ڴ��룺" + cash);
		left += cash;
		System.out.println("���ɹ�����������ǣ�" + left);
	}
	public void c_rely() {           //��ѯ���
		System.out.println("��������ǣ�" + left);
	}	
}

public class Test1 {
	public static void main(String args[]) {
	   DepositAccount saver = new DepositAccount("1234567890","Zhang San",5000);
	   saver.c_rely();            //��ѯ���
	   DepositAccount.setInterest(0.023);  //����������
	   saver.cun(2000);               //����2000Ԫ
	   System.out.println("����Ϣ�ǣ�" + saver.calYearInterest());
	}
}