public class Num {      
    public static void main(String[] args) {         
        String str=JOptionPane.showInputDialog("请输入您要判断的年份；");    
            
        int y = Integer.parseInt(str);    
            
        System.out.println("您输入的年份为："+y);    
          
        String strm = JOptionPane.showInputDialog("请输入你要判断的月份为；");  
          
        int m = Integer.parseInt(strm);  
          
        System.out.println("您输入的月份为："+m);  
          
           
        if (jud ( y ))     
        {    
            System.out.println(y+"是闰年.");    
        }    
        else     
        {    
            System.out.println(y+"不是闰年");    
        }    
        int d = fig(m);  
          
        if (jud(y))  
        {  
            if (m == 2)  
            {  
                ++d;  
            }  
            System.out.println("您输入该月份的天数为："+d);  
         }  
        else  
        {  
            System.out.println("您输入该月份的天数为："+d);  
        }  
          
          
    }    
              
        
    public static boolean jud (int y)    
    {    
        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)    
        {    
            return true;    
        }    
        else    
        {    
            return false;    
        }      
    }    
      
      
      
   public static int fig(int m)  
   {  
    switch (m)  
    {  
        case 1:  
            return 31;  
        case 2:  
            return 28;  
        case 3:  
            return 31;  
        case 4:  
            return 30;  
        case 5:  
            return 31;  
        case 6:  
            return 30;  
        case 7:  
            return 31;  
        case 8:  
            return 31;  
        case 9:  
            return 30;  
        case 10:  
            return 31;  
        case 11:  
            return 30;  
        case 12:  
            return 31;  
        default:  
        System.out.println("对不起，您输入的月份有误！");  
        return 0;  
    }  
   }  
}   