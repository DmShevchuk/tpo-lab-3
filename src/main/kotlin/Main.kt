package ru.kalin.dmmitrii

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

fun main() {
    val driver: WebDriver = ChromeDriver()
    driver.get("https://google.com")
}