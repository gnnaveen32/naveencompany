package com.shopbox.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aim22 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","F:/ff/geckodriver.exe");
	
	FirefoxDriver driver= new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://in.search.yahoo.com/yhs/web?hspart=iry&hsimp=yhs-fullyhosted_003&type=bgy_nrssi_17_21_ssg02&param1=1&param2=f%3D1%26b%3DFirefox%26cc%3Din%26pa%3Dwingy%26cd%3D2XzuyEtN2Y1L1Qzu0F0CtA0F0D0B0AyDtB0ByD0B0ByC0BzztN0D0Tzu0StCzyyBtBtN1L2XzutAtFtByCtFtBtFyDtCtN1L1Czu1StN1L1G1B1V1N2Y1L1Qzu2SyD0FtAyD0EyDyEyDtGyC0C0B0FtGyEzy0CtAtGtD0F0AyCtGyCtAzy0AtD0AyC0Fzy0CtDyE2QtN1M1F1B2Z1V1N2Y1L1Qzu2S0F0AyD0A0F0F0C0EtGtByB0DzztGyEyEyEtCtGzzzy0EyBtG0CzytBzzzytC0EyE0E0FtC0B2QtN0A0LzutD%26cr%3D91340426%26a%3Dbgy_nrssi_17_21_ssg02%26os_ver%3D10.0%26os%3DWindows%2B10%2BPro");
	
	WebElement e=driver.findElement(By.id("yschsp"));
	
	boolean i=e.isDisplayed();
	System.out.println(i);
	
}
}
