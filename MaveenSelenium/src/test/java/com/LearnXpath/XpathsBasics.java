package com.LearnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathsBasics {

	public static void main(String[] args) throws InterruptedException,IllegalMonitorStateException {
		// TODO Auto-generated method stub
//	Basic syntax	Xpath = //tagname[@name='firstname']
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://www.salesforce.com/in/form/sem/salesforce-crm/?d=7013y000002hbRLAAY&nc=7013y000002RHs6AAG&utm_source=google&utm_medium=sem&utm_campaign=in_br_alllobcon&utm_content=exact_7013y000002k1z5aakbr-google-/form/sem/salesforce-crm/&ef_id=CjwKCAjwgqejBhBAEiwAuWHioFP2t69fxyVcvO9pp8E8AwvsFariZLoTFnPVGps6PSzNnbbHE_1MuhoCBMYQAvD_BwE:G:s&s_kwcid=AL!4720!3!616080656080!e!!g!!salesforce&&ev_sid=3&ev_ln=salesforce&ev_lx=kwd-94920873&ev_crx=616080656080&ev_mt=e&ev_n=g&ev_ltx=&ev_pl=&ev_pos=&ev_dvc=c&ev_dvm=&ev_phy=9062119&ev_loc=&ev_cx=16895847353&ev_ax=137218384684&ev_efid=CjwKCAjwgqejBhBAEiwAuWHioFP2t69fxyVcvO9pp8E8AwvsFariZLoTFnPVGps6PSzNnbbHE_1MuhoCBMYQAvD_BwE:G:s&url=!https://clickserve.dartsearch.net/link/click?lid=43700074078535017&ds_s_kwgid=58700008151233901&gclid=CjwKCAjwgqejBhBAEiwAuWHioFP2t69fxyVcvO9pp8E8AwvsFariZLoTFnPVGps6PSzNnbbHE_1MuhoCBMYQAvD_BwE&gclsrc=aw.ds");
		//D.findElement(By.name("UserFirstName")).sendKeys("yogeshwar");
		//D.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("yogeshwar");
	
		//To find the dynamic webelements in a web page 
		//  //tagname[starts-with(@Atribute,'vale')]
		D.findElement(By.xpath("//input[starts-with(@id,'UserFirstName-')]")).sendKeys("test");
		//D.close();	
		D.findElement(By.xpath("//input[contains(@id,'UserLastName')]")).sendKeys("Reddy");
		
		
	}

}
