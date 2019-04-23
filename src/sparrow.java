public class sparrow extends bird implements flyable{

    public sparrow(String name, int age, int heightInMeters, int ID) {
        super(name, age, heightInMeters, ID);
    }

    @Override
    public void fly() {
        System.out.println("hehehehehe sparrow......");

    }
}
