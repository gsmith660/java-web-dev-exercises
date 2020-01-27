package exercises.technology;

public class SmartPhone extends Computer {
    private String phoneNumber;

    public String phoneHome() {
        if (isOn()) {
            return "The number you are trying to call has been disconnected, Goodbye.";
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Constructors
    public SmartPhone() {
        this.phoneNumber = "816-123-4567";
    }

    public SmartPhone(String userName, int userIntegerInput) {
        super(userName, userIntegerInput);
        this.phoneNumber = "816-333-4444";
    }

    // Setters
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
