public class Computer {
    private String model;
    private int price;
    private boolean isBoughtOnline;

    //Constructor
public Computer(String model, int price, boolean isBoughtOnline) {
    this.model = model;
    this.price = price;
    this.isBoughtOnline = isBoughtOnline;
}

    public void turnOn() {
        System.out.println("The computer has turned on");
    }

    public void reloadPC() {
        System.out.println("The computer just reloaded");
    }

}