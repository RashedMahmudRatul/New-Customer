package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Common.BaseClass;

public class ValidData extends BaseClass {
  @Test
  public void Valid001 () {
	  driver.findElement(By.name("name")).sendKeys("ANAZ");
	  
  }
}
