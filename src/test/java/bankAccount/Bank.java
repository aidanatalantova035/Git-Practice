package bankAccount;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private  String name;
    private Map<String,Account> accountsMAp = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Account> getAccountsMAp() {
        return accountsMAp;
    }

    public  void  registerAccount(Account account){ //accNum -12345 email, balance
        accountsMAp.put(account.getEmail(), account);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accountsMAp=" + accountsMAp +
                '}';
    }
}
