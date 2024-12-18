class pen {
    String colour;
    String type;

    public void write();
}

class Student extends pen {
    String name;
    int age;

    public void write() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class oops {
    public static void main(String[] args) {

        Student s1 = new Student("nashil", 24);
        s1.printinfo();
    }

}
