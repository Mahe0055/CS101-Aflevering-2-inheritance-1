public class SmartPhone extends Computer {
    private int yearOfRelease;

    public SmartPhone (String model, int price, boolean isBoughtOnline, int yearOfRelease) {
        super(model, price, isBoughtOnline);
        this.yearOfRelease = yearOfRelease;
    }

    public void printYear() {
        System.out.println("The newest smartphone is from 2022");
    }

}
