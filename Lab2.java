package edu.neu.mgen;


abstract class Animal {
    String name;
    String typicalSize;
    int typicalWeight;
    boolean isPredator;
    boolean isVegetartian;

    // Constructor
    public Animal(String name, String size, int weight, boolean isPredator, boolean isVeg) {
        this.name = name;
        this.typicalSize = size;
        this.typicalWeight = weight;
        this.isPredator = isPredator;
        this.isVegetartian = isVeg;
    }

    abstract void displayInfo();
}

class Bird extends Animal {
    String speciesName;
    int wingspan;

    public Bird(String name, String size, int weight, boolean isPredator, boolean isVeg, String speciesName, int wingspan) {
        super(name, size, weight, isPredator, isVeg);
        this.speciesName = speciesName;
        this.wingspan = wingspan;
    }

    // Implementation of the abstract method
    @Override
    void displayInfo() {
        System.out.println("Type: Bird");
        System.out.println("Name: " + name);
        System.out.println("Is Predator? " + isPredator);
        System.out.println("Species Name: " + speciesName);
        System.out.println("Wingspan: " + wingspan + " cm");
    }
}

class LandAnimal extends Animal {
    int numberOfLegs;

    // Constructor
    public LandAnimal(String name, String size, int weight, boolean isPredator, boolean isVeg, int numberOfLegs) {
        super(name, size, weight, isPredator, isVeg);
        this.numberOfLegs = numberOfLegs;
    }

    // Implementation of the abstract method
    @Override
    void displayInfo() {
        System.out.println("Type: Land Animal");
        System.out.println("Name: " + name);
        System.out.println("Typical Weight: " + typicalWeight);
        System.out.println("Is Predator? " + isPredator);
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}

class Fish extends Animal {
    int numberOfFins;
    String species;
    boolean hasGills;

    // Constructor
    public Fish(String name, String size, int weight, boolean isPredator, boolean isVeg, int numberOfFins, String species, boolean hasGills) {
        super(name, size, weight, isPredator, isVeg);
        this.numberOfFins = numberOfFins;
        this.species = species;
        this.hasGills = hasGills;
    }

    // Implementation of the abstract method
    @Override
    void displayInfo() {
        System.out.println("Type: Fish");
        System.out.println("Name: " + name);
        System.out.println("Typical size: " + typicalSize);
        System.out.println("Is Predator? " + isPredator);
        System.out.println("Number of Fins: " + numberOfFins);
        System.out.println("Species: " + species);
        System.out.println("Has Gills? " + hasGills);
    }
}

public class Lab2 {
    public static void main(String[] args) {
        // Creating instances of different animals
        Bird eagle = new Bird("Eagle", "Medium", 20, true, false, "Golden Eagle", 200);
        LandAnimal bull = new LandAnimal("bull", "Large", 1500, false, true, 4);
        Fish catfish = new Fish("Catfish", "Intermediate", 350, true, false,  3, "Blue Catfish", true);

        // Displaying information about each animal
        eagle.displayInfo();
        System.out.println();

        bull.displayInfo();
        System.out.println();

        catfish.displayInfo();
    }
}
