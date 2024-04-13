package ru.kalin.dmmitrii.pages

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.provider.WebDriverProvider

class RegionPageTest {

    private lateinit var drivers: List<WebDriver>

    private lateinit var regionsPage: RegionsPage
    private lateinit var mainPage: MainPage

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testAllRegions(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach{ driver ->
            mainPage = MainPage(driver)
            mainPage.changeRegionClick()
            regionsPage = RegionsPage(driver)
            val regionsNumbers = regionsPage.getAllRegionsNumbers()
            Assertions.assertEquals(84, regionsNumbers.size)
        }
    }

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }

}