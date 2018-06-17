public class test {
    static X[] xa = new X[5];
    static Y[] ya = new Y[5];

    public static boolean assign(X[] x, Y[] y) {
	try {
	    x = y;
	} catch (Exception e) {
	    return false;
	}
	return true;
    }

    public static boolean assign(Y[] y, X[] x) {
	try {
	    y = (Y[])x;
	} catch (Exception e) {
	    return false;
	}
	return true;
    }


    public static void main(String[] args) {
	boolean res = assign(xa, ya);
	try{
	    boolean res2 = assign(ya, xa);
	    System.out.println("Can we assign xa to ya? " + res2);
	} catch (Exception e) {
	    System.out.println("**Error: " + e);
	}
	System.out.println("Can we assign ya to xa? " + res);

	for(X ele: xa) {
	    ele = new Y();
	}
	try{
	    boolean res3 = assign(ya, xa);
	    System.out.println("If the array of type X[] references objects that are all of Class Y, can we assign xa to ya? " + res3);
	} catch (Exception e) {
	    System.out.println("**Error: " + e);
	}
    }
}
