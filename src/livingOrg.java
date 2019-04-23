public class livingOrg {

    String name;
    int age;
    int heightInMeters;
    int ID;

    public livingOrg(String name, int age, int heightInMeters, int ID) {
        this.name = name;
        this.age = age;
        this.heightInMeters = heightInMeters;
        this.ID = ID;
    }


    public void eat() {
        System.out.println("eating....");
    }

    public void work() {
        System.out.println("working....");
    }

}



