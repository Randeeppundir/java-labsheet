public class AccountBeanDemo {
    public static void main(String[] args) {
        AccountBean account = new AccountBean();

        account.addPropertyChangeListener(event -> {
            System.out.println("Property changed: " + event.getPropertyName()
                    + " | Old balance: " + event.getOldValue()
                    + " | New balance: " + event.getNewValue());
        });

        account.setBalance(1000.00);
        account.setBalance(1750.50);
    }
}
