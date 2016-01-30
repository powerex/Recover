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

    public Banana(FruitType fruitType, Color color, int weight) {
        super(fruitType);
        this.color = color;
        this.weight = weight;
    }
}
