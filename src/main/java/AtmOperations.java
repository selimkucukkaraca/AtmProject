public class AtmOperations {

    private int balance = 500;

    public String withdrawMoney(int amount) {

        if (balance < amount) {
            return "Bakiyeniz yetersiz!";
        }
        else {
            balance -= amount;
            return "İşlem başaralı\n" +
                    "Kalan bakiyeniz: " + balance;
        }
    }

    public String depositMoney(int amount) {

        balance += amount;
        return "Para Yatırma işlemi Başarılı\n" +
                "Yeni bakiyeniz: " + balance;
    }

    public int getBalance() {
        return balance;
    }
}
