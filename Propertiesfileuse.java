package SeleniumPractice.SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Propertiesfileuse {
	
	Properties p= new Properties();
	
	
	@Test
	public void getURLLocators() throws IOException
	{
	
		File file=new File("./InputFile/locators.properties");
		FileInputStream fs=new FileInputStream(file);
		p.load(fs);
		WebDriver driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		
		File file1=new File("./Excelfile/Users data.xlsx");
		FileInputStream fis=new FileInputStream(file1);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell= row.getCell(0);
		XSSFCell cell1=row.getCell(1);
		XSSFCell cell2=row.getCell(2);
		XSSFCell cell3=row.getCell(3);
		XSSFCell cell4=row.getCell(4);
		XSSFCell cell5=row.getCell(5);
		
		String FIRSTNAME=cell.getStringCellValue();
		String LASTNAME=cell1.getStringCellValue();
		String EMAIL=cell2.getStringCellValue();
		double NUMBER=cell3.getNumericCellValue();
		String Mobile=Double.toString(NUMBER);
		String ADDRESS=cell4.getStringCellValue();
		String GENDER=cell5.getStringCellValue();
		
		driver.findElement(By.xpath(p.getProperty("fname"))).sendKeys(FIRSTNAME);
		driver.findElement(By.xpath(p.getProperty("lname"))).sendKeys(LASTNAME);
		driver.findElement(By.xpath(p.getProperty("email_add"))).sendKeys(EMAIL);
		driver.findElement(By.xpath(p.getProperty("gender"))).sendKeys(GENDER);
		driver.findElement(By.xpath(p.getProperty("phone_number"))).sendKeys(Mobile);          // giving error 1.23456789
		driver.findElement(By.xpath(p.getProperty("address"))).sendKeys(ADDRESS);
		
		List<WebElement> hobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement hobby : hobbies) {
			if (!hobby.isSelected()) {
				hobby.click();
			}
		}
		
		WebElement languageList = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.id("Skills"));
		Select skills = new Select(ele);
		skills.selectByIndex(4);

		WebElement ele1 = driver.findElement(By.id("countries"));
		Select country = new Select(ele1);
		country.selectByIndex(0);

		WebElement selectcountry = driver
				.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		selectcountry.click();
		WebElement sendcountry = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		sendcountry.sendKeys("India");
		sendcountry.sendKeys(Keys.ENTER);

		WebElement ele2 = driver.findElement(By.id("yearbox"));
		Select year = new Select(ele2);
		year.selectByValue("1926");

		WebElement ele3 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month = new Select(ele3);
		month.selectByVisibleText("May");

		WebElement ele4 = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select day = new Select(ele4);
		day.selectByVisibleText("18");

		WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys(p.getProperty("password"));

		WebElement confirmpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		pass.sendKeys(p.getProperty("confirm_password"));

		WebElement submitbtn = driver.findElement(By.id("submitbtn"));
		submitbtn.click();
		//fs.close();
		//driver.quit();
	}
	

}
