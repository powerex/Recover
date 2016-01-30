import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student229a on 30.01.2016.
 */
public class TestApple {

    @Test
    public void TestTypeFruit() {
        Apple apple = new Apple();
        Assert.assertEquals(FruitType.APPLE, apple.getFruitType());
    }

}