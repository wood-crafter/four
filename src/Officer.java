public class Officer extends Person {
    double salary;

    public Officer(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println(name + ": " + getSalary());
    }

    @Override
    double getSalary() {
        return salary;
    }
}
