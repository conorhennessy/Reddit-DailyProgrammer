import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge_366_I {
    public static int funnel2(String fileName, String Word) throws FileNotFoundException {
        List<String> wordList = new ArrayList<>();
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextLine()) {
            String cWord = input.nextLine();
            for (int i = 0; i < Word.length(); i++) {
                String newWord = Word.substring(0, i) + Word.substring(i + 1, Word.length());
                if (newWord.equals(cWord)) {
                    wordList.add(cWord);
                }
            }
        }
        int wordLeng = 0;
        for (int i = 0; i < wordList.size(); i++){
            if (wordList.get(i).length() > wordLeng) { wordLeng = wordList.get(i).length(); }
        }
        return wordLeng;
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(funnel2("src/enable1.txt","gnash"));
    }
}