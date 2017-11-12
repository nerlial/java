package company;

abstract class Employee{//抽象类
	public abstract double earning();
}
//按年领薪水
class YearWorker extends Employee{
	public double earning() {
		
		return 120000;
	}
}
//按月领薪水
class MonthWorker extends Employee{
	public double earning() {
		
		return 10000;
	}
}
//按周领薪水
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