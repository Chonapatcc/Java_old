import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("A : ");
        int a=sc.nextInt();
        System.out.print("B : ");
        int b=sc.nextInt();
        System.out.print("C : ");
        int c=sc.nextInt();
        if(a>b){
            if (a>c){
                System.out.println("A is the highest = "+a);
            }
            else{
                System.out.println("C is the highess = "+c);
            }
        }
        else if (a<b){
            if (b>c){
                System.out.println("B is the highess = "+b);
            }
            else{
                System.out.println("C is the highess = "+c);
            }
        }
        else{
            System.out.println("Same");
        }


    }
    
}
