package javaÕûÊı;

public class Test1 {
	public static void main(String[] args) {
		douzheng(1356); 
	}

	public static void douzheng(int n) 
	{ 
	System.out.println(n); 
	if (n<=5000) 
	{ 
		douzheng(n*2); 
	}
	System.out.println(n); 
	}
}