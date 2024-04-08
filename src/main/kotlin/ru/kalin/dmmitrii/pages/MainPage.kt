package ru.kalin.dmmitrii.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import ru.kalin.dmmitrii.util.URL
import java.lang.IllegalArgumentException

class MainPage(private val driver: WebDriver) : AbstractPage() {
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
    private val inputField = "//*[@id='header-search']"
    private val findButton = "//*[@class='_30-fz button-focus-ring MySdj _1VU42 _2rdh3 mini-suggest__button']"
    private val foundElement = "//*[@class='cia-cs Gqfzd']/a"
    private val catalogButton = "$path/catalogEntrypoint']"
    private val catalogItem = "//*[@class='_12HrO cia-cs']"
    private val chosenCatalogItem = "//*[@class='_12HrO _3-xdb cia-cs']"

    fun logoClick() = driver.findElement(By.xpath(logo)).click()
    fun yandexPlusClick() = driver.findElement(By.xpath(yandexPlus)).click()
    fun ordersButtonClick() = driver.findElement(By.xpath(ordersButton)).click()
    fun wishlistButtonClick() = driver.findElement(By.xpath(wishlistButton)).click()
    fun cartEntryPointClick() = driver.findElement(By.xpath(cartEntryPoint)).click()
    fun ikeaCategoryClick() = driver.findElement(By.xpath("$catalogItem[5]")).click()
    fun selectedCategoryItemClick() = driver.findElement(By.xpath(chosenCatalogItem)).click()

    fun testSearch(target: String) {
        val input = driver.findElement(By.xpath(inputField))
        input.sendKeys(target)
        driver.findElement(By.xpath(findButton)).click()
    }

    fun getAllElements(): List<String> {
        val elements = driver.findElements(By.xpath(foundElement))
        val list = ArrayList<String>()

        for (element in elements) {
            list.add(element.getAttribute("href"))
        }

        return list
    }

    fun openCatalog() {
        driver.findElement(By.xpath(catalogButton)).click()
    }

    fun getComputerCatalog(): WebElement {
        return driver.findElement(By.xpath("$catalogItem[18]"))
    }

}