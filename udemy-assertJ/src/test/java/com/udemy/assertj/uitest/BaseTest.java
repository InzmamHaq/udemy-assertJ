package com.udemy.assertj.uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.udemy.assertj.assertions.PageAssert;
import com.udemy.assertj.assertions.WebElementAssert;
import com.udemy.assertj.pages.BasePage;

public class BaseTest {

	protected WebDriver driver;

	@BeforeTest
	public void setUp() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();

	}

	protected WebElementAssert assertThat(WebElement element) {

		return WebElementAssert.assertThat(element);
	}

	protected PageAssert assertThat(BasePage basePage) {

		return PageAssert.assertThat(basePage);
	}

	@AfterTest
	public void quite() {
		this.driver.quit();
	}
}
