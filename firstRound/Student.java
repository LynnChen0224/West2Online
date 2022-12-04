package firstRound;

public class Student {
    //私有变量
    private String id;
    private String name;
    private double grade;
    private boolean isOff;

    //上述变量对应的 get 和 set 方法，以及一个重写的 toString() 方法
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public boolean isOff() {
        return isOff;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setOff(boolean off) {
        isOff = off;
    }

    @Override
    public String toString() {
        return "Student{ id= " + getId() + " , name= " + getName() + " , grade= " + getGrade() + " , isOff= " + isOff() + "}";
    }

    public Student() {
    }

    //一个有学号、姓名、成绩的构造方法
    public Student(String id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //一个静态(static)方法 update(Student 学生, double 成绩) ，老师算错了成绩，修改你的成绩
    public static void update(Student student, double grade) {
        //加的成绩必须是整数，学生不能已经退学了，总成绩不能超过100分
        if((grade - student.grade) % 1 == 0 && !student.isOff && grade <= 100){
            student.setGrade(grade);
            //信息提示
            System.out.println("修改成功。");
        }else{
            //如果出现以上情况，都视为修改失败，学生信息不应改变
            //信息提示
            System.out.println("输入错误，修改失败。");
        }
    }

    //一个实例方法 isPassed() ，判断该学生是否挂科
    public String isPassed(Student student) {
//        System.out.println(this.grade);
        if (this.grade >= 60 && this.grade <= 100){
            return student.name + "恭喜你，高数成绩合格！";
        }else {
            return student.name + "很遗憾，高数成绩不合格！";
        }
    }

    //一个静态方法 unPassedList() ，输出挂科和退学的同学信息(并有一定区分)
    public static void unPassedList(Student student) {
        if(student.grade < 60 && !student.isOff){
            System.out.println("该挂科同学的信息如下");
        }else if (student.isOff()){
            System.out.println("该退学同学的信息如下");
        }
        System.out.println(student);
    }

    //统计同学们的平均身高，接受一个学生身高的整型数组 heights ( int[] ) ，返回平均身高 average (double)
    public static double heights(int[] heights) {
        double sum = 0;
        for(int i : heights){
            sum += i;
        }
        return sum / heights.length;
    }

    //查找某个同学的学号，接受一个学生学号的字符串数组 studentIds ( String[] ) 和一个要查找的学生学号sId ( String ) ，返回学号在数组中的下标，如果不在数组中则返回-1
    public static int id(String[] studentIds, String sId) {
        int i = 0;
        for(;i < studentIds.length;i++){
           if(studentIds[i].equals(sId)){
               break;
            }
        }
        if(i == studentIds.length){
            i = -1;
        }
        return i;
    }
}