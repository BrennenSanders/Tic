//The purpose of this test is to verify that the user is prompted with the correct message when player X wins


package gamePlay;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Sites.startgame;
import Sites.tictacToe;
@Test
public class XWin extends startgame {
	
	public static void main()throws AWTException, InterruptedException
	
	{
		tictacToe game = new tictacToe();
		game.t3();
		
		startgame play = new startgame();
		play.newGame();
		
		XWin win = new XWin();
		win.firstxMove();
		

		
	}
	
	public void firstxMove() throws InterruptedException{
		
	//The following web elements are for the cell's that the user will click to place their X's and O's	
	WebElement x1 = ff.findElement(By.id("0"));
	x1.click();
	
	WebElement o1 = ff.findElement(By.id("4"));	
	o1.click();
	
	WebElement x2 = ff.findElement(By.id("5"));
	x2.click();
	
	WebElement o2 = ff.findElement(By.id("8"));
	o2.click();
	
	WebElement x3 = ff.findElement(By.id("10"));
	x3.click();
	
	WebElement o3 = ff.findElement(By.id("12"));
	o3.click();
	
	WebElement x4 = ff.findElement(By.id("15"));
	x4.click();

	Thread.sleep(1000);
	
	
//This is the message presented to the winner of the game
	String winner;
	winner = ff.findElement(By.id("endgame")).getText();
	System.out.println(winner);
	
//This assert is to verify that the correct winner(Player X) is presented with the correct message
	SoftAssert assertion=new SoftAssert();
	assertion.assertEquals("Congratulations player X! You've won. Refresh to play again!", winner);
	
	Thread.sleep(1000);
	ff.quit();
	}

	
}
