import java.io.*;

public class Nuke2 {
    public static void main(String[] args) {
	BufferedReader keyboard;
	String input;

	keyboard = new BufferedReader(new InputStreamReader(System.in));

	String res;
	try{
	    input = keyboard.readLine();
	    res = input.charAt(0) + input.substring(2);
	    System.out.println(res);
	} catch (Exception e) {
	    System.out.println("***Error: " + e + ". Perhaps you type in a string containing" 
                               + "fewer than two characters! ");
	}
	
    }
}
