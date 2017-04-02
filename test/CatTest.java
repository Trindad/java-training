import com.company.animal.Cat;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silvana on 4/2/17.
 */
public class CatTest {

    @Test
    public void greetTest(){
        Cat a = new Cat("Jude");

        Assert.assertEquals("Hi, I'm Jude", a.greet());

        Cat anotherCat = new Cat("Mary");

        Assert.assertEquals("Hi, I'm Mary", anotherCat.greet());
    }
}
