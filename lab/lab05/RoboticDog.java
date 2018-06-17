public class RoboticDog extends Animal implements Robotic {
    // public static final int leg=4;
    public boolean bark(int a) {
	System.out.println("woh!");
	return true;
    }
	
    public void speak(String a) {
	System.out.println("I'm a RoboticDog and my name is: " + a);
    }
    
    public static void main (String[] args) {
	// System.out.println("RoboticDog leg: " + RoboticDog.leg);
	System.out.println("Animal leg: " + Animal.leg);
	System.out.println("Robotic leg: " + Robotic.leg);
	/*
	 * Define a variable whose static type is the subclass and which references
	 * an object of the subclass.  If we cast the variable to the superclass type
	 * before calling the overridden method. does Java call the superclass method 
	 * or the subclass method?
	 */
	RoboticDog dog = new RoboticDog();
	dog.speak("Peter");

	/*
	 * Define a variable whose static type is the superclass and which references
	 * an object of the superclass (but not the subclass).  If we cast the
	 * variable to the subclass type before calling the method, does Java call
	 * the superclass method or the subclass method?
	 */
	Animal ani = new Animal();
	ani = (RoboticDog)ani;
	ani.speak("Peter");
	
    }	
		   	
}
