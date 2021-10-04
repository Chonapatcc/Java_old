import java.util.Scanner;
public class Assignment1Bmi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Your weight(kg): ");
        float weight=sc.nextInt();
        System.out.print("Your Height(cm) : ");
        float height=sc.nextInt();
        height/=100;
        float bmi=weight/(height*height);
        System.out.println("Your bmi = "+bmi);


    }

}
