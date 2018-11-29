package SeleniumConcepts;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {


		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\akkyu01\\eclipse-workspace\\JavaTraining\\SeleniumTrainingSession\\src\\main\\java\\com\\csdp\\qa\\config\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("user"));
		
		
		

	}

}
