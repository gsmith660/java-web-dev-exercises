package exercises.technology;

public class Program {
    public static void main(String[] args) throws Exception {
        Computer old = new Computer();
        System.out.println("Power status of old computer: " + old.isOn());
        old.powerButton();
        System.out.println("Power status of old computer: " + old.isOn());
        System.out.println(old.getUserName());
        System.out.println(old.runProgram());
        old.setUserName("Hal");
        System.out.println(old.runProgram());
        System.out.println(old.getUserIntegerInput());
        System.out.println(old.computeSquare());



        Laptop mac = new Laptop("Mobil Hal", 3);
        System.out.println("Power indicator for mac: " + mac.isOn());
        mac.powerButton();
        mac.powerButton();
        System.out.println("Power indicator for mac: " + mac.isOn());
        mac.powerButton();
        System.out.println("Power indicator for mac: " + mac.isOn());
        System.out.println("Battery Power Level: " + mac.getBatteryLevel());
        System.out.println(mac.getUserName());
        System.out.println("Battery Power Level: " + mac.getBatteryLevel());
        mac.charge();
        System.out.println("Battery Power Level: " + mac.getBatteryLevel());




        SmartPhone lg = new SmartPhone("tiger", 4);
        System.out.println("Power indicator for phone: " + lg.isOn());
        lg.powerButton();
        System.out.println("Power indicator for phone: " + lg.isOn());
        System.out.println(lg.getPhoneNumber());
        System.out.println(lg.phoneHome());



        System.out.println("ID number for old: " + old.getId());
        System.out.println("ID number for mac: " + mac.getId());
        System.out.println("ID number for phone: " + lg.getId());

        SmartPhone newPhone = new SmartPhone();
        System.out.println("ID number for new phone: " + newPhone.getId());

    }
}
