import java.util.Scanner;
public class OddandEven{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = in.nextInt();
        Oddeven(a);
    }
    public static void Oddeven(int n){
        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}