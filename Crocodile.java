public class Crocodile extends Reptile {
    public Crocodile(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Grrrrr!");
    }
    public void displayInfo() {
        System.out.println("Crocodile - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}