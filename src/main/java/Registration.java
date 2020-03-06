import java.util.regex.Pattern;

public class Registration {
    String pattern="^[A-Z][a-zA-Z]{2,}$";
    String mailPattern="^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}([.]?[a-z]{2,})?$";
    String mobPattern="^[0-9]{2}[ ][0-9]{10}$";
    String passPattern="[a-zA-Z0-9]{8,}[a-zA-Z0-9]*[A-Z][a-zA-Z0-9]*";
//    String passPattern1="[a-zA-Z0-9]*[A-Z][a-zA-Z0-9]*";
    public static void main(String[] args) {
        System.out.println("Welcome");
    }

    public boolean checkFirstName(String fname) {
        return Pattern.matches(pattern, fname);
    }

    public boolean checkLastName(String lname) {
        return Pattern.matches(pattern, lname);
    }

    public boolean checkMail(String mail) {
        return Pattern.matches(mailPattern, mail);
    }

    public boolean checkMobNumber(String number) {
        return Pattern.matches(mobPattern, number);
    }

    public boolean checkPassword(String password) {
        return Pattern.matches(passPattern, password);
    }
}
