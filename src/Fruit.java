public class Fruit {

    protected FruitType fruitType;

    public FruitType getFruitType() {
        return fruitType;
    }

    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    public Fruit(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    public Fruit() {
    }
}
