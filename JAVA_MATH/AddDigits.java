import java.util.*;

public class AddDigits{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Entern Number:" + " ");
     int x=sc.nextInt();
     int sum=0;
     while(x>0){
       int digit=x%10;
       sum=sum+digit;
       x=x/10;
     }
     System.out.print(sum);
    }
}