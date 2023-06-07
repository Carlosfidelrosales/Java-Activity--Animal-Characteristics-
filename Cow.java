public class Cow extends Mammal {
    public Cow(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Moo! Moo!");
    }
    public void displayInfo() {
        System.out.println("Cow - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}