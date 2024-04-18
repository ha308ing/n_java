import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSearch {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{11}", Pattern.CASE_INSENSITIVE + Pattern.MULTILINE);
        Matcher matcher = pattern.matcher("My phone: 1254632124145");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
