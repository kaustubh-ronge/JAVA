import java.util.Scanner;

public class LinearSearchString{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine() ;

        System.out.println("Enter charater to be searched");
        char ch=sc.next().charAt(0);

        LinearSearchString ls=new LinearSearchString();

        int ans=ls.linearSearch(str,ch);

        if(ans==-1){
            System.out.println("Character not found");
        }else{
            System.out.println(ans);
        }

    }

    public int linearSearch(String str, char ch){
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

}