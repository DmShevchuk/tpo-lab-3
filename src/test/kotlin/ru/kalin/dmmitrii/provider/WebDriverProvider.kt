package ru.kalin.dmmitrii.provider

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import ru.kalin.dmmitrii.util.URL
import java.io.FileInputStream
import java.util.*
import java.util.stream.Stream

class WebDriverProvider : ArgumentsProvider {

    private val PROPERTIES_FILE = "src/test/resources/config.properties"
    var props: Properties = Properties()

    init {
        try {
            props.load(FileInputStream(PROPERTIES_FILE))
        } catch (e: NullPointerException) {
            println("Settings file '${PROPERTIES_FILE}' not found")
        }

//        System.setProperty("webdriver.chrome.driver", props.getProperty("webdriver.chrome.driver"))
        System.setProperty("webdriver.gecko.driver", props.getProperty("webdriver.firefox.driver"))
    }
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        val browsers = props.getProperty("browsers").split(" ").map { it.trim() }

        val argumentsList = mutableListOf<Arguments>()

        val webDrivers = mutableListOf<WebDriver>()

        if (browsers.contains("chrome")) {
            webDrivers.add(makeChromeDriver())
        }

        if (browsers.contains("firefox")) {
            webDrivers.add(makeFirefoxDriver())
        }

        argumentsList.add(Arguments.of(webDrivers))
        return argumentsList.stream()
    }

    private fun makeChromeDriver(): ChromeDriver {
        return prepareDriver(ChromeDriver())
    }

    private fun makeFirefoxDriver(): FirefoxDriver {
        return prepareDriver(FirefoxDriver())
    }

    private fun <T : WebDriver> prepareDriver(driver: T): T {
        driver.get(URL)
        return driver
    }
}