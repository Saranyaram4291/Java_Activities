package session1;

public class Activity1_1 {

    public static void main(String[] args) {
	    // Object initialization
	    Car toyota = new Car();
	    toyota.make = 2014;
	    toyota.color = "Black";
	    toyota.transmission = "Manual";
	
		//Using Car class method
		toyota.displayCharacterstics();
		toyota.accelerate();
		toyota.brake();
    }

}