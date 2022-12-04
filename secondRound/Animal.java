package secondRound;

public abstract class Animal {
    //动物名(String)
    String animalName;
    //年龄(int)
    int age;
    //性别
    String gender;
    //价格(double)
    double price;

    //一个全参构造方法
    public Animal(String animalName,int age,String gender,double price) {
    }

    //一个抽象的toString() 方法
    public abstract String toString();
}
