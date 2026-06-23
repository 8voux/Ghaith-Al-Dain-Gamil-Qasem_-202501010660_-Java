public class main {

    public static void main(String[] args) {

        Person p1 = new Person("Ali", "2222");
        Person p2 = new Student("Ahmad", "3333");
        Person p3 = new Lecturer("Dr. ghaith", "1111");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
