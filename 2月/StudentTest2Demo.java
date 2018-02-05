class Student {
	private String name;
	private int age;
	public Student(){}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println(name+"----"+age);
	}
}
class StudentTest2Demo{
	public static void main(String[] args) {
		Student s = new Student("wangbin",24);
		s.show();
	}
}
class ExtendsTestDemo {}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("wangerdiao");
		s1.setAge(24);
		System.out.println(s1.getName()+"----"+s1.getAge());
		s1.show();
	}
}