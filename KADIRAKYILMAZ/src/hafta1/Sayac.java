package hafta1;

import java.util.Random;

public class Sayac {
    public static void main(String[] args) {

        int sayac = 0;
        Random r = new Random();
        while (true) {
            sayac++;
            int i = r.nextInt(500);
            if (i>50 && i<100){
                                System.out.println(sayac+".buldu");
                break;
            }
        }
    }
}
