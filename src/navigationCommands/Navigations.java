package navigationCommands;

import org.openqa.selenium.chrome.ChromeDriver;


/*
 * 1-How to navigate back and forward
 * 2-How to refresh page
 * 3-what is the difference between get() & navigate.to()
 */
public class Navigations {

	public static void main(String[] args) {
		//Chrome Browser //launch+and travel to website
				System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https:snapdeal.com/");
				//driver.get("https:amazon.com/");
				driver.navigate().to("https:amazon.com/");//alt way to go to website
				
				//1-How to navigate back and forward
				driver.navigate().back();//it will go a web-page back=so it goes from amazon back to snapdeal
				driver.navigate().forward();//it will go one webpage forward from snapdeal to amazon
				
				//2-How to refresh page
				driver.navigate().refresh();//will refresh/reload our webpage without clicking the btn on browser
				
				/*
				 * 3-what is the difference between get() & navigate.to()
				 * get() is used to navigate particular URL(website) and wait till page load.
				 * navigate().to() is used to navigate to particular URL and does not wait to page load. It ...
				 * ... maintains browser history or cookies to navigate back or forward.
				 * 
				 * Both the methods are used for opening URL in the browser.There is no difference between them.
				 * They are synonyms for one another.
				 * The only difference is that it can be found in the parameters.
				 * get() only gets one string parameter
				 * navigate().to() accepts String parameter and URL instance as parameter.
				 */

	}

}
