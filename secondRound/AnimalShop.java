package secondRound;

import java.time.LocalDate;
import java.util.ArrayList;

public interface AnimalShop {
    //买入新动物(需要的参数自己决定)
    //买入动物 -> 买入一只动物，记得在动物列表中添加，
    //如余额不足则抛出异常InsufficientBalanceException
    void buy(Animal animal);

    //招待客户(Customer)

    //招待客户 -> 接受客户参数，在顾客列表中加入新顾客，
    //出售动物，如果店内没有动物，抛出AnimalNotFoundException。
    //通过toString输出动物信息，并把钱入账，将动物移除列表
    void entertain(Customer customer, Animal animal, ArrayList<Customer> customerList, ArrayList<Animal> animalList);

    //歇业()
    void closure(ArrayList<Customer> customerList);
}
