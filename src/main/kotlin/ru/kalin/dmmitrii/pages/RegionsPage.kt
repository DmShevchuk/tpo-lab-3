package ru.kalin.dmmitrii.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.util.URL

class RegionsPage(
    driver: WebDriver,
) : AbstractPage(driver) {
    private val url = "${URL}my_region/"

    init {
        if (!driver.currentUrl.equals(url))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val regionLink = "//a[contains(@href, 'set_region')]"

    fun getAllRegionsNumbers(): List<String> {

        val elements = driver.findElements(By.xpath(regionLink))
        val list = mutableListOf<String>()
        elements.forEach { link ->
            val href = link.getAttribute("href")
            val index = "set_region="
            val regionNumber = href.substring(href.indexOf(index) + index.length )
            list.add(regionNumber)
        }

        return list
    }
}