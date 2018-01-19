import java.util.Scanner;
public class SignalReport {
    public static void main(String[] args) {
    String[] S = {"Faint signals, barely perceptible",
    "Very weak signals",
    "Weak signals",
    "Fair signals",
    "Fairly good signals",
    "Good signals",
    "Moderately strong signals",
    "Strong signals",
    "Extremely strong signals"};
  
    String[] R = {"Unreadable",
    "Barely readable, occasional words distinguishable",
    "Readable with considerable difficulty",
    "Readable with practically no difficulty",
    "Perfectly readable"};
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter The Numbe");
    int n = input.nextInt();
    int x,y;
    if (n>=11&&n<=59) {
      x = n%10-1;
      y = n/10-1;
      System.out.println(S[x]+","+R[y]+".");
    }else {
      System.out.println("The input is incorrect, please enter the number 11-59");
    }
}
}