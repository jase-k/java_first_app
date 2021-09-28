public class TestPuzzling{
    public static void main(String[] args){
        PuzzleJava app = new PuzzleJava();
        app.getTenRolls();
        System.out.println("=============Get Random Letter==============");
        System.out.println(app.getRandomLetter());
        app.generatePassword();
        app.generatePassword(16);
        Integer[] numList = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("=============Get Shuffle List ==============");
        System.out.println(app.shuffleArray(numList));
    }
}