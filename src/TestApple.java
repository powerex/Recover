import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student229a on 30.01.2016.
 */
public class TestApple {

    @Test
    public void TestTypeFruit() {
        Apple apple = new Apple();
        assertEquals(FruitType.APPLE, apple.getFruitType());
    }

}
