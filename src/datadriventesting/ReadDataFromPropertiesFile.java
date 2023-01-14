package datadriventesting;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step 1: Convert physical file into java readable object
		//Throws FileNotFoundException - java exception
		FileInputStream fis = new FileInputStream("./testdata/data.properties");

		//Step 2: Create instance for Properties class
		//Import Properties class from java.util package
		Properties property = new Properties();
		
		//Step 3: Load all the key-value pairs from fis to the Properties object
		//It throws IOException - java exception
		property.load(fis);
		
		//Step 4: Read data from Properties
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		long time = Long.parseLong(property.getProperty("time"));
		
		System.out.println(url+"\n"+username+"\n"+password+"\n"+time);
		System.out.println(property.getProperty("url1"));
		System.out.println(property.getProperty("url2"));
	}

}
