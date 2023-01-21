package hafta4;

public class FruitShop {
    private int apples;
    private int pears;
    private int cherries;

    public FruitShop(int apples, int pears, int cherries) {
        this.apples = apples;
        this.pears = pears;
        this.cherries = cherries;
    }

    public int getApples() {
        return apples;
    }

    public int getPears() {
        return pears;
    }

    public int getCherries() {
        return cherries;
    }
}

    FruitShop shop = new FruitShop(20, 15, 25);
    int apples = shop.getApples();
    int pears = shop.getPears();
    int cherries = shop.getCherries();
}
