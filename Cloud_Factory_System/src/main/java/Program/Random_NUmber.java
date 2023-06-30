package Program;
import java.util.Random;

public class Random_NUmber {
    private static final String CHARACTERS = "0123456789";

    public static String get_R_Number(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}
