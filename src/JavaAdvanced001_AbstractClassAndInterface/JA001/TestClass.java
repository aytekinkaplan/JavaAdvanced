package JavaAdvanced001_AbstractClassAndInterface.JA001;

public class TestClass {
    public static void main(String[] args) {
        // Create an object of the class Bina
        //Insan object = new Insan();
        Building object = new Building();
        System.out.println(object.meterHeight()); // Print the height in meters
        System.out.println(object.centimeterHeight()); // Print the height in centimeters
        System.out.println(object.kilometerHeight()); // Print the height in kilometers
    }

    // Interface named Height defining methods related to height
    interface Height {
        int variable = 0; // A constant variable

        // A static method providing description about the interface
        static String description() {
            return "Guarantees providing height information for classes implementing this interface.";
        }

        // Method to return height in centimeters
        int centimeterHeight();

        // Method to return height in meters
        double meterHeight();

        // A default method to return height in kilometers
        default double kilometerHeight() {
            return 0;
        }
    }

    // Abstract class named Animal implementing the Height interface
    abstract static class Animal implements Height {
        private int height; // Height
        private int weight; // Weight

        // Abstract method to determine if the animal is alive
        public abstract boolean isAlive();

        // Constructor for the Animal class
        public Animal(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        // Getter method for height
        public int getHeight() {
            return height;
        }

        // Setter method for height
        public void setHeight(int height) {
            this.height = height;
        }

        // Getter method for weight
        public int getWeight() {
            return weight;
        }

        // Setter method for weight
        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    // Subclass named Human extending the Animal class
    static class Human extends Animal {

        // Constructor for the Human class
        public Human(int height, int weight) {
            super(height, weight); // Calls the constructor of the superclass and provides required parameters
        }

        // Override method to determine if the human is alive
        @Override
        public boolean isAlive() {
            return false;
        }

        // Override method to return height in centimeters
        @Override
        public int centimeterHeight() {
            return 0;
        }

        // Override method to return height in meters
        @Override
        public double meterHeight() {
            return this.getHeight() / 100.0;
        }
    }

    // Subclass named Building implementing the Height interface
    static class Building implements Height {
        // Method to return height in centimeters
        @Override
        public int centimeterHeight() {
            return 2000;
        }

        // Method to return height in meters
        @Override
        public double meterHeight() {
            return 20;
        }

        // Method to return height in kilometers
        @Override
        public double kilometerHeight() {
            return 0.02;
        }
    }
}
