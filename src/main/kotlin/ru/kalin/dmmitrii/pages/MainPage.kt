package ru.kalin.dmmitrii.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.util.URL

class MainPage(
    private val driver: WebDriver
) : AbstractPage() {
    private val url = URL

    init {
        if (!driver.currentUrl.equals(url))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val changeRegionButton = "//*[@data-ftid='component_header_region']/a"
    private var regionNumber = "//a[contains(@href, '<region_number>')]"
    private val regionLink = "//a[contains(@href, 'set_region')]"


    fun changeRegionClick() = driver.findElement(By.xpath(changeRegionButton)).click()
    fun regionNumberClick(region: String) = driver.findElement(getRegionXpath(region)).click()

    private fun getRegionXpath(region: String): By {
        return By.xpath(regionNumber.replace("<region_number>", region))
    }

}