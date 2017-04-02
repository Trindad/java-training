import com.company.animal.Animal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silvana on 4/2/17.
 */
public class AnimalTest {

    @Test
    public void roamTest(){
        Animal a = new Animal();

        Assert.assertEquals("I can roam.", a.roam());
    }
}
