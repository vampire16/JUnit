import java.util.regex.Pattern;

public class Registration {
    String pattern="^[A-Z][a-zA-Z]{2,}$";

    public static void main(String[] args) {
        System.out.println("Welcome");
    }

    public boolean checkFirstName(String fname) {
        return Pattern.matches(pattern, fname);
    }

    public boolean checkLastName(String lname) {
        return Pattern.matches(pattern, lname);
    }
}
