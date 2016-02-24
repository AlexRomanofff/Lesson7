package lesson_12.frame2_Balls.race;

public class LegacyAtm implements Atm {

    private int balance = 2000;

    @Override
    public void checkBalance(long accountID) {

        System.out.println(accountID + " is going to withdraw some money");
    }

    @Override
    public synchronized void withdrawMoney(long accountID, int amount) {

        if (allowWithdrawal(accountID, amount)) {
            updateBalance(accountID, amount, TransactionType.WITHDRAWAL);
        } else {
            System.out.println("Not enough money on the account");
        }
    }

    private boolean allowWithdrawal (long accountId, int amount) {
        return (balance>=amount);
    }

    private void updateBalance (long accountID, int amount, TransactionType type) {

        balance = balance - amount;
        System.out.println("successful " + type+ " account "+ accountID+ " amount "+ amount);
        System.out.println("Balance: " + balance);
    }
    enum TransactionType {
        DEPOSIT, WITHDRAWAL;
    }
}
