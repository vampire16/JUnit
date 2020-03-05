import org.junit.Assert;
import org.junit.Test;

public class FirstName {
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
}
