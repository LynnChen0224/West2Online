package secondRound;

import java.time.LocalDate;

public class Customer {
    //顾客名字(String)
    String customerName;
    //到店次数(int)
    int times;
    //最新到店时间(LocalDate类)
    LocalDate latestTime;

    public Customer(String customerName, int times, LocalDate latestTime) {
        System.out.println("该顾客的名字是" + customerName + ", 到店" + times + "次, 最新到店时间是" + latestTime + "。");
    }

    @Override
    public String toString() {
        //重写(@Override) toString() 方法, 要求按一定格式输出客户的所有信息
        return "该顾客的名字是" + customerName + ", 到店" + times + "次, 最新到店时间是" + latestTime + "。";
    }
}
