package Sites;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class startgame extends tictacToe{


	public static void main(String args[]) throws AWTException, InterruptedException
	{
	
	tictacToe game = new tictacToe();
	game.t3();
	startgame play = new startgame();
	play.newGame();
		
	}
	
public void newGame() throws AWTException, InterruptedException
{
	
	Thread.sleep(1000);
	
	
	//Switches to iframe in order to engage text input.
	ff.switchTo().frame("result");

	//Web element for text input which determines size of the playing field.
	WebElement number = ff.findElement(By.xpath("//*[@id='number']"));

	//Web element for the button that starts the game.
	WebElement play = ff.findElement(By.xpath("//*[@id='start']"));
	
	
	number.sendKeys("4");
	play.click();

}


}