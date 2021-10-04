import java.util.Scanner;
public class Assignment6{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Money : ");
    int money=sc.nextInt();
    int b1000=0,b500=0,b100=0;
    while (true){
        if (money>=1000){
            b1000+=1;
            money-=1000;
        }
        else if(money>=500){
            b500+=1;
            money-=500;
        }
        else if (money>=100){
            b100+=1;
            money-=100;
        }
        else{
            break;
        }
    }
    System.out.println("1000 = "+b1000+" 500 = "+b500+" 100 = "+b100);
    }
}
    