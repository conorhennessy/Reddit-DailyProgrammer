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
    public static void main(String[] args) {
        System.out.println(wordFunnel("aapple","apple"));
    }
}