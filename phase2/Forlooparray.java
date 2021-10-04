import java.util.Scanner;
public class Forlooparray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many times do you want to type?  ");
        int times=sc.nextInt();
        int[] nums=new int[times];
        for(int a=0;a<times;a++){
            System.out.print(a+1+"times : ");
            nums[a]=sc.nextInt();
            System.out.println(a+1+" = "+nums[a]);
        }
        int max=0 ,min=0;
        // min and max
        for(int b=0;b<times;b++){
            if (max==0 && min==0){
                max=nums[b];
                min=nums[b];
            }
            else if  (nums[b]>max){
                max=nums[b];
            }
            else if (nums[b]<min){
                min=nums[b];
            }
            else{
                continue;
            }}
        System.out.println("Max = "+max+" Min = "+min);    

    }
    
}
