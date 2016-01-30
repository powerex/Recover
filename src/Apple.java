
public class Apple extends Fruit {

    public Apple() {
        fruitType = FruitType.APPLE;
    }

    @Override
    public String toString() {
        return "Apple{}";
    }

    public void doNothing() {

    }

    public FruitType getFruitType() {
        return fruitType;
    }

}
