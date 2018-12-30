import java.util.List;

public class Challenge_369_E {
    public static String hexcolour(int r, int g, int b) {
        String hexStr = "";
        for (Integer e : List.of(r, g, b)) {
            hexStr += e < 16 ? "0" + Integer.toHexString(e) : Integer.toHexString(e);
        }
        return ("#" + hexStr).toUpperCase();
    }
    
    public static void main(String[] args) {
        System.out.println("hexcolor(0, 0, 205) => " + hexcolour(0, 0, 205));
    }
}

