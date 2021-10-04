import java.util.Scanner;
public class Minmaxloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=1,a=0,b=0;
        while (n<=5){
            System.out.print("Times : ");
            int num=sc.nextInt();
            n++;
            if(num>b){
                if (a==0){
                    a=num;
                }
                b=num;
            }
            else if(num<a){
                a=num;
            }
            else{
                continue;
            }

        }
        System.out.println("Max = "+b+"Min = "+a);

    }    
}
