package 进制转换;
import java.util.Scanner;

public class Jinzhi{
	public static void main(String[] args) {
		try {
		System.out.println("请输入一个十进制数：");
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		long b=Long.parseLong(a,16);
		System.out.println("转换为16进制为："+b);
		in.close();
		}
		catch(NumberFormatException a) {
			System.out.println("输入数据格式有误");
		}
	}
}