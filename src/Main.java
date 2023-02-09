public class Main {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop("Lenovo", 5000, false, false);
        SmartPhone apple = new SmartPhone("Apple", 4000, true, 2022);
        //Kalder forskellige metoder
        lenovo.touchScreen();
        lenovo.reloadPC();
        apple.printYear();
        apple.turnOn();
    }
}