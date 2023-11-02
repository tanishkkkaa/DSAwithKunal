import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = in.nextInt();
        System.out.println("factoial is: " + Factorial(n));
    }
    public static int Factorial(int a){
        int f=1;
        for(int i=2;i<=a;i++){
            f=f*i;
        }
        return f;
    }
}