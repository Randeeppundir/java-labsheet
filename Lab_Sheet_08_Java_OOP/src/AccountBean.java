import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AccountBean {
    private double balance;
    private final PropertyChangeSupport changes = new PropertyChangeSupport(this);

    public double getBalance() { return balance; }

    public void setBalance(double newBalance) {
        double oldBalance = this.balance;
        this.balance = newBalance;
        changes.firePropertyChange("balance", oldBalance, newBalance);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changes.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changes.removePropertyChangeListener(listener);
    }
}
