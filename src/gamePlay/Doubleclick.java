//The purpose of this test is to verify that the user is not allowed to change the value of an already clicked square

package gamePlay;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Sites.startgame;
import Sites.tictacToe;

public class Doubleclick extends startgame {
	
	@Test
	public static void main() throws AWTException, InterruptedException
	
	{
		
		tictacToe game = new tictacToe();
		game.t3();
		   
		startgame play = new startgame();
		play.newGame();		
		
		Doubleclick twotimes = new Doubleclick();
		twotimes.secondClick();
	}
	public void secondClick() throws InterruptedException {
		
		WebElement x1 = ff.findElement(By.id("0"));  
		x1.click();
		
		System.out.println("Player X clicks the first cell");
	
		WebElement o1 = ff.findElement(By.id("0"));      
		o1.click();
		
		System.out.println("Player O clicks the first cell");
		
		String player;
		player = ff.findElement(By.id("0")).getText();
		
		//This assert is to verify which player populates the cell, in this case it should be player X
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals("X", player);
		
		Thread.sleep(1000);
	
		ff.quit();
		
		
	}

}
