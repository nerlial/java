package school;
import java.util.Scanner;

//学生接口
interface StudentManageInterface{
	public abstract double setFee(double fee);
	public abstract double getFee();
}
//教师接口
interface TeacherManageInterface{
	public abstract double setPay(double pay);
	public abstract double getPay();
}
//研究生类
class Graduate implements StudentManageInterface,TeacherManageInterface{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	//接口方法
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
		System.out.print("工资：");
		double pay=(double)(input.nextInt());
		zhangsan.setPay(pay);
		System.out.print("学费：");
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
