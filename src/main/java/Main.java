import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int rightOfEntry = 3;

        Scanner scanner = new Scanner(System.in);

        Atm atm = new Atm();

        String operations = "1. Para Çekme\n" +
                "2. Para Yatırma\n" +
                "3. Bakiye Öğrenme\n" +
                "4. Çıkış";


        while (true) {
            System.out.println("Kullanıcı Adı: ");
            String userName = scanner.nextLine();
            System.out.println("Şifre");
            int password = scanner.nextInt();
            scanner.nextLine();

            while (true) {

                if (atm.login(new User(userName, password))) {
                    System.out.println("**********************************");
                    System.out.println(operations);
                    System.out.println("**********************************\n");

                    System.out.println("Yapmak İstediğiniz İşlem: ");
                    int operation = scanner.nextInt();

                    if (operation == 1) {
                        System.out.println("Çekmek İstediğiniz Tutar: ");
                        int amount = scanner.nextInt();
                        System.out.println(atm.withdrawMoney(amount));
                    } else if (operation == 2) {
                        System.out.println("Yatırmak İstedğiniz Tutar: ");
                        int amount = scanner.nextInt();
                        System.out.println(atm.depositMoney(amount));
                    } else if (operation == 3) {
                        System.out.println(atm.getBalance());
                    } else if (operation == 4) {
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    } else {
                        System.out.println("Geçersiz İşlem!");
                    }
                } else if (!atm.login(new User(userName, password))) {
                    rightOfEntry--;
                } else if (rightOfEntry == 0) {
                    System.out.println("Deneme Hakkınız Kalmadı!");
                    break;
                }
            }
        }

    }
}
