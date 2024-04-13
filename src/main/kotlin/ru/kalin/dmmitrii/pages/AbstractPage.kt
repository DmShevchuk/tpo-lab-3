package ru.kalin.dmmitrii.pages

import lombok.Getter
import lombok.Setter
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

@Getter
@Setter
abstract class AbstractPage(
    val driver: WebDriver,
) {
    fun waitUntilPageIsLoaded(mills: Long) {
        WebDriverWait(driver, Duration.ofMillis(mills)).until {
            (driver as JavascriptExecutor).executeScript("return document.readyState") == "complete"
        }
    }
}