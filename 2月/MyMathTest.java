import java.util.Scanner;

class MyMath {
	public int add (int a,int b) {
		return  a+b;
	} 
	public int sub (int a,int b) {
		return  a-b;
	} 
	public int mul (int a,int b) {
		return  a*b;
	} 
	public int dvr (int a,int b) {
		return  a/b;
	} 
}
class MyMathTest {
	public static void  main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the first number:");
	    int a = sc.nextInt();

	    System.out.println("Please enter the second number:");
	    int b = sc.nextInt();

	    MyMath mm = new MyMath();
		System.out.println("addresult:"+mm.add(a,b));
		System.out.println("subresult:"+mm.sub(a,b));
		System.out.println("mulresult:"+mm.mul(a,b));
		System.out.println("dvrresult:"+mm.dvr(a,b));
	}
}