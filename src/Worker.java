public class Worker extends Person {
    int hrs;
    final double RATE = 5.5; // Can't be re-assigned

    public Worker(String name, int hrs) {
        super(name);
        this.hrs = hrs;
    }

    @Override
    public void display() {
        System.out.println(name + ": " + getSalary());
    }

    @Override
    double getSalary() {
        return hrs * RATE;
    }
}
