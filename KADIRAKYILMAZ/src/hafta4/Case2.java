package hafta4;

public class Case2 {
        public boolean purchase(int apples, int pears) {
        if (this.apples < apples || this.pears < pears) {
            return false;
        }
        this.apples -= apples;
        this.pears -= pears;
        return true;
    }
}

    FruitShop shop = new FruitShop(20, 15, 25);
    boolean purchaseSuccessful = shop.purchase(1, 2);
}
