import java.util.ArrayList;
import java.util.Scanner;

public class Basket {

    private ArrayList<Fruit> fruits;

    public Basket() {
        fruits = new ArrayList<Fruit>();
    }

    public void addFruit() {

        System.out.println("What kind of fruit?");
        Scanner scanner = new Scanner(System.in);

        char c = scanner.nextLine().charAt(0);
        switch (c) {
            case 'b': fruits.add(new Banana()); break;
            case 'o': fruits.add(new Orange()); break;
            default: System.out.println("Unknow fruit");
        }

    }

    public ArrayList<Banana> getAllBananas() {
        ArrayList<Banana> result = new ArrayList<Banana>();

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getFruitType() == FruitType.BANANA)
                result.add((Banana) fruits.get(i));
        }

        return  result;
    }

}
