package ru.kalin.dmmitrii.pages

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import ru.kalin.dmmitrii.provider.WebDriverProvider
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MainPageTest {

    private lateinit var drivers: List<WebDriver>

    private lateinit var mainPage: MainPage

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testClickHeader(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.logoClick()

            assertEquals("https://market.yandex.ru/", driver.currentUrl)
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testClickOrders(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.ordersButtonClick()

            assertEquals("https://market.yandex.ru/my/orders?track=menu", driver.currentUrl)
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testClickWishlist(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.wishlistButtonClick()

            assertEquals("https://market.yandex.ru/my/wishlist?track=head", driver.currentUrl)
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testClickCart(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.cartEntryPointClick()

            assertEquals("https://market.yandex.ru/my/cart", driver.currentUrl)
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testClickYandexPlus(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            val currentPage = driver.windowHandle
            assertEquals(driver.windowHandles.size, 1)

            mainPage = MainPage(driver)
            mainPage.yandexPlusClick()

            while (driver.windowHandles.size != 2) {}

            for (windowHandle in driver.windowHandles) {
                if (!currentPage!!.contentEquals(windowHandle)) {
                    driver.switchTo().window(windowHandle)
                    break
                }
            }

            mainPage.waitUntilPageIsLoaded(driver)

            assertEquals("https://plus.yandex.ru/?utm_source=market&utm_medium=banner&utm_campaign=MSCAMP-77&utm_term=src_market&utm_content=onboarding&message=market",
                driver.currentUrl)

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testSearch(drivers: List<WebDriver>) {
        this.drivers = drivers
        val searchInput = "iPhone 15"
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.testSearch(searchInput)

            mainPage.waitUntilPageIsLoaded(driver)

            val foundElements = mainPage.getAllElements()

            for (element in foundElements) {
                println(convertToLink(searchInput))
                println(element.contains(convertToLink(searchInput)))
                assertTrue {
                    element.contains(convertToLink(searchInput))
                }
            }

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun catalogSearch(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.openCatalog()
            Thread.sleep(5000)
            mainPage.ikeaCategoryClick()
            mainPage.waitUntilPageIsLoaded(driver)
            assertEquals("ИКЕА", driver.findElement(By.xpath("//*[@class='_3h69c _1DC7b']/span")).text)

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun catalogSearchByMovingMouse(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            val actions = Actions(driver)
            mainPage = MainPage(driver)
            mainPage.openCatalog()
            Thread.sleep(5000)

            val computerCatalogItem: WebElement = mainPage.getComputerCatalog()

            actions.moveToElement(computerCatalogItem)
            actions.perform()

            assertEquals("_12HrO _3-xdb cia-cs", computerCatalogItem.getAttribute("class"))
            mainPage.selectedCategoryItemClick()
            mainPage.waitUntilPageIsLoaded(driver)

            assertEquals("Ноутбуки и компьютеры", driver.findElement(By.xpath("//*[@class='_39qdP']")).text)

        }
    }

//    @ParameterizedTest
//    @ArgumentsSource(WebDriverProvider::class)
//    fun testOpenItemFromFeed(drivers: List<WebDriver>) {
//        this.drivers = drivers
//        drivers.forEach { driver ->
//            assertEquals(driver.windowHandles.size, 1)
//
//            mainPage = MainPage(driver)
//
//            val element: WebElement = driver.findElement(By.xpath("//*[@class='cia-cs Gqfzd'][1]/a"))
//            element.click()
//            while (driver.windowHandles.size != 2) {}
//
//            assertEquals(2, driver.windowHandles.size)
//        }
//    }

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }

    private fun convertToLink(search: String): String {
        return search
            .replace(" ", "-")
            .lowercase()
    }
}