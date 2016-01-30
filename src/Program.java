import java.util.Scanner;

public class Program {

    public static void main(String args[]) {

        Basket basket = new Basket();

        char y = 'n';
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter \'y\' to new or any key to stop");
            y = scanner.nextLine().charAt(0);
            if (y == 'y') {
                basket.addFruit();
            }
        } while (y == 'y');

        BananaPacket packet = new BananaPacket(basket.getAllBananas());
        packet.showInfo();
        packet.showInfo();

    }

}
