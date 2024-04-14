package ru.kalin.dmmitrii.pages

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import ru.kalin.dmmitrii.provider.WebDriverProvider


class SearchCarPageTest {

    private lateinit var drivers: List<WebDriver>

    private lateinit var searchCarPage: SearchCarPage
    private lateinit var mainPage: MainPage

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun advancedSearchTest(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.headerOptionClick(1)
            searchCarPage = SearchCarPage(driver)
            searchCarPage.waitUntilPageIsLoaded(3000)
            searchCarPage.advancedButtonClick()

            searchCarPage.scrollToElement(searchCarPage.getFilterForm())
            Thread.sleep(3000)

        }
    }

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }
}