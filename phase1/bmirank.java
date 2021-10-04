import java.util.Scanner;
public class bmirank{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Weight = ");
    float weight=sc.nextFloat();
    System.out.print("Height = ");
    float height=sc.nextFloat();
    height/=100;
    float bmi=weight/(height*height);
    if (bmi>=50){System.out.println("OK");}
    else;{System.out.println("Bad");}


    }
}