public class Array {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
        numbers[1]=2000;
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
        int s=numbers.length;
        System.out.println(s);
    }

    
}
