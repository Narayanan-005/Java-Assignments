package bank;

import java.util.TreeMap;

public class InsufficientBalanceException extends Throwable {
    @Override
    public String getMessage() {
        return "Insufficient Balance";
    }
}
