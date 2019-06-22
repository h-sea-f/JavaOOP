import model.Student;

public class HelloStudent {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setAge(21);
        stu.setName("贺海峰");
        stu.setSex("male");
        stu.setId(10);
        System.out.println("姓名："+stu.getName()+" 年龄："+stu.getAge()+" 性别："+stu.getSex()+" 学号："+stu.getId());
    }
}
