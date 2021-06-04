import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modul4HW {
    private String Text;
    String result="";

    public Modul4HW(String text) {
        Text = text;
    }

    public String GetPhoneNumber() {
        Pattern pattern = Pattern.compile("\\+7\\d{10}");
        Matcher matcher = pattern.matcher(Text);
        while (matcher.find()) {
            result += matcher.group() + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        String Text = "Madiyar +77051235544";
        Modul4HW a = new Modul4HW(Text);
        System.out.println(a.GetPhoneNumber());
    }
}
