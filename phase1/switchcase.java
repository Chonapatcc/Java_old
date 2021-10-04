import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Month : ");
        int month=sc.nextInt();
        String name;
        

        switch(month){
            case 1:
                name="jan";
                break;
            case 2:
                name="Feb";
                break;
            default:
                name="Others day";
                break;
        }
        System.out.println(name);
    }
    
}
