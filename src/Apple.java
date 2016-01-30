
public class Apple extends Fruit {

    public Apple() {
        fruitType = FruitType.APPLE;
    }

    @Override
    public String toString() {
        return "Apple-juce";
    }

    public void doNothing() {

    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public void method() {
        System.out.println("method");
    }

}
