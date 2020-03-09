public class IntPhoneNumber extends PhoneNumber {
    String countryCode;

    public IntPhoneNumber(int area, String number, String countryCode) {
        // TODO: Super...? 🤔
        super(area, number); // Must be first statement
        this.countryCode = countryCode;
    }

    // TODO: Override...? 🤔
    @Override // Annotation
    void display() {
        System.out.println(countryCode + " - " + area + " - " + number);
    }
}
