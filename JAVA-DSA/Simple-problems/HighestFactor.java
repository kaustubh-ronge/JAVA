import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fc=0;
        for(int i=0;i<=n;i++){
            if(n%i==0){
                if (i==n) break;
                if(i>fc){
                   fc=i;
                 }
            }
           
        }
    }
}
