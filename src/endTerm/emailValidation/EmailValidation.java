package endTerm.emailValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    private String email;

    public EmailValidation(String email) {
        this.email = email;
    }

    public boolean validateEmail() {
        Pattern pattern = Pattern.compile("^[a-z]+\\.[a-z]+_cs18@gla\\.ac\\.in$");
        Matcher matcher = pattern.matcher(this.email);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
