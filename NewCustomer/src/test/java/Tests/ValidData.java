package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Common.BaseClass;

public class ValidData extends BaseClass {
  @Test
  public void Valid001 () throws InterruptedException {
	  driver.findElement(By.name("accountno")).sendKeys("abc");
	  
	  String Actualmsg = "Characters are not allowed";
	  String Expectmsg = driver.findElement(By.id("message2")).getText();
		
		if(Actualmsg.equals(Expectmsg))
		{
			System.out.println("Passed abc");
		}
		else
		{
			System.out.println("Failed abc");
		} 
		Thread.sleep(2000);
		driver.findElement(By.name("accountno")).clear();
		
		
//		-------------------------------------------------------------------------------	
		  
		  driver.findElement(By.name("accountno")).sendKeys("##$$");
		  
		  String Actualmsg2 = "Special characters are not allowed";
		  String Expectmsg2 = driver.findElement(By.id("message2")).getText();
			
			if(Actualmsg2.equals(Expectmsg2))
			{
				System.out.println("Passed ##$$");
			}
			else
			{
				System.out.println("Failed ##$$ ");
			} 
			driver.findElement(By.name("res")).click();
			Thread.sleep(2000);
			
//			-------------------------------------------------------------------------------	
			  
			  driver.findElement(By.name("accountno")).sendKeys("abc$$");
			  
			  String Actualmsg3 = "Special characters are not allowed";
			  String Expectmsg3 = driver.findElement(By.id("message2")).getText();
				
				if(!Actualmsg3.equals(Expectmsg3))
				{
					System.out.println("Passed abc$$");
				}
				else
				{
					System.out.println("Failed abc$$ ");
				} 
				
				driver.findElement(By.name("res")).click();
				Thread.sleep(2000);
//				-------------------------------------------------------------------------------	
				  driver.findElement(By.name("accountno")).sendKeys("abc123");
				  
				  String Actualmsg4 = "Characters are not allowed";
				  String Expectmsg4 = driver.findElement(By.id("message2")).getText();
					
					if(Actualmsg4.equals(Expectmsg4))
					{
						System.out.println("Passed abc123");
					}
					else
					{
						System.out.println("Failed abc123");
					} 
					Thread.sleep(2000);
					driver.findElement(By.name("res")).click();
					
//					-------------------------------------------------------------------------------	
					  
					  driver.findElement(By.name("accountno")).sendKeys("86169##$$");
					  
					  String Actualmsg5 = "Special characters are not allowed";
					  String Expectmsg5 = driver.findElement(By.id("message2")).getText();
						
						if(Actualmsg5.equals(Expectmsg5))
						{
							System.out.println("Passed 86169##$$");
						}
						else
						{
							System.out.println("Failed 86169##$$ ");
						} 
						//driver.findElement(By.name("res")).click();
						Thread.sleep(2000);
					
					
	  
  }
}
