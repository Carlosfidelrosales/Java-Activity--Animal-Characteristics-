public class Lizard extends Reptile {
    public Lizard(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Tsktsk!");
    }
    public void displayInfo() {
        System.out.println("Lizard - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}