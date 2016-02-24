package lesson_12.frame2_Balls.race;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BadAtm implements Atm{

    private Lock accountLock;

    public BadAtm () {
        accountLock = new ReentrantLock();
    }

    @Override
    public void checkBalance(long accountID) {

        System.out.println(accountID + " is going to withdraw some money");
    }

    @Override
    public void withdrawMoney(long accountID, int amount) {

        accountLock.lock();
        try {
            if (allowWithdrawal(accountID, amount)) {
               updateBalance(accountID, amount, TransactionType.WITHDRAWAL);
            }
        } finally {
            accountLock.unlock();
        }
    }
    private boolean allowWithdrawal (long accountId, int amount) {
        return true;
    }
    private void updateBalance (long accountID, int amount, TransactionType type) {

        System.out.println("successful " + type+ " account "+ accountID+ " amount "+ amount);
    }
    enum TransactionType {
        DEPOSIT, WITHDRAWAL;
    }
}
