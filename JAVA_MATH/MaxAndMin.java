import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entern Number:" + " ");
        int x = sc.nextInt();
        int max=0;
        int min=0;
        while(x!=0){
         int digit=x%10;
         if(digit>max){
            max=digit;
         }
         else{
            min=digit;
         }
         x=x/10;
        }
        System.out.print("max"+" "+max);
        System.out.println();
        System.out.print("min"+" " +min);
    }
}
