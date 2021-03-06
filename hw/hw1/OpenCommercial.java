/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    
    String url_foo = "http://www." + inputLine + ".com";
    // System.out.println(url_foo);
    URL url  = new URL(url_foo);
    InputStream ins = url.openStream();
    InputStreamReader insr = new InputStreamReader(ins);
    keyboard = new BufferedReader(insr);
    
    String[] res = new String[5];
    for (int i=0; i<5; i++) {
	res[i] = keyboard.readLine();
    }

    for (int i=4; i>=0; i--) {
	System.out.println(res[i]);
    }
    
    /*
    Syntax:
     for (type var : array) {
	 statement using var;
     }

    is equivalent to:
     for (int i=0; i<array.length; i++) {
	 type var = arr[i];
	 statements using var;
     }
     * So, I guess this is why we cannot use enhance for loop to assign
     *stream value to each element in the array
    */
    
  }
}
