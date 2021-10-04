public class Array2 {
    public static void main(String[] args){
        String[][] animals={{"cat","dog",},{"bat","bird"},{"fish","whale"}};
        for(String[] animal:animals){
            for(String name:animal){
                System.out.println(name);
            }
        }
    }
    
}
