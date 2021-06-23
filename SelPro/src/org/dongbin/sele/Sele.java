package org.dongbin.sele;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Sele {

	public static void main(String[] args) {
		Sele sele = new Sele();
		sele.crawl();

	}
	//WebDriver
	private WebDriver driver;

	//ChromeOptions
	private ChromeOptions options;

	//Properties
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\Users\\kopo44\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	private String globalURL = "https://spotifycharts.com/regional/global/daily/latest";
	private String koreaURL = "https://spotifycharts.com/regional/kr/daily/latest";
	private String usaURL = "https://spotifycharts.com/regional/us/daily/latest";
	private String ukURL = "https://spotifycharts.com/regional/gb/daily/latest";
	private String franceURL = "https://spotifycharts.com/regional/fr/daily/latest";
	private String japanURL = "https://spotifycharts.com/regional/jp/daily/latest";
	private String germanURL = "https://spotifycharts.com/regional/de/daily/latest";
	
	public Sele() {
		options = new ChromeOptions();
		//options.addArguments("headless");
		options.addArguments("--disable-popup-blocking"); 

		//System Property SetUp
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

		//Driver SetUp
		driver = new ChromeDriver(options);

	}
	
	public void crawl() {
		String writeFileName = "C:\\Users\\kopo44\\Documents\\DataAna\\Mysel\\myChart.csv";
		
		try {
			driver.get(globalURL);
			String today = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/span/div[1]/div/div/div/div[3]/div")).getText();
			System.out.println(today);
			List<WebElement> globalRankElement = driver.findElements(By.className("chart-table-position"));
			List<WebElement> globaTitlelElement = driver.findElements(By.tagName("strong"));
			List<WebElement> globalSingerElement = driver.findElements(By.tagName("span"));
			Thread.sleep(1000);
			for (int i = 0; i < globalRankElement.size(); i ++) {
				System.out.println("Global Rank : " + globalRankElement.get(i).getText());
			}
			for (int i = 0; i < globaTitlelElement.size(); i ++) {
				System.out.println("Title : " + globaTitlelElement.get(i).getText());
			}
			for (int i = 1; i < globalSingerElement.size(); i ++) {
				System.out.println("Singer : " + globalSingerElement.get(i).getText().replaceAll("by ", ""));		
			}
			
			driver.get(koreaURL);
			List<WebElement> korRankElement = driver.findElements(By.className("chart-table-position"));
			List<WebElement> korTitleElement = driver.findElements(By.tagName("strong"));
			List<WebElement> korSingerElement = driver.findElements(By.tagName("span"));
			Thread.sleep(1000);
			for (int i = 0; i < korRankElement.size(); i ++) {
				System.out.println("Korea Rank : " + korRankElement.get(i).getText());
			}
			for (int i = 0; i < korTitleElement.size(); i ++) {
				System.out.println("Title : " + korTitleElement.get(i).getText());
			}
			for (int i = 1; i < korSingerElement.size(); i ++) {
				System.out.println("Singer : " + korSingerElement.get(i).getText().replaceAll("by ", ""));		
			}
			
			driver.get(usaURL);
			List<WebElement> usaRankElement = driver.findElements(By.className("chart-table-position"));
			List<WebElement> usaTitleElement = driver.findElements(By.tagName("strong"));
			List<WebElement> usaSingerElement = driver.findElements(By.tagName("span"));
			Thread.sleep(1000);
			for (int i = 0; i < usaRankElement.size(); i ++) {
				System.out.println("USA Rank : " + usaRankElement.get(i).getText());
			}
			for (int i = 0; i < usaTitleElement.size(); i ++) {
				System.out.println("Title : " + usaTitleElement.get(i).getText());
			}
			for (int i = 1; i < usaSingerElement.size(); i ++) {
				System.out.println("Singer : " + usaSingerElement.get(i).getText().replaceAll("by ", ""));		
			}
			
			driver.get(ukURL);
			List<WebElement> ukRankElement = driver.findElements(By.className("chart-table-position"));
			List<WebElement> ukTitleElement = driver.findElements(By.tagName("strong"));
			List<WebElement> ukSingerElement = driver.findElements(By.tagName("span"));
			Thread.sleep(1000);
			for (int i = 0; i < ukRankElement.size(); i ++) {
				System.out.println("Uk Rank : " + ukRankElement.get(i).getText());
			}
			for (int i = 0; i < ukTitleElement.size(); i ++) {
				System.out.println("Title : " + ukTitleElement.get(i).getText());
			}
			for (int i = 1; i < ukSingerElement.size(); i ++) {
				System.out.println("Singer : " + ukSingerElement.get(i).getText().replaceAll("by ", ""));		
			}
			
			driver.get(franceURL);
			List<WebElement> franceRankElement = driver.findElements(By.className("chart-table-position"));
			List<WebElement> franceTitleElement = driver.findElements(By.tagName("strong"));
			List<WebElement> franceSingerElement = driver.findElements(By.tagName("span"));
			Thread.sleep(1000);
			for (int i = 0; i < franceRankElement.size(); i ++) {
				System.out.println("France Rank : " + franceRankElement.get(i).getText());
			}
			for (int i = 0; i < franceTitleElement.size(); i ++) {
				System.out.println("Title : " + franceTitleElement.get(i).getText());
			}
			for (int i = 1; i < franceSingerElement.size(); i ++) {
				System.out.println("Singer : " + franceSingerElement.get(i).getText().replaceAll("by ", ""));		
			}
			
			driver.get(japanURL);
			List<WebElement> japanRankElement = driver.findElements(By.className("chart-table-position"));
			List<WebElement> japanTitleElement = driver.findElements(By.tagName("strong"));
			List<WebElement> japanSingerElement = driver.findElements(By.tagName("span"));
			Thread.sleep(1000);
			for (int i = 0; i < japanRankElement.size(); i ++) {
				System.out.println("Japan Rank : " + japanRankElement.get(i).getText());
			}
			for (int i = 0; i < japanTitleElement.size(); i ++) {
				System.out.println("Title : " +japanTitleElement.get(i).getText());
			}
			for (int i = 1; i < japanSingerElement.size(); i ++) {
				System.out.println("Singer : " + japanSingerElement.get(i).getText().replaceAll("by ", ""));		
			}
			
			driver.get(germanURL);
			List<WebElement> germanRankElement = driver.findElements(By.className("chart-table-position"));
			List<WebElement> germanTitleElement = driver.findElements(By.tagName("strong"));
			List<WebElement> germanSingerElement = driver.findElements(By.tagName("span"));
			Thread.sleep(1000);
			for (int i = 0; i < germanRankElement.size(); i ++) {
				System.out.println("Germany Rank : " + germanRankElement.get(i).getText());
			}
			for (int i = 0; i < germanTitleElement.size(); i ++) {
				System.out.println("Title : " + germanTitleElement.get(i).getText());
			}
			for (int i = 1; i < germanSingerElement.size(); i ++) {
				System.out.println("Singer : " + germanSingerElement.get(i).getText().replaceAll("by ", ""));		
			}
					
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writeFileName, true), "CP949"));
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
		
	}

}
