package company;

abstract class Employee{//������
	public abstract double earning();
}
//������нˮ
class YearWorker extends Employee{
	public double earning() {
		
		return 120000;
	}
}
//������нˮ
class MonthWorker extends Employee{
	public double earning() {
		
		return 10000;
	}
}
//������нˮ
class WeekWorker extends Employee{
	public double earning() {
		
		return 2500;
	}
}
public class Company {
	public static void main(String[] args) {
		Employee[] employee=new Employee[3];
		employee[0]=new YearWorker();
		employee[1]=new MonthWorker();
		employee[2]=new WeekWorker();
		System.out.println(employee[0].earning()+employee[1].earning()+employee[2].earning());
	}
}