public class Platypus extends Mammal {
    public Platypus(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Gnarrg!");
    }
    public void displayInfo() {
        System.out.println("Platypus - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}