import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String name=sc.nextLine();
        
        System.out.println("Your input : "+name);
        System.out.print("Input number : ");
        int year=sc.nextInt();
        int age=2021-year;
        System.out.println("Your age : "+age);
        
        

    }
}
