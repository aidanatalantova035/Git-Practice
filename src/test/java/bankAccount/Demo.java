package bankAccount;

public class Demo {
    public static void main(String[] args) {
        Bank cbk = new Bank("Commercial Bank Kyrgyzstan");

        Account sanirasAccount = new Account(12345, "sanira@gmail.com", 1000);
        cbk.registerAccount(sanirasAccount);

        Account aidanasAccount = new Account(111111, "aidana@gmail.com", 2000);
        cbk.registerAccount(sanirasAccount);

        sanirasAccount.transferViaMBank("aidana@gmail.com", 200, cbk);
        System.out.println(sanirasAccount.getBalance()); //800
        System.out.println(aidanasAccount.getBalance()); //2200

        System.out.println(sanirasAccount.getBalance());
        System.out.println(aidanasAccount.getBalance());
    }

}
