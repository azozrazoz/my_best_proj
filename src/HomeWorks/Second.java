package HomeWorks;
import java.util.regex.Pattern;
public class Second {
    private static final String PASSWORD_REGEX =
            "(?=.*[a-z])(?=.*[0-9@#$%]).{8,}";;
    public static final Pattern PASSWORD_PATTERN =
            Pattern.compile(PASSWORD_REGEX);
}
