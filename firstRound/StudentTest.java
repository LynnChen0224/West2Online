package firstRound;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        // 统计同学们的平均身高
        double average = Student.heights(new int[]{185, 179, 168, 175, 190});
        System.out.println(average);

        // 查找某个同学的学号,测试在或不在两种情况
        int location1 = Student.id(new String[]{"222100201", "222100202", "222100209", "222100211", "222000201"},"222100209");
        System.out.println(location1);
        int location2 = Student.id(new String[]{"222100201", "222100202", "222100209", "222100211", "222000201"},"222100210");
        System.out.println(location2);

        //尝试使用用户输入的数据来实例化 Student 实例 (控制台输入)
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //创建对象
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student("222100203","小花",80);

        s1.setId(sc1.nextLine());
        s1.setName(sc1.nextLine());
        s1.setGrade(sc1.nextDouble());

        s2.setId(sc2.nextLine());
        s2.setName(sc2.nextLine());
        s2.setGrade(sc2.nextDouble());


        //老师算错了成绩，修改你的成绩,测试修改成功和失败两种情况
        Student.update(s1,59);
        Student.update(s1,60.9);
        Student.update(s3,120);

        //判断该学生是否挂科
        String isPassed1 = s1.isPassed(s1);
        String isPassed2 = s2.isPassed(s2);
        System.out.println(isPassed1);
        System.out.println(isPassed2);

        //一个静态方法 unPassedList() ，输出挂科和退学的同学信息(并有一定区分)
        Student.unPassedList(s1);
        //将小红的信息修改为退学
        s2.setOff(true);
        //再次输入小红
        Student.unPassedList(s2);

        sc1.close();
        sc2.close();
    }
}
