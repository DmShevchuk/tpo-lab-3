package ru.kalin.dmmitrii.pages

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.provider.WebDriverProvider

class MainPageTest {

    private lateinit var drivers: List<WebDriver>

    private lateinit var mainPage: MainPage

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testChangeRegion66(drivers: List<WebDriver>) {
        this.drivers = drivers
        val region = "66"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.changeRegionClick()
            mainPage.regionNumberClick(region)
            Assertions.assertTrue(driver.currentUrl.contains(region))
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testChangeRegion53(drivers: List<WebDriver>) {
        this.drivers = drivers
        val region = "53"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.changeRegionClick()
            mainPage.regionNumberClick(region)
            Assertions.assertTrue(driver.currentUrl.contains(region))
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testChangeRegion29(drivers: List<WebDriver>) {
        this.drivers = drivers
        val region = "29"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.changeRegionClick()
            mainPage.regionNumberClick(region)
            Assertions.assertTrue(driver.currentUrl.contains(region))
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testChangeRegion52(drivers: List<WebDriver>) {
        this.drivers = drivers
        val region = "52"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.changeRegionClick()
            mainPage.regionNumberClick(region)
            Assertions.assertTrue(driver.currentUrl.contains(region))
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun checkBrandsSize(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.expandBrandsClick()
            Assertions.assertEquals(173, mainPage.getBrandsListSize())
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun checkBMWAdvertisement(drivers: List<WebDriver>) {
        this.drivers = drivers
        val brand = "BMW"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.waitUntilPageIsLoaded(1000)
            mainPage.brandClick(brand)
            val ads = mainPage.getAds()

            ads.forEach { ad ->
                Assertions.assertTrue(ad.contains(brand))
            }

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun checkCheryAdvertisement(drivers: List<WebDriver>) {
        this.drivers = drivers
        val brand = "Chery"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.waitUntilPageIsLoaded(1000)
            mainPage.brandClick(brand)
            val ads = mainPage.getAds()

            ads.forEach { ad ->
                Assertions.assertTrue(ad.contains(brand))
            }

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun checkToyotaAdvertisement(drivers: List<WebDriver>) {
        this.drivers = drivers
        val brand = "Toyota"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.waitUntilPageIsLoaded(1000)
            mainPage.brandClick(brand)
            val ads = mainPage.getAds()

            ads.forEach { ad ->
                Assertions.assertTrue(ad.contains(brand))
            }

        }
    }

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }

}