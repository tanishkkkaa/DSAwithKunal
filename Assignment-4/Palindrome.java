import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int a = in.nextInt();
        Palindrome(a);
    }
    public static void Palindrome(int n){
        int reverse=0,temp = n,remainder;
        if(n>0){
        remainder = n%10;
        reverse = reverse*10+remainder;
        n = n/10;
        }
        if(reverse==temp){
            System.out.println("palindrome number");
        }else{
            System.out.println("not a palindrome number");
        }
    }
}