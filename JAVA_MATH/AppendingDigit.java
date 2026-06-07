public class AppendingDigit{
    public static void main(String[] args) {
        int n=-413;

        int d=1;
        int res=0;

        if(n<0){
            n=-1*n;
            res=n*10+d;
            res=-1*res;
            System.out.println(res);
            return ;
        }else{
            res=n*10+d;
            System.out.println(res);

        }
    }
}