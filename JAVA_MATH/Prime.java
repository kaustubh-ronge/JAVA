import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entern Number:" + " ");
        int x = sc.nextInt();

        if(x<=1){
System.out.println("Prime");        }

        for(int i=2;i<x;i++){
            if(x%i==0){
             System.out.println("Not prime");
            }
        }

System.out.println("Prime");    }
}
