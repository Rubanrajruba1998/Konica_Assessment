package com.Gamil_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.Filereader.Page_Object_manager;
import com.Gmail.pom.Login_Page;
import com.helper.File_Reader_Manager;

public class Test_Runner extends Baseclass {
	public static WebDriver driver =getBrowser("Chrome");
	public static Page_Object_manager pom = new Page_Object_manager(driver);
	
public static void main(String[] args) throws Throwable {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String username="rubanraj.tester@gmail.com";
	String username1="rubsn@gmail.com";

	String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
	url(url);
	inputvalues(pom.getLogin().getUsername(), username);
	clickOptions(pom.getLogin().getNextbtn());
	inputvalues(pom.getLogin().getPassword(), "Rubsapr@1998");
	clickOptions(pom.getLogin().getPasswordbtn());
	String actual=(pom.getInbox().getIcon()).getAttribute("aria-label");;
	if(actual.contains("Rubanraj.tester H "))
	{
		System.out.println("True");
	}
	else
	{
	System.out.println("False");
	}
	driver.navigate().to("https://www.ebay.com/");
	inputvalues(pom.getEbay().getSearchfield(),"eletric guiter");
	clickOptions(pom.getEbay().getSearchfield());
	
	String price=pom.getEbay().getPrice().getText();
	System.out.println(price);
	//Negative  
	driver.navigate().to("https://www.gmail.com/");
	inputvalues(pom.getLogin().getUsername(), username1);
	if(actual.contains("Rubanraj.tester H "))
	{
		System.out.println("valid Username");
	}
	else
	{
	System.out.println("invalid Username");
	}
	
	
	


}
}
