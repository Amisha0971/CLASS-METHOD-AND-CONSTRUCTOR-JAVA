package Constructor;

class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Default Name";
        age = 0;
    }

    // Parameterized Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

 public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        person1.displayDetails();

        // Using Parameterized Constructor
        Person person2 = new Person("Alice", 25);
        person2.displayDetails();
    }
}
