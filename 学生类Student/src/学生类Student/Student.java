package 学生类Student;

class Student {        //Student类

	private String name, degree;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Student(String a, int b, String c) {
		this.name = a;
		this.age = b;
		this.degree = c;
	}

	public void show() {
		System.out.println("name:" + name + " age:" + age + " degree:" + degree);
	}
}

class Undergraduate extends Student {        //本科生类
	private String specialty;
	
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Undergraduate(String a, int b, String c, String d) {
		super(a, b, c);
		this.specialty = d;
	}

	public void show() {        
		System.out.println(
				"name:" + getName() + " age:" + getAge() + " degree:" + getDegree() + " specially:" + getSpecialty());
	}
}

class Graduate extends Student {            //研究生类
	
	private String direction;
	
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Graduate(String a, int b, String c, String d) {
		super(a, b, c);
		this.direction = d;
	}

	public void show() {
		System.out.println(
				"name:" + getName() + " age:" + getAge() + " degree:" + getDegree() + " direction:" + getDirection());
	}
}

class test {
	public static void main(String[] args) {
		Undergraduate a = new Undergraduate("王红", 20, "本科生", "软件工程");
		a.show();
		
		Graduate b = new Graduate("李明", 23, "研究生", "计算机应用");
		b.show();
	}
}