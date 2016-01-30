import java.awt.*;

public class Banana extends Fruit {

    private Color color;
    private int weight;

    @Override
    public String toString() {
        return "Banana{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }

    public Banana() {
        fruitType = FruitType.BANANA;
    }
}
