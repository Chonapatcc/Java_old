import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number : ");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("EVEN");

        }
        else{
            System.out.println("ODD");
        }
    }
    
}
