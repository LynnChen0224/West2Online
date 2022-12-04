package secondRound;

public class Cat extends Animal{
    boolean isVaccineInjected = true;

    //价格200元
    public Cat(String animalName, int age, String gender) {
        super(animalName, age, gender, 200);
        if(isVaccineInjected) {
            System.out.println("这只猫猫的名字叫" + animalName + "，今年" + age + "岁了， 是一只" + gender + "猫, 价格是200元,已经打过疫苗了。");
        }else{
            System.out.println("这只猫猫的名字叫" + animalName + "，今年" + age + "岁了， 是一只" + gender + "猫, 价格是200元,还没有打过疫苗。");
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
