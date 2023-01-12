package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step 1: Convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./testdata/data.properties");
		
		//Step 2: Create an instance of Properties object
		Properties property = new Properties();
		
		//Step 3: Load all the key-value pairs into Properties object
		property.load(fis);
		
		//Step 4: Read data from Properties file
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		System.out.println(url+"\n"+username);

	}

}
