package secondRound;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test{

    public static void main(String[] args) {
        //创建一个宠物店实例，给定余额，初始化动物列表，一个空的顾客列表
        ArrayList<Animal> animalList = new ArrayList<>();
        ArrayList<Customer> customerList = new ArrayList<>();

        MyAnimalShop homeOfPet = new MyAnimalShop(1000,true);

        //测试买入动物，招待顾客，歇业
        ChineseGardenDog dog1 = new ChineseGardenDog("汪汪",2,"公",100);
        Cat cat1 = new Cat("喵喵",1,"母");
        Rabbit rabbit1 = new Rabbit("兔兔",3,"公");

        Customer customer1 = new Customer("小明",2, LocalDate.now());
        customerList.add(customer1);

        homeOfPet.buy(dog1);
        homeOfPet.buy(cat1);
        homeOfPet.buy(rabbit1);

        animalList.add(dog1);
        animalList.add(cat1);
        animalList.add(rabbit1);

        homeOfPet.entertain(customer1,dog1,customerList,animalList);

        homeOfPet.closure(customerList);
    }
}
