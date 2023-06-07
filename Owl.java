public class Owl extends Bird {
    public Owl(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Hoo! Hoo!");
    }
    public void displayInfo() {
        System.out.println("Owl - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}