import java.util.Scanner;
public class InputNextLine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Name : ");
        // next ตรวจว่ามีจ้อความไหม ไม่สน space
        String name=sc.nextLine();
        System.out.println(name);
    }
    
}
