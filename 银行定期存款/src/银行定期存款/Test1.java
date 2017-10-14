package 银行定期存款;

class DepositAccount {
	private String number;            //账号
	private String name;              //姓名
	private double left;             //余额
	static double interest;          //年利率

	public static void setInterest(double d ) {      //设置年利率
		interest = d;
	}
	
	public double calYearInterest() {      //计算年利息
		return left * interest;
	}
	
	public DepositAccount(String num,String na,double le) {    //开户
		number = num;
		name = na;
		left = le;
	}

	public void cun(double cash) {          //存款
		System.out.println("您账户原有余额：" + left);
		System.out.println("您现在存入：" + cash);
		left += cash;
		System.out.println("存款成功，您的余额是：" + left);
	}
	public void c_rely() {           //查询余额
		System.out.println("您的余额是：" + left);
	}	
}

public class Test1 {
	public static void main(String args[]) {
	   DepositAccount saver = new DepositAccount("1234567890","Zhang San",5000);
	   saver.c_rely();            //查询余额
	   DepositAccount.setInterest(0.023);  //设置年利率
	   saver.cun(2000);               //存入2000元
	   System.out.println("年利息是：" + saver.calYearInterest());
	}
}