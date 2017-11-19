package 日期转换;

import java.util.*;
import java.text.*;

public class Riqi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入时间（格式为yyyy/mm/dd）:");
		String Exdate = in.next();
		// 注意：SimpleDateFormat构造函数的样式与strDate的样式必须相符
		DateFormat a = new SimpleDateFormat("yyyy/mm/dd");
		DateFormat b = new SimpleDateFormat("yyyy年mm月dd日");
		in.close();

		try {
			Date date = a.parse(Exdate);// 将输入的yyyy/mm/dd格式转为Date格式
			String c = b.format(date);// 将Date格式转换为字符串
			System.out.println(c);
		} 
		catch (ParseException e) {
			e.printStackTrace();
			System.out.println("您输入的日期格式有误");
		}
	}
}
