import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        OOP
//        1. Encapsulation
//        2. Abstraction
//        3. Inheritance
//        4. Polymorphism

//        Person
//        Student `IS A` Person
//        SEStudent `IS A` Student

//        PhoneNumber contactHhp = new PhoneNumber(975, "009271");
//        contactHhp.display();
//
//        // Int...? 🙄
//        // Intl -> i18n -> Internationalization
//        IntPhoneNumber intContactHhp = new IntPhoneNumber(972, "009271", "+84");
//        intContactHhp.display();

//        ? BEGIN PART II
        Person[] e = new Person[10]; // new Person[10];
        int n = 0, c = 0;
        do {
            System.out.println("Worker (1); Officer(2): ");
            Scanner in = new Scanner(System.in);
            c = in.nextInt();
            if (c == 1) {
                //accept information of worker
                System.out.print("Enter worker name: ");
                String name = in.next();
                System.out.print("Enter worker working hours: ");
                int hrs = in.nextInt();
                e[n] = new Worker(name, hrs);

                n++;
            } else if (c == 2) {
                //accept information of Officer
                System.out.print("Enter Officer name: ");
                String name = in.next();
                System.out.print("Enter officer salary: ");
                double salary = in.nextDouble();
                e[n] = new Officer(name, salary);
                n++;
            }
        } while (c != 0);
        //print all objects of e
        for (int i = 0; i < n; i++) {
            e[i].display();
//print the instance of Worker only
            if (e[i] instanceof Worker)
                e[i].display();
        }

    }
}
