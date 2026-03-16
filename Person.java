class Person {
    void displayPerson() {
        System.out.println("This is a Person.");
    }
}

class Student extends Person {
    void displayStudent() {
        System.out.println("This is a Student.");
    }
}
class GraduateStudent extends Student {

    void research() {
        System.out.println("Graduate student is doing research.");
    }
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();
        g.displayPerson();
        g.displayStudent();
        g.research();
    }
}