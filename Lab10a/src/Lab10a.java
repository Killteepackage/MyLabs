import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab10a {
    private static final String SONNET =
                    "До свиданья, друг мой, до свиданья.\n"+
                    "Милый мой, ты у меня в груди.\n"+
                    "Предназначенное расставанье\n"+
                    "Обещает встречу впереди.\n"+
                    "До свиданья, друг мой, без руки, без слова,\n"+
                    "Не грусти и не печаль бровей,-\n"+
                    "В этой жизни умирать не ново,\n"+
                    "Но и жить, конечно, не новей.\n";
    private static final Comparator<String> LINE_LENGTH_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(SONNET.split("\n"));
        System.out.println(lines);
        Collections.sort(lines, LINE_LENGTH_COMPARATOR);
        System.out.println(lines);
    }
}
