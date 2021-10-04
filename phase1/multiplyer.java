import java.util.Scanner;
public class multiplyer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int num=sc.nextInt();
        for(int a=1;a<=num;a++){
            for(int b=1;b<=12;b++){
                System.out.println(a+" * "+b+" = "+a*b);
            }
        }

    }
    
}
