import java.util.Random; 
import java.util.Arrays;

public class PuzzleJava {
    public void getTenRolls(){
        Random randMachine = new Random();
        System.out.println("=============Get Random Numbers==============");
        for(int i = 0; i < 10; i++){
            System.out.printf("%s ", randMachine.nextInt(20)+1);
        }
        System.out.println("");
    }

    public static String getRandomLetter(){

        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random rand = new Random();


        int index = rand.nextInt(26);
        return abc[index];

    }

    public void generatePassword(){
        System.out.println("=============Generate Password ==============");
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String pw = ""; 

        Random rand = new Random();
        for(int i =0; i < 8; i++){
            pw += getRandomLetter();
        }

        System.out.println(pw);
    }
    public void generatePassword(int length){
        System.out.println("=============Generate Password ==============");
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String pw = ""; 

        Random rand = new Random();
        for(int i =0; i < length; i++){
            pw += getRandomLetter();
        }

        System.out.println(pw);
    }

    public String shuffleArray(Integer[] list){
        Random rand = new Random();
        for(int i = 0; i < list.length; i++){
            int index1 = rand.nextInt(list.length);
            int index2 = rand.nextInt(list.length);
            int temp = list[index1];
            list[index1] = list[index2];
            list[index2] = temp;
        }
        System.out.println(strList);
        return strList;
    }

}