package ru.kalin.dmmitrii.pages

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

abstract class AbstractPage {
    fun waitUntilPageIsLoaded(driver: WebDriver) {
        WebDriverWait(driver, Duration.ofMillis(1000)).until {
            (driver as JavascriptExecutor).executeScript("return document.readyState") == "complete"
        }
    }
}