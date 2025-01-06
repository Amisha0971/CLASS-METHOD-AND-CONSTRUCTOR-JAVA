package ClassAndMehtod;

class Calculator {
    // Method without parameters
    void greet() {
        System.out.println("Welcome to the Calculator!");
    }

    // Method with parameters
    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.greet(); // Calling greet method

        int result = calc.add(5, 10); // Calling add method
        System.out.println("Addition Result: " + result);
    }
}

