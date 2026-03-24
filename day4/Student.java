package day4;
class Student {
    int id;
    String name;
    int age;
    Student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }
    Student(int i, String n) {
        id = i;
        name = n;
    }
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101, "Arun");
        Student s3 = new Student(102, "Ravi", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}