import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    Registration obj=new Registration();

    @Test
    public void givenFirstName_whenValid_thenTrue() {
        boolean firstName=obj.checkFirstName("Vaibhav");
        Assert.assertTrue(firstName);
    }
    @Test
    public void givenFirstName_whenInValid_thenFalse() {
        boolean firstName=obj.checkFirstName("vaibhav");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_whenValid_thenTrue() {
        boolean lastName=obj.checkLastName("VampiRe");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_whenInValid_thenFalse() {
        boolean lastName=obj.checkLastName("vampiRe");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenMail_whenValid_thenTrue() {
        boolean mail=obj.checkMail("abc.xyz@bl.co.in");
        Assert.assertTrue(mail);
    }

    @Test
    public void givenMail_whenInValid_thenFalse() {
        boolean mail=obj.checkMail("abcbl.co");
        Assert.assertFalse(mail);
    }
}