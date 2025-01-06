package ClassObjectAndConstructor;

public class Demo {
	 String brand;
	    int speed;

	    // Default Constructor
	    Demo() {
	        brand = "Unknown";
	        speed = 0;
	    }

	    // Parameterized Constructor
	    Demo(String b, int s) {
	        brand = b;
	        speed = s;
	    }

	    // Method to display car details
	    void display() {
	        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
	    }

	    // Method to accelerate the car
	    void accelerate(int increase) {
	        speed += increase;
	        System.out.println("The car accelerated. New speed: " + speed + " km/h");
	    }

 public static void main(String[] args) {
		        // Using Default Constructor
		    	Demo car1 = new Demo();
		        car1.display();

		        // Using Parameterized Constructor
		        Demo car2 = new Demo("Toyota", 120);
		        car2.display();

		        // Using Methods
		        car2.accelerate(30);
		    }
		


	}


