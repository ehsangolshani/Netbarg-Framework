package user;

/**
 * Created by ehsangolshani on 2/4/18.
 */
public class Account {
    private String username;
    private String password;
    private double credit;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.credit = 0;
    }

    public void increase(double amount) {
        this.credit += amount;
    }

    public void decrease(double amount) {
        if (this.credit >= amount) {
            this.credit -= amount;
        } else {
            this.credit = 0;
        }
    }

    public boolean accountMatch(String username, String password) {
        return this.username.equals(username) & this.password.equals(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
