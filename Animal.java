public abstract class Animal {
    private String name;
    private int age;
    private String gender;
  
    public Animal(String name, int age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // This is for the sound by different animals present in the program.
    public abstract void speak();

    // This shows the basic information of the animal like its name, age, and gender.
    public abstract void displayInfo();
  
    // This collects the name (in string) entered from the Main.java file.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
    // This collects the age (in integer) entered from the Main.java file.
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // This collects the gender (in string) entered from the Main.java file.
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
  

    // PROGRAM DISPLAY (MAIN CLASS)


    public static void main(String[] args) {
    // Animals classified as BIRDS
        System.out.println("BIRDS");

        Owl owl = new Owl("Ceddy", 10, "Female");
        owl.displayInfo();
        owl.speak();
  
        Parrot parrot = new Parrot("Christian", 4, "Male");
        parrot.displayInfo();
        parrot.speak();
        System.out.println("");

    // Animals classified as MAMMALS
        System.out.println("MAMMALS");

        Cow cow = new Cow("Penelope", 6, "Male");
        cow.displayInfo();
        cow.speak();

        Platypus platypus = new Platypus("Perry", 8, "Male");
        platypus.displayInfo();
        platypus.speak();
        System.out.println("");
    
    // Animals classified as REPTILES
        System.out.println("REPTILES");

        Lizard lizard = new Lizard("Jett", 10, "Female");
        lizard.displayInfo();
        lizard.speak();

        Crocodile crocodile = new Crocodile("Lolong", 25, "Male");
        crocodile.displayInfo();
        crocodile.speak();
    }
}