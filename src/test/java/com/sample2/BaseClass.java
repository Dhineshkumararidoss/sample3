package com.sample2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

     protected static WebDriver driver;
	 public static void driverManager() {
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	}
		
 public static void driverUrl(String url) {
		driver.get(url);

	}
	public static void driverMaximize() {
	 driver.manage().window().maximize();

	}

	// 1. // Id
	public WebElement elementFindById(String value) {
		WebElement element = driver.findElement(By.id(value));
		return element;
	}

	// 2.AttributeValue
	public WebElement elementFinByValue(String Value) {
		WebElement element = driver.findElement(By.name(Value));
		return element;
	}

	// 3.className
	public WebElement elementFindByClassName(String Value) {
		WebElement element = driver.findElement(By.className(Value));
		return element;
	}

	// 4.x path
	public WebElement elementFindByXPath(String value) {
		WebElement element = driver.findElement(By.xpath(value));
		return element;
	}

	// 5. SendKeys
	public void methodUsingSendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	// 6.click
	public void methodUsingClick(WebElement element) {
		element.click();
	}

	// 7.Text
	public String usingGetText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 8. get Attribute
	public String usingGetAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}

	// 9. using Action movetoElement
	public void usingMoveToElement(WebElement element) {
		Actions action1 = new Actions(driver);
		action1.moveToElement(element).perform();
	}

	// 10. Drag and Drop
	public void usingDragAndDrop(WebElement element) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, element);
	}

	// 11. contextClick
	public void usinfCotextClick(WebElement element) {
	}

	// 12. double Click
	public void usingDoubleclick(WebElement element) {
	}

	// 13.Alert
	public Alert usingSwitchAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	// 14. simple alert
	public void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// 15.confirm alert
	public void confirmAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// 16.prompt alert
	public void promptAlert(Alert alert, String Value) {
		alert.sendKeys(Value);

	}

	// 17. getText
	public String getText(Alert alert) {
		String text = alert.getText();
		return text;
	}

	// 18.js insert the value
	public void elementSenKeys(WebElement element, String Value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value','" + Value + "')", element);
	}

	// 19.js retrive the value
	public String elementRetriveJs(WebElement element, String Value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("return.argument[0].getAttribute('value')", element);
		String string = executeScript.toString();
		return string;
	}

	// 20. click
	public void clickUsingJs(WebElement element, String Script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", element);
	}

	// 21. scrollDown
	public void scrooDownUsingJs(WebElement element, String Script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", element);

	}

	// 22. scrollUp
	public void scrooUpUsingJs(WebElement element, String Script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(false)", element);
	}

	// 23.take ScreenShot
	public File usigScreenShot(File file, TakesScreenshot ts) {
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File screenshotAs = ts1.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	// 24.copyfile
	public void usingCopyTheFile(File file) {
	}

	// 25.select by index
	public  void usingIndex(WebElement element, int no) {
		
		Select select = new Select(element);
		select.selectByIndex(no);
	}

	// 26.select by value
	public  void usingValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	// 27.select by visibleText
	public  void usingText( WebElement element , String txt) {
		Select select = new Select(element);
		select.selectByVisibleText(txt);
	}

	// 28. get Option
	public List<WebElement> usingDropDownGetOption(WebElement element, Select select) {
		Select select1 = new Select(element);
		List<WebElement> options = select1.getOptions();
		return options;
	}

	// 29.size
	public int usingDropDownSize(WebElement element, Select select) {
		Select select1 = new Select(element);
		List<WebElement> options = select1.getOptions();
		int size = options.size();
		return size;
	}

	// 30. getAllSelecteedOption
	public List<WebElement> getAllOption(WebElement element, Select selects) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	// 31. firstSelectedOption
	public WebElement firstSelectOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}
	// 32.is multiple

	private boolean multiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 33.deSelectByIndex

	public  void deSelectIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.deselectByIndex(10);
	}

	// 34.deSelectByValue
	public void deSelectValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 35. deSelect By visibleText
	public void deSelectVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText("text");
	}

	// 36 deSelectAll
	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 37. text index
	public String textSelectedOption(WebElement element, int Value) {
		Select select1 = new Select(element);
		List<WebElement> options = select1.getOptions();
		WebElement webElement = options.get(10);
		String text = webElement.getText();
		return text;
	}

	// 38. senkeys text
	public void textUsingSendkeys(WebElement element, String text) {
		WebElement findElement = driver.findElement(By.id(text));
		findElement.sendKeys("sports");
	}

	// 39.window handles
	public WebDriver switchStringUrl(String Value) {
		WebDriver window = driver.switchTo().window(Value);
		return window;
	}

	// 40. String Tittle
	public WebDriver switchWindowTitle(String title) {
		WebDriver window = driver.switchTo().window(title);
		return window;
	}

	// 41. window id
	public WebDriver switchWindowId(String id) {
		WebDriver window = driver.switchTo().window(id);
		return window;
	}

	// 42.get parentWindow
	public String getParentWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// 43.get Child Window
	public Set<String> getChildWindowid() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	// 44. frame
	public WebDriver frameUsingId(String Value) {
		WebDriver frame = driver.switchTo().frame(Value);
		return frame;
	}

	// 45. frame WebElement reference
	public WebDriver frameUsingWebElementReference(String Value) {
		WebDriver frame = driver.switchTo().frame(Value);
		return frame;
	}

	// 46 frame name
	public WebDriver frameUsingWebElementName(String value) {
		WebDriver frame = driver.switchTo().frame(value);
		return frame;
	}
	// 47.frames in using Index

	public WebDriver frameUsingWebIndex(int index) {
		WebDriver frame = driver.switchTo().frame(5);
		return frame;
	}

	// 48. switch to parentFrame
	public WebDriver switchParentFrame() {
		WebDriver parentFrame = driver.switchTo().parentFrame();
		return parentFrame;
	}

	// 49. main url page
	private WebDriver mainPage() {
		WebDriver content = driver.switchTo().defaultContent();
		return content;
	}

	// 50. tagName
	private int frameSize(String id) {
		List<WebElement> findElements = driver.findElements(By.tagName(id));
		int size = findElements.size();
		return size;
	}

	// 51.Thread
	public void thread(int Value) throws InterruptedException {
		Thread.sleep(Value);
	}

	// 52. implecityWait
	public void implicityBase(String Value, int seconds) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);

	}
	// 53.WebDriverWait

	public WebDriverWait baseWebDriverWait(int no) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(no));
		return waits;
	}

	// 54. senkeys method
	public void baseWebDriverWait1(WebElement element, String pass) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement until = waits.until(ExpectedConditions.visibilityOfElementLocated(By.id(pass)));
		element.sendKeys("data");
	}

	// 55. fluent Wait
	public Wait fluentWait(int value, String data) {

		Wait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(20))
				.ignoring(Exception.class);
		Object until = w.until(ExpectedConditions.visibilityOfElementLocated(By.id(data)));
		WebElement element = (WebElement) until;
		return w;

	}

	// 56 for entire page
	public void entirePage(int Value) {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

	// 57 script avoid
	private void scriptAvoidTimeOut(int Value) {
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

	}

	// 58.web table
	private List<WebElement> tablerow(String Value) {
		List<WebElement> findElements = driver.findElements(By.tagName("tr"));
		return findElements;

	}

	// 59. size
	private int tablerowSize(String Value, WebElement element) {
		List<WebElement> findElements = driver.findElements(By.tagName("tr"));
		int size = findElements.size();
		return size;
	}

	// 60 . text Row
	private String tablerowText(String Value, WebElement element) {
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			WebElement elements = tRow.get(i);
			String text = element.getText();
			return text;
		}
		return Value;
	}

	// 61
	private String tablerow1(String Value, WebElement element) {
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			tRow.get(i);
		}
		List<WebElement> tdata = driver.findElements(By.tagName("td"));

		for (int j = 0; j < tdata.size(); j++) {
			tdata.get(j);

			String text = element.getText();
			return text;
		}
		return Value;
	}

	// 62.getExcelCellValue
	public   String getCell(String sheetname, int rowno, int cellno) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\Dhinesh\\eclipse-workspace\\FrameWorkClass1\\File\\Reservation.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simpledateFormat = new SimpleDateFormat("dd/MM/yyyy");
				res= simpledateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (round == numericCellValue) {
					res = String.valueOf(round);
				} else {
					res= String.valueOf(numericCellValue);
				}
			}
			
		default:
			break;
		}
	return res;
	}

	
	




	// 63. update Value
	public void updateValueExcel(String sheetName, int rowno, int cellno, String OldData, String NewData)
			throws IOException {
		File file = new File("C:\\Users\\Dhinesh\\eclipse-workspace\\FrameWorkClass1\\File\\Reservation.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("adactin");
		Row row = sheet.getRow(5);
		Cell cell = row.getCell(3);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals("oldValue")) {
			cell.setCellValue("newCellValue");
		}
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);

	}

	// 64.create Cell
	public void createCell(String sheetName, int rowno, int cellno, String NewData) throws IOException {

		File file = new File("C:\\Users\\Dhinesh\\eclipse-workspace\\FrameWorkClass1\\File\\Reservation.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellValue(NewData);
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);

	}

	// 65. Create Row
	public void createRow(String sheetName, int rowno, int cellno, String NewData) throws IOException {
		File file = new File("C:\\Users\\Dhinesh\\eclipse-workspace\\FrameWorkClass1\\File\\Reservation.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("adactin");
		Row row = sheet.createRow(5);
		Cell cell = row.createCell(6);
		cell.setCellValue("data");
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
	}

	// 66.quite
	public void baseQuite() {
		driver.quit();
	}

	// cloce
	public static void baseClose() {
		driver.close();

	}

}
