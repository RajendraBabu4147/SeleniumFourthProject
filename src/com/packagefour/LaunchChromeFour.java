package com.packagefour;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeFour {

	public static void main(String[] args) throws InterruptedException {
		
		
				// System.setProperty - to set the path of the chromedriver.exe in your machine..
				System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
				
				//create an object of the chrome driver class..    
				WebDriver driver = new ChromeDriver();
				System.out.print("Chrome Driver object got created....");
				
				//open the client url
				String url = "https://www.rediff.com";
				driver.get(url);
				System.out.println("open the client url in chrome browser...");
				
				//maximize the browser window.
				driver.manage().window().maximize();
				System.out.println("Chrome browser window got maximized...");
				
				// make your selenium script to sleep for 3 seconds, to allow all the controls on the page to get loaded...
				Thread.sleep(3000);
				
				// 3000 milli seconds
				System.out.println("make your selenium script to wait for 3 seconds, for all the controls to get loaded...");
				
				//minimize the browser.
				//driver.manage().window().minimize();
				//System.out.println("now the chrome browser window is MINIMIZED...");
				//get the title of the page
				driver.getTitle();
				System.out.println("Title of the page....");
				
				//get the current url
				String my_curr_url = driver.getCurrentUrl();
				System.out.println("Current url for the page is :"+ my_curr_url);

				// get the current window handle
				String my_win_handle = driver.getWindowHandle();
				System.out.println("Window handle for the current browser Instance is :"+ my_win_handle);

				// click on 'Sign in' link in Rediff.com

				driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();

				System.out.println("clicked successfully on Sign in link....");

				Thread.sleep(2000);

				System.out.println("sleep for 2 seconds to allow it to got to next page...");

				//get the current url of the sign in page...

				System.out.println("sign in page current url is :"+driver.getCurrentUrl() );

				//get the current page title

				System.out.println("get the Sign in page title :"+ driver.getTitle());

				// navigate back

				driver.navigate().back();

				System.out.println("We are navigating back ......");

				//navigate forward

				driver.navigate().forward();

				System.out.println("forward movement happened....");

				//minimize and close the window

				driver.manage().window().minimize();

				System.out.println("minimize and close the window.....thanks...");

				driver.quit();
				
				System.out.println("****************** Try your Assessments **************");
				
				//close the browser

		        //driver.close();

		        //System.out.println("Chrome browser will get closed here....");   
	}

}
