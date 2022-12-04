package secondRound;

public class InsufficientBalanceException extends RuntimeException{
    @Override
    public String toString() {
        return "余额不足，下次再来吧！";
    }
}