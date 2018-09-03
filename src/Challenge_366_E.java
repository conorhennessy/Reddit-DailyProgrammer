import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge_366_E {
    public static Boolean wordFunnel(String fWord, String sWord){
        for (int i = 0; i < fWord.length(); i++){
            String newWord = fWord.substring(0, i) + fWord.substring(i + 1, fWord.length());
            if (newWord.equals(sWord)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> bonus(String fileName, String Word) throws FileNotFoundException {
        List<String> wordList = new ArrayList<>();
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextLine()){
            String cWord = input.nextLine();
            for (int i = 0; i < Word.length(); i++){
                String newWord = Word.substring(0, i) + Word.substring(i + 1, Word.length());
                if (newWord.equals(cWord)) { wordList.add(cWord); }
            }
        }
        return wordList;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(wordFunnel("aapple","apple"));
        System.out.println(bonus("src/enable1.txt", "boats"));
    }
}