
package faily;

import java.io.*;


public class faily {
    public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("sample1.text");
	fw.close();
	FileReader fr = new FileReader("sample2.text");
	fr.close();
    }
    
}
