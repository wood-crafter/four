public class PhoneNumber {
    int area;
    String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    void display() {
        System.out.println(area + " - " + number);
    }
}
