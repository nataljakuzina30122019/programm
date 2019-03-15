
package faily;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args)  {
	
	try {
	    FileWriter myWriter = new FileWriter("fileName.txt");
	    myWriter.write("То что записывается в документ!");
	    myWriter.close();
	    System.out.println("Successfully wrote to the file");
	    
	} catch (IOException e) {
		System.out.println("An error occure.");
		e.printStackTrace();
		}
	    
	}
	
    
    
}
