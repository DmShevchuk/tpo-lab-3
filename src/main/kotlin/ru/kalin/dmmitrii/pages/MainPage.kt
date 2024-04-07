package ru.kalin.dmmitrii.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.util.URL
import java.lang.IllegalArgumentException

class MainPage(private val driver: WebDriver) {
    private val url = URL
    private val path = "//*[@data-apiary-widget-id='/content/header/header"
    init {
        if (!driver.currentUrl.equals(url))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val logo = "//noindex[@class='_3iUBy']"
    private val yandexPlus = "$path/plusBalance']"
    private val ordersButton = "$path/ordersButton']"
    private val wishlistButton = "$path/wishlistButton']"
    private val cartEntryPoint = "$path/cartEntryPoint']"

    fun logoClick() = driver.findElement(By.xpath(logo)).click()
    fun yandexPlusClick() = driver.findElement(By.xpath(yandexPlus)).click()
    fun ordersButtonClick() = driver.findElement(By.xpath(ordersButton)).click()
    fun wishlistButtonClick() = driver.findElement(By.xpath(wishlistButton)).click()
    fun cartEntryPointClick() = driver.findElement(By.xpath(cartEntryPoint)).click()

}