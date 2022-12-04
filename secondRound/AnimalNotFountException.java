package secondRound;

public class AnimalNotFountException extends RuntimeException {
    @Override
    public String toString() {
        return "很抱歉！店内的动物已经卖完了，请下次再来吧！";
    }
}
