import com.company.animal.Feline;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silvana on 4/2/17.
 */
public class FelineTest {

    @Test
    public void roamTest(){
        Feline a = new Feline();

        Assert.assertEquals("I'm a feline.", a.roam());
    }
}
