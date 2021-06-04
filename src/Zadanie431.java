import java.util.regex.*;

public class Zadanie431 {
    public static void main(String[] args) {
        String str = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, " +
                "manipulating and editing a text. It is widely used to define a constraint on strings such as a password. " +
                "Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile(" s\\w+s ");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
