package ru.kalin.dmmitrii.pages

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.provider.WebDriverProvider

class MainPageTest {

    private lateinit var drivers: List<WebDriver>

    private lateinit var mainPage: MainPage

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testOpenSearch(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.yandexPlusClick()
        }
    }

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }
}