package exercises.technology;

public class Computer extends AbstractEntity {
    private boolean on = false;
    private String userName;
    private int userIntegerInput;


    public void powerButton() {
        on = !on;
    }

    public String runProgram() {
        if (on) {
            return "Hello " + this.userName + "!";
        } else {
            throw new IllegalArgumentException("Computer must be turned on for program to run!");
        }
    }

    public int computeSquare() throws Exception {
        if (on) {
            return userIntegerInput * userIntegerInput;
        } else {
            throw new Exception("Computer must be turned on to compute the square!");
        }
    }


    // Constructors
    public Computer() {
        this.userName = "World";
        this.userIntegerInput = 42;
        this.setId();
    }

    public Computer(String userName, int userIntegerInput) {
        this.userName = userName;
        this.userIntegerInput = userIntegerInput;
        this.setId();
    }


    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserIntegerInput(int userDoubleInput) {
        this.userIntegerInput = userDoubleInput;
    }


    // Getters
    public boolean isOn() {
        return on;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserIntegerInput() {
        return userIntegerInput;
    }
}
