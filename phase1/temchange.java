import java.util.Scanner;
public class temchange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // f => c
        System.out.print("Input your F");
        Float f=sc.nextFloat();
        float c=(f-32)*5/9;
        System.out.println("C = "+c);
        
    }
    
    
}
