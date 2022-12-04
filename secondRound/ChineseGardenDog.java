package secondRound;

public class ChineseGardenDog extends Animal{
    //变量: isVaccineInjected() (boolean 是否注射狂犬病疫苗)
    boolean  isVaccineInjected = true;

    //价格100元
    public ChineseGardenDog(String animalName, int age, String gender, double price) {
        super(animalName, age, gender, price);
        if(isVaccineInjected) {
            System.out.println("这只中华田园犬的名字叫" + animalName + "，今年" + age + "岁了， 是一只" + gender + "狗, 价格是100元,已经打过疫苗了。");
        }else{
            System.out.println("这只中华田园犬的名字叫" + animalName + "，今年" + age + "岁了， 是一只" + gender + "狗, 价格是100元,还没有打过疫苗。");
        }
    }
    @Override
    public String toString() {
        return null;
    }
}
