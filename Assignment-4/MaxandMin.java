import java.util.Scanner;
public class MaxandMin{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int largest = largest(a,b,c);
        int smallest = smallest(a,b,c);
        System.out.println("largest number is" + " " + largest);
        System.out.println("smallest number is" + " " + smallest);
    }
        public static int largest(int a,int b,int c){
            int max = a;
            if(b>max){
                max = b;
            }
            if(c>max){
                max = c;
            }
            return max;
        } 
        public static int smallest(int a,int b,int c){
            int min = a;
            if(b<min){
                min = b;
            }
            if(c<min){
                min = c;
            }
            return min;
        } 
}