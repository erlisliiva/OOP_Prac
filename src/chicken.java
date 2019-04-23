public class chicken extends bird implements flyable {

    chicken(String name, int age, int heightInMeters, int ID) {
        super(name, age, heightInMeters, ID);
    }

    public void fly() {
        System.out.println("chick not flaying...");
    }
}
