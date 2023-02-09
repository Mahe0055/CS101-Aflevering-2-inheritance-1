public class Laptop extends Computer {
    private boolean isTouchable;

    public Laptop (String model, int price, boolean isBoughtOnline, boolean isTouchable) {
        super(model, price, isBoughtOnline);
        this.isTouchable = isTouchable;
    }

    public void touchScreen() {
        System.out.println("The laptop screen is touchable");
    }
}
