import java.util.Scanner;
public class PrimeN{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i = (a+1); i< b;i++){
        Prime(i);
        }
    }
    public static void Prime(int n){
        int count = 0;
        for(int i=2;i<=n/2;i++){
            if (n%i==0){
                count++;
                break;
            }  
        }
        if(count==0){
            System.out.println(n + " " + "is a" + " " + "Prime number");
        }else{
            System.out.println(n + " " + "is " + " " + "not a Prime number");
        }
    }
}