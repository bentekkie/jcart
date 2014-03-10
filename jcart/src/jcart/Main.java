package jcart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
public class Main {
	static OutputStream output = null;
	public static void main(String[] args) {
		
		
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			File yourFile = new File("config.properties");
			if(!yourFile.exists()) {
				prop.setProperty("one", Sound.one);
				prop.setProperty("two", Sound.two);
				prop.setProperty("three", Sound.three);
				prop.setProperty("four", Sound.four);
				prop.setProperty("five", Sound.five);
				prop.setProperty("six", Sound.six);
				prop.setProperty("seven", Sound.seven);
				prop.setProperty("eight", Sound.eight);
				prop.setProperty("nine", Sound.nine);
				try {
					output = new FileOutputStream("config.properties");
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			try {
				prop.store(output, null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			} 
			input = new FileInputStream(yourFile);
	 
			// load a properties file
			prop.load(input);
	 
			// get the property value and print it out
			Sound.one = prop.getProperty("one");
			Sound.two = prop.getProperty("two");
			Sound.three = prop.getProperty("three");
			Sound.four = prop.getProperty("four");
			Sound.five = prop.getProperty("five");
			Sound.six = prop.getProperty("six");
			Sound.seven = prop.getProperty("seven");
			Sound.eight = prop.getProperty("eight");
			Sound.nine = prop.getProperty("nine");
	 
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Booting up");
		
		Gui.main(args);

	}

}