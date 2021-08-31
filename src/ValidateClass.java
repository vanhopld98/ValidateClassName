import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static final String VALIDATE = "^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateClass() {
    }

    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(VALIDATE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}