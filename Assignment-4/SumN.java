import java.util.Scanner;
public class SumN{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("enter number: ");
        int n = in.nextInt();
        System.out.println("sum of n natural number is: " + " " + Sum(n));
    }
    static int Sum(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}