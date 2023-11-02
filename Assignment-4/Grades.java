import java.util.Scanner;
public class Grades{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter marks out of 100: ");
        int marks = in.nextInt();
        Grades(marks);
    }
    public static void Grades(int marks){
        if (marks>90){
            System.out.println("AA");
        }else if (marks>80){
            System.out.println("AB");
        }else if (marks>70){
            System.out.println("BB");
        }else if (marks>60){
            System.out.println("BC");
        }else if (marks>50){
            System.out.println("CD");
        }else if (marks>40){
            System.out.println("DD");
        }else{
            System.out.println("Fail");
        }
    }
}