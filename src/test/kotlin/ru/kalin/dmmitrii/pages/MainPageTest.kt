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

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }

}