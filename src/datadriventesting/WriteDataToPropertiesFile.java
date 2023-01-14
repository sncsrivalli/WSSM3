package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		// Step 1: Convert physical file into java readable object
		// Throws FileNotFoundException - java exception
		FileInputStream fis = new FileInputStream("./testdata/data.properties");

		// Step 2: Create instance for Properties class
		// Import Properties class from java.util package
		Properties property = new Properties();

		// Step 3: Load all the key-value pairs from fis to the Properties object
		// It throws IOException - java exception
		property.load(fis);
		
		//Step 4: Write data to properties object
		property.put("key","value");
		
		//Step 5: Save data to properties object
		FileOutputStream fos = new FileOutputStream("./testdata/data.properties");
		property.store(fos, "Updated properties file Successfully");

	}

}
