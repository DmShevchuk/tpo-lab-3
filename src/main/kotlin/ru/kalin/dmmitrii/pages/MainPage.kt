package ru.kalin.dmmitrii.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.util.URL

class MainPage(
    driver: WebDriver
) : AbstractPage(driver) {
    private val url = URL
    private val dataFtid = "data-ftid"

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


    fun changeRegionClick() = driver.findElement(By.xpath(changeRegionButton)).click()
    fun regionNumberClick(region: String) = driver.findElement(getRegionXpath(region)).click()
    fun brandClick(brand: String) = driver.findElement(getBrandXpath(brand)).click()
    fun expandBrandsClick() = driver.findElement(By.xpath(expandButton)).click()

    private fun getRegionXpath(region: String): By {
        return By.xpath(regionNumber.replace("<region_number>", region))
    }

    private fun getBrandXpath(brand: String): By {
        return By.xpath(brandLink.replace("<brand>", brand.lowercase()))
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

}