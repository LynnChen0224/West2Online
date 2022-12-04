package secondRound;

public class Rabbit extends Animal{
    boolean isVaccineInjected = true;
    public Rabbit(String animalName, int age, String gender) {
        super(animalName, age, gender, 150);
        if(isVaccineInjected) {
            System.out.println("这只兔兔的名字叫" + animalName + "，今年" + age + "岁了， 是一只" + gender + "兔, 价格是150元,已经打过疫苗了。");
        }else{
            System.out.println("这只兔兔的名字叫" + animalName + "，今年" + age + "岁了， 是一只" + gender + "兔, 价格是150元,还没有打过疫苗。");
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
