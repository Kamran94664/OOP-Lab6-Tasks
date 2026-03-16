class EmployeeTask3 {

    double salary = 50000;
    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}
class PermanentEmployee extends EmployeeTask3 {
    void calculateBonus() {
        double bonus = salary * 0.10;
        int bonusInt = (int) bonus;

        System.out.println("Bonus: " + bonusInt);
    }
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        p.displaySalary();
        p.calculateBonus();
    }
}
