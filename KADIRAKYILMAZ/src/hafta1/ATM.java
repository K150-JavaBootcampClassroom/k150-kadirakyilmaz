package hafta1;

public class ATM {
    public static void main(String[] args) {
        int bakiye = 8500;

        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("1-Para yatırma\n" +
                "2-Para Çekme\n" +
                "3-Bakiye Sorgula\n" +
                "4-Çıkış Yap");

        System.out.print("\nİsleminizi Seciniz: ");
        switch(islem) {
            1:
            System.out.println("Bakiyeniz = " + bakiye);
            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
            int tutar = inp.nextInt();
            if(tutar > bakiye) {
                System.out.print("Yetersiz bakiye ! Tekrar giriniz: ");
                tutar = inp.nextInt();
            }
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
            break;
            2:
            System.out.println("Bakiyeniz = " + bakiye);
            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
            tutar = inp.nextInt();
            bakiye += tutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
            break;
            3:
            System.out.println("Bakiyeniz = " + bakiye);
            break;

    }

    }
