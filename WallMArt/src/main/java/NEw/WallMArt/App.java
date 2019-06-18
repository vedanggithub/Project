package NEw.WallMArt;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
   
    System.setProperty("webdriver.chrome.driver", "/Users/vedangwhitebox/Desktop/chromedriver");
    WebDriver driver=new ChromeDriver();  
    driver.navigate().to("https://www.walmart.com/");
    driver.findElement(By.cssSelector("#global-search-input")).sendKeys("SmartWatch");
    driver.findElement(By.cssSelector("#global-search-submit > span > span")).click();
    driver.manage().window().maximize();
   // driver.navigate().back();
   // driver.navigate().forward();
   // driver.navigate().refresh();
    driver.findElement(By.cssSelector("#searchProductResult > ul > li.Grid-col.u-size-6-12.u-size-1-4-m.u-size-1-5-xl.search-gridview-first-col-item.search-gridview-first-grid-row-item > div > div.search-result-gridview-item.clearfix.arrange-fill > div:nth-child(2) > div > a > img")).click();
    driver.findElement(By.cssSelector("body > div.js-content > div > div > div.js-body-content > div > div.atf-content > div > div.atf-content > div > div > div > div > div.Grid > div.Grid > div:nth-child(2) > div:nth-child(1) > div > div > div > div.prod-VariantsSection.hf-BotRow > div > div > div > div.variant-options-container > span:nth-child(2) > div > div")).click();
    WebElement choose= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[3]/div[4]/div[2]/div[1]/div/div/div/div[12]/div/div/div[1]/select"));
    Select a=new Select(choose);
    a.selectByVisibleText("2");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[3]/div[4]/div[2]/div[1]/div/div/div/div[12]/div/div/div[2]/button")).click();
    
    
    }}
