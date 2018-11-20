package input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static String file_load(String file) {
	
	String read = "";
	try {
	    Scanner in = new Scanner(new File("files/file/" + file));
	    while(in.hasNext())
	    read += in.nextLine()+"\r\n";
	    in.close();
	} catch (IOException ex){}
	
	return read;
	}
	
	public static void file_save(String file,String text) {
		
	try {
	     FileWriter nwrite = new FileWriter("files/file/" + file);
	        
	     nwrite.write(text);
	     nwrite.close();
	       	   
	    } catch (IOException ex){}	
	
	}
	
}
