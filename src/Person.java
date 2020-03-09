// To have an abstract method, it must be an abstract class
public abstract class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    // Abstract method must be @Overrided
    abstract double getSalary();
}
