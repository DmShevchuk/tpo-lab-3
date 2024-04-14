package ru.kalin.dmmitrii.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import ru.kalin.dmmitrii.util.URL
import ru.kalin.dmmitrii.util.dataFtid

class MainPage(
    driver: WebDriver
) : AbstractPage(driver) {
    private val url = URL

    init {
        if (!driver.currentUrl.equals(url))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val changeRegionButton = "//*[@$dataFtid='component_header_region']/a"
    private val regionNumber = "//a[contains(@href, '<region_number>')]"
    private val expandButton = "//*[@$dataFtid='component_cars-list_expand-control']"
    private val brands = "//*[@class='css-ofm6mg exkrjba0']/div"
    private val brandLink = "//a[contains(@href, '<brand>')][1]"
    private val ads = "//*[@$dataFtid='bulls-list_bull']/div[2]//*[@$dataFtid='bull_title']"
    private val category = "//*[@$dataFtid='home-auto-block_item'][<index>]"
    private val prices = "//*[@$dataFtid='bull_price']"
    private val headerOptions = "//*[@data-ftid='component_header_main-menu-item'][<index>]"


    fun changeRegionClick() = driver.findElement(By.xpath(changeRegionButton)).click()
    fun regionNumberClick(region: String) = driver.findElement(getRegionXpath(region)).click()
    fun brandClick(brand: String) = driver.findElement(getBrandXpath(brand)).click()
    fun expandBrandsClick() = driver.findElement(By.xpath(expandButton)).click()
    fun categoryClick() = driver.findElement(By.xpath(category)).click()
    fun headerOptionClick(index: Int) = driver.findElement(getHeaderOption(index)).click()

    private fun getRegionXpath(region: String): By {
        return By.xpath(regionNumber.replace("<region_number>", region))
    }

    private fun getBrandXpath(brand: String): By {
        return By.xpath(brandLink.replace("<brand>", brand.lowercase()))
    }

    private fun getHeaderOption(index: Int) : By {
        return By.xpath(headerOptions.replace("<index>", index.toString()))
    }

    fun getBrandsListSize() : Int {
        val list = driver.findElements(By.xpath(brands))
        return list.size
    }

    fun getAds(): List<String> {
        val ads = driver.findElements(By.xpath(ads))
        val list = mutableListOf<String>()
        for (ad in ads) {
            list.add(ad.text)
        }
        return list
    }

    fun getCategory(index: Int): WebElement {
        val xpath = category.replace("<index>", index.toString())
        return driver.findElement(By.xpath(xpath))
    }

    fun getPricesForCategory(): List<Int> {
        val elements = driver.findElements(By.xpath(prices))
        val prices = mutableListOf<Int>()
        for (element in elements) {
            prices.add(element.text.trim().replace(" ", "").toInt())
        }
        return prices
    }

    fun getMaxPriceFromFilter() : Int? {
        val maxPrice = getQueryParam("maxprice")
        return maxPrice?.toIntOrNull()
    }

    fun getMinPriceFromFilter() : Int? {
        val minPrice = getQueryParam("minprice")
        return minPrice?.toIntOrNull()
    }

    private fun getQueryParam(key: String) : String? {
        val url = driver.currentUrl
        val queryParameters = url.substring(url.indexOf('?')).split("&").associate {
            val pair = it.split("=")
            pair.first() to pair.last()
        }

        return queryParameters[key]
    }

    fun goToDefaultUrl() = driver.get(url)

}