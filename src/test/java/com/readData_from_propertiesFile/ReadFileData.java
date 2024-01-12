package com.readData_from_propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//reading data from file 


public class ReadFileData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. create file object 
		File file=new File("src/test/Resources/Features/Data1.properties");
		
		//2. vreate input filestream object 
		FileInputStream fileinput=null;
		
		try {        
			
			//here not mandatory for try catch but for advance we used
			
			//pass file object in input  stream
			fileinput =new FileInputStream(file);
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}

		
		
		//cerate propertied object
		Properties prop =new Properties();
		
		
		//load fileinput in propertied object 
		prop.load(fileinput);
		
		
		
		//using data  nby =  .getProperty() methid
		WebDriver driver=new ChromeDriver();
		 driver.get(prop.getProperty("URL"));
		
	}

}
