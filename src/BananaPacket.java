import java.util.ArrayList;

public class BananaPacket {

    private ArrayList<Banana> bananas;

    public BananaPacket(ArrayList<Banana> bananas) {
        this.bananas = bananas;
    }

    public int bananaCount() {
        return bananas.size();
    }

    public void showInfo() {

        for (Banana b: bananas) {
            System.out.println(b);
        }

    }

}
