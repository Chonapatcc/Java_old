import java.util.Scanner;
public class Operator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input num1 and num2 : ");
        float a=sc.nextInt(), b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(b%a);
        System.out.println((a+b)+(a-b));
    }
    
}
