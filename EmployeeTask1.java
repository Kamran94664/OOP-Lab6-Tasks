class EmployeeTask1{
    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends EmployeeTask1 {

    void manageTeam() {
        System.out.println("Manager is managing the team.");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manageTeam();
    }
}
