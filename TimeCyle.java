import java.util.Scanner;  
  
public class TimeCyle{  
  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        int bjt;  
        int g, s, b, q;  
        bjt = in.nextInt();  
        g = bjt % 10;  
        s = bjt % 100 / 10;  
        bjt = bjt / 100;  
        if(bjt < 8){  
            bjt = (bjt + 24 - 8);  
            System.out.print(bjt);  
            System.out.print(s);  
            System.out.println(g);  
        }  
        else if(bjt == 8)  
        {  
            if(s != 0)  
                System.out.print(s);  
            System.out.println(g);  
        }  
        else if(bjt > 8){  
            System.out.print(bjt - 8);  
            System.out.print(s);  
            System.out.println(g);  
        }  
    }  
  
}  