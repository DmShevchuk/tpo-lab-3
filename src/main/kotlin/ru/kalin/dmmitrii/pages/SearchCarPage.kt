package ru.kalin.dmmitrii.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.util.autoDromUrl
import ru.kalin.dmmitrii.util.dataFtid

class SearchCarPage(
    driver: WebDriver
) : AbstractPage(driver) {
    private val url = autoDromUrl

    init {
        if (!driver.currentUrl.equals(url))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val advancedButton = "//*[@$dataFtid='sales__filter_advanced-button']"
    private val markInput = "//*[@placeholder='Марка']"
    private val submitButton = "//*[@$dataFtid='sales__filter_submit-button']"
    private val form = "//*[@$dataFtid='sales__filter']"

    fun advancedButtonClick() = driver.findElement(By.xpath(advancedButton)).click()
    fun openMarkInput() = driver.findElement(By.xpath(markInput)).click()

    fun getSubmitButton() = driver.findElement(By.xpath(submitButton))
    fun getFilterForm() = driver.findElement(By.xpath(form))
}