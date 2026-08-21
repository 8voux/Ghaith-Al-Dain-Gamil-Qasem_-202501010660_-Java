public class main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali", "P001");
        Person p2 = new Student("Sara", "S001");
        Person p3 = new Lecturer("Ahmed", "L001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}

