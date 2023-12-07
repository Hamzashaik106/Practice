class Employee {
    int id;
    String name;
    int salary;
    int insurance;
    String age;
    String gender;
    String desigantion;

    void eat() {
        System.out.println("employee is eating");
    }

    void work() {
        System.out.println("employee is working");
    }

    void sleep() {
        System.out.println("employee is sleeping");
    }
}

class EmployeeApp {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.eat();
        e1.sleep();
        e1.work();

        e2.eat();
        e2.sleep();
        e2.work();

        e3.eat();
        e3.sleep();
        e3.work();

        e4.eat();
        e4.sleep();
        e4.work();

        e5.eat();
        e5.sleep();
        e5.work();

        new Employee().work();
    }
}
