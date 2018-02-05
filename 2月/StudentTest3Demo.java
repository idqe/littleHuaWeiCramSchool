class Student {
	private String name;
	private int age;
	public Student() {}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age  = age;
	}
	public void show() {
		System.out.println(name+"----"+age);
	}
}
class StudentTest3Demo{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("wangerdiao");
		s1.setAge(24);
		System.out.println(s1.getName()+"----"+s1.getAge());
		s1.show();
      
        Student s2 = new Student();
		s2.setName("wangbin");
		s2.setAge(25);
		System.out.println(s2.getName()+"----"+s2.getAge());
		s2.show();
	}
}