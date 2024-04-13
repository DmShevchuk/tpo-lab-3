package ru.kalin.dmmitrii.pages;

import lombok.Getter
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.kalin.dmmitrii.util.URL

class VinPage(
    driver: WebDriver,
) : AbstractPage(driver) {

    init {
        if (!driver.currentUrl.equals(URL))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val inputFieldPath = "//*[@data-ftid='search-input']"
    private val inputButtonPath = "//*[@data-ftid='search-input-btn']"
    private val infoFiled = "//span[@data-ftid='autostory-placeholder-title']"
    @Getter
    private val errorMessageField = "//div[@data-ftid='error-message']"
    private val redirectFromMainPagePath =
        "//a[contains(@href, 'https://vin.drom.ru/?utm_source=web_main_page&utm_medium=banner&utm_campaign=report_by_vin')]"

    fun redirectFromMainPage() = driver.findElement(By.xpath(redirectFromMainPagePath)).click()

    fun enterValue(value: String) {
        val input = driver.findElement(By.xpath(inputFieldPath))
        input.sendKeys(value)
    }

    fun submitForm() {
        val button = driver.findElement(By.xpath(inputButtonPath))
        button.click()
    }

    fun findInfoSpanText(): String {
        return driver.findElement(By.xpath(infoFiled)).text
    }

    fun findErrorMessageField() = driver.findElement(By.xpath(errorMessageField))

}
