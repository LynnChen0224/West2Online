package secondRound;

import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop{
    //店的余额double
    double balance;
    //是否正在营业
    boolean inBusiness;

    double tmp = this.balance;
    double profit = 0;

    public MyAnimalShop(double balance, boolean inBusiness) {
        this.balance = balance;
        this.inBusiness = inBusiness;
    }

    //买入动物 -> 买入一只动物，记得在动物列表中添加，
    //如余额不足则抛出异常InsufficientBalanceException
    @Override
    public void buy(Animal animal) {
        if(balance < animal.price){
            throw new InsufficientBalanceException();
        }else{
            balance -= animal.price;

        }
    }

    //招待客户 -> 接受客户参数，在顾客列表中加入新顾客，
    //出售动物，如果店内没有动物，抛出AnimalNotFoundException。
    //通过toString输出动物信息，并把钱入账，将动物移除列表
    @Override
    public void entertain(Customer customer, Animal animal, ArrayList<Customer> customerList, ArrayList<Animal> animalList) {
        customer.times++;

        if(animalList.isEmpty()){
            throw new AnimalNotFountException();
        }else{
            //每只动物的利润
            balance +=100;
            //每只动物的进价
            balance += animal.price;
            animalList.remove(animal);
        }
    }

    //歇业 -> (LocalDate判断) 输出当天光顾的客户的列表信息，计算并输出一天的利润
    @Override
    public void closure(ArrayList<Customer> customerList) {
        if(!inBusiness){
            System.out.println("今天不营业。");
        }else{
            System.out.println("今天营业。");
        }
        for(int i = 0;i < customerList.size();i++){
            System.out.println(customerList.get(i));
        }

        profit = balance - tmp;
        System.out.println("今天的利润是" + profit + "元。");
    }
}
