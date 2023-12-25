package practice_project_ecommerce.practice_project_ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class e_commerce {
	static WebDriver driver;
	public static void main(String []args) {
		String path = "drivers/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--headless");
		driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		test1();
		test2();
		test3();
		test4();
	}
	@Test
	public static void test1() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("TV");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	@Test
	public static void test2() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	@Test
	public static void test3() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("watch");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	@Test
	public static void test4() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("laptop");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
}
