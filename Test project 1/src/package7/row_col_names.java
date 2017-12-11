package package7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class row_col_names {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
	
              for (int i = 1; i <= 10; i++)
              {
				for (int j = 1; j <= 5; j++) 
				{
		        String names=d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(names+" ");	
				}
            	System.out.println();  
            	  
		      }
	}

}
