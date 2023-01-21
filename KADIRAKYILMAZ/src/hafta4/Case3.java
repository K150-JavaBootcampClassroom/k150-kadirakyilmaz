package hafta4;

public class Case3 {
    public boolean purchase(int apples, int pears) {
        if (this.apples < apples || this.pears < pears) {
            System.out.println("Maalesef, istediğiniz miktarda meyve stokta yok.");
            return false;
        }
        this.apples -= apples;
        this.pears -= pears;
        return true;
    }
}
