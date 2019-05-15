package Sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//This is a 'base' class used by all tests to define the web driver and navigate to the web page where the tic tac toe game exists.

public class tictacToe  {
	
	
	public static WebDriver ff;

	public void t3 () throws InterruptedException
	{	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\usbrsan\\Documents\\Selenium and Webdriver\\geckodriver.exe");
		ff = new FirefoxDriver();
		
		ff.manage().window().maximize();
		
	ff.get("https://codepen.io/jshlfts32/full/bjambP/");

	
		
	}
	}

