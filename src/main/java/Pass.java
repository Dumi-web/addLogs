import java.util.function.BooleanSupplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pass {
    static int count = 6;

    public static String passwordIsValid(String password) {
        String name = "";
        String result = "";
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;
        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(password);
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNum = true;
            }
            if (Character.isUpperCase(c)) {
                hasCap = true;
            }
            if (Character.isLowerCase(c)) {
                hasLow = true;
            }
        }
        if (name.equals(password)) {
            result += "Try again: Password Should exist.\n";
            count--;
        }
        if (password.length() <= 8) {
            result += "Try again: Password Should be longer than 8 Characters.\n";
            count--;
        }
        if (!hasNum) {
            result += "Try again: Password does not have a digit.\n";
            count--;
        }
        if (!hasCap) {
            result += "Try again: Password does not have uppercase.\n";
            count--;
        }
        if (!hasLow) {
            result += "Try again: Password does not have lowercase.\n";
            count--;
        }
        if (sMatcher.matches()) {
            result += "Try again: Password does not have special character.";
            count--;
        }
        return result;
    }

    public static String passwordIsOkay() {

        String output = "";

        if(count < 3) {
            output += "User password is not okay.";
        }

        else{
            output += "User password is okay.";
        }
        return output;
    }
}




