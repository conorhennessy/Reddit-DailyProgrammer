import java.util.Scanner;

public class Challenge_363_E {
    public static boolean check(String wordIn) {
        String word = wordIn.toLowerCase();
        /*if (!word.contains("ie")) {
            return false;
        }if (word.contains("ei")) {
            return false;
        }*/
        if (word.contains("cei")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Word to check... ");
        String word = input.next();
        System.out.println("check(\""+word+"\") => " + check(word));
    }
}

