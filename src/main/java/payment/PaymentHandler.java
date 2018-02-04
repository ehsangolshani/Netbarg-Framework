package payment;

import item.Item;
import user.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 2/4/18.
 */
public class PaymentHandler {
    private List<Transaction> transactions;

    public PaymentHandler(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public void removeTransaction(Transaction transaction) {
        this.transactions.remove(transaction);
    }

    public List<Transaction> findUserTransactions(User user) {
        List<Transaction> resultTransactions = new ArrayList<Transaction>();

        for (Transaction transaction : this.transactions) {
            if (transaction.getUser().equals(user)) {
                resultTransactions.add(transaction);
            }
        }

        return resultTransactions;
    }

}
