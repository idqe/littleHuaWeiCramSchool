import java.util.Scanner;

class jiaMiDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first data(Less than 8 digits):");
		int number = sc.nextInt();
		String reulest =jiaMi (number);
        System.out.println("encrypted:"+reulest);
    }
		public static String jiaMi (int number) {

		int arr[]=new int [8];
		int index =0;

		while (number>0) {
			arr [index] = number%10;
			index++;
			number/=10;
		}
		for(int x=0; x<index; x++) {
			arr[x] +=5;
			arr[x] %=10;
		}
		   int temp = arr[0];
		    arr [0] =arr [index-1];
            arr[index-1]= temp; 
            String s ="";
			for(int x=0; x<index; x++) {
			s += arr [x];
		}
		    return  s;
	}
}