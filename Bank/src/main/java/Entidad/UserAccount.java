package Entidad;

import lombok.Data;
@Data
public class UserAccount {
    private String user;
    private String password;
    private double balance;

    public UserAccount(String user, String password, double balance) {
        this.user = user;
        this.password = password;
        this.balance = 0;
    }

    public UserAccount() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
