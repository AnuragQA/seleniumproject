package package5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_rows_cols {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		
		         WebElement table=d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		         List<WebElement> rows=table.findElements(By.tagName("tr"));
		         System.out.println(rows.size());
		         
		         for (int i = 1; i < 11; i++) 
		         {
				    List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
				    
				    int j = 4;
				    if (j==4)
				    {
					   System.out.print(cols.get(j).getText()+" ");
				    	
					}
		         System.out.println();	 
		         	 
				 }
		         

	}

}
