public class Parrot extends Bird {
    public Parrot(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Squawk!");
    }
    public void displayInfo() {
        System.out.println("Parrot - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
