package exercises.technology;

public class Laptop extends Computer {
    private int batteryLevel;


    public void charge() {
        if (batteryLevel < 100) {
            batteryLevel = 100;
        }
    }

    // Constructors
    public Laptop() {
        this.batteryLevel = 100;
    }

    public Laptop(String userName, int userIntegerInput) {
        super(userName, userIntegerInput);
        this.batteryLevel = 100;
    }

    // Getters
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public String getUserName() {
        this.batteryLevel -= 1;
        return super.getUserName();
    }



}
