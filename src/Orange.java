public class Orange extends Fruit {

    private int size;

    @Override
    public String toString() {
        return "Orange{" +
                "size=" + size +
                '}';
    }

    public Orange() {
        fruitType = FruitType.ORANGE;
    }
}
