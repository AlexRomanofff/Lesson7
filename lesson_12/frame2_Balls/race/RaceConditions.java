package lesson_12.frame2_Balls.race;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RaceConditions {
    public static void main(String[] args) {
        Random random = new Random();
        long husband = 1122;
        long wife = 2211;


        Atm atm = new LegacyAtm();
        Set<Runnable> threads = new HashSet<>();
        for (int i=0; i<5; i++) {
            threads.add(createWithdrawalSet(atm, wife, random.nextInt(1000)));
            threads.add(createWithdrawalSet(atm, husband, random.nextInt(1000)));
        }
        for (Runnable r: threads) {
            new Thread(r).start();
        }
    }
    private static Runnable createWithdrawalSet (final Atm atm, final long accountID, final int amount) {
        return new Runnable() {
            @Override
            public void run() {
                atm.checkBalance(accountID);
                atm.withdrawMoney(accountID, amount);
            }
        };
    }
}
