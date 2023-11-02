import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("sum is : " + Sum(a,b));
    }
    public static int Sum(int n,int m){
        int sum = n+m;
        return sum;
    }
}