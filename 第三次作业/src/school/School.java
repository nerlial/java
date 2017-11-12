package school;
import java.util.Scanner;

//ѧ���ӿ�
interface StudentManageInterface{
	public abstract double setFee(double fee);
	public abstract double getFee();
}
//��ʦ�ӿ�
interface TeacherManageInterface{
	public abstract double setPay(double pay);
	public abstract double getPay();
}
//�о�����
class Graduate implements StudentManageInterface,TeacherManageInterface{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	//�ӿڷ���
	public double setPay(double pay) {
		return this.pay=pay;
	}
	public double getPay() {	
		return pay;
	}
	public double setFee(double fee) {
		return this.fee=fee;
	}
	public double getFee() {
		return fee;
	}
}
public class School {
	public static void main(String[] args) {
		Graduate zhangsan=new Graduate();
		Scanner input=new Scanner(System.in);
		System.out.print("���ʣ�");
		double pay=(double)(input.nextInt());
		zhangsan.setPay(pay);
		System.out.print("ѧ�ѣ�");
		double fee=(double)(input.nextInt());
		zhangsan.setFee(fee);
		input.close();
		double i;
		i=zhangsan.getPay()-zhangsan.getFee();
		if(i<2000) {
			System.out.println("privide a loan.");
		}else {
			System.out.println("Pay is more than fee");
		}
	}
}
