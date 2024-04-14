package ru.kalin.dmmitrii.pages

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.provider.WebDriverProvider


class SearchCarPageTest {

    private lateinit var drivers: List<WebDriver>

    private lateinit var searchCarPage: SearchCarPage
    private lateinit var mainPage: MainPage

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun `check filter for lowest price first`(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.headerOptionClick(1)
            searchCarPage = SearchCarPage(driver)
            searchCarPage.waitUntilPageIsLoaded(3000)

            searchCarPage.scrollToElement(searchCarPage.getFilterFeed())

            val filter = searchCarPage.getFilterFeed()
            filter.click()

            searchCarPage.chooseElementByDropDownByDataValue(10, 3)

            searchCarPage.waitUntilPageIsLoaded(3000)
            val prices = searchCarPage.getPrices().map { price ->
                 price.text.replace(" ", "").trim().toInt()
            }

            val isIncreasing = prices.zipWithNext { a, b -> a <= b }.all { it }
            Assertions.assertTrue(isIncreasing)

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun `check filter for highest price first`(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.headerOptionClick(1)
            searchCarPage = SearchCarPage(driver)
            searchCarPage.waitUntilPageIsLoaded(3000)

            searchCarPage.scrollToElement(searchCarPage.getFilterFeed())

            val filter = searchCarPage.getFilterFeed()
            filter.click()

            searchCarPage.chooseElementByDropDownByDataValue(10, 4)

            searchCarPage.waitUntilPageIsLoaded(3000)
            val prices = searchCarPage.getPrices().map { price ->
                price.text.replace(" ", "").trim().toInt()
            }

            val isIncreasing = prices.zipWithNext { a, b -> a >= b }.all { it }
            Assertions.assertTrue(isIncreasing)

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun `check filter for newest year`(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.headerOptionClick(1)
            searchCarPage = SearchCarPage(driver)
            searchCarPage.waitUntilPageIsLoaded(3000)

            searchCarPage.scrollToElement(searchCarPage.getFilterFeed())

            val filter = searchCarPage.getFilterFeed()
            filter.click()

            searchCarPage.chooseElementByDropDownByDataValue(10, 5)

            searchCarPage.waitUntilPageIsLoaded(3000)
            val prices = searchCarPage.getYears().mapNotNull { string ->
                val regex = Regex("""\d+$""")
                val matchResult = regex.find(string.text)
                matchResult?.value?.toIntOrNull()
            }

            val isIncreasing = prices.zipWithNext { a, b -> a >= b }.all { it }
            Assertions.assertTrue(isIncreasing)

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun `check filter for oldest year`(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.headerOptionClick(1)
            searchCarPage = SearchCarPage(driver)
            searchCarPage.waitUntilPageIsLoaded(3000)

            searchCarPage.scrollToElement(searchCarPage.getFilterFeed())

            val filter = searchCarPage.getFilterFeed()
            filter.click()

            searchCarPage.chooseElementByDropDownByDataValue(10, 6)

            searchCarPage.waitUntilPageIsLoaded(3000)
            val prices = searchCarPage.getYears().mapNotNull { string ->
                val regex = Regex("""\d+$""")
                val matchResult = regex.find(string.text)
                matchResult?.value?.toIntOrNull()
            }

            val isIncreasing = prices.zipWithNext { a, b -> a <= b }.all { it }
            Assertions.assertTrue(isIncreasing)

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun `check filter with big volume`(drivers: List<WebDriver>) {
        this.drivers = drivers
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.headerOptionClick(1)
            searchCarPage = SearchCarPage(driver)
            searchCarPage.waitUntilPageIsLoaded(3000)

            searchCarPage.scrollToElement(searchCarPage.getFilterFeed())

            val filter = searchCarPage.getFilterFeed()
            filter.click()

            searchCarPage.chooseElementByDropDownByDataValue(10, 9)

            searchCarPage.waitUntilPageIsLoaded(3000)
            val prices = searchCarPage.getVolumes().map { string ->
                string.text.substring(0, 4).trim().replace(" ", "").toDouble()
            }

            val isIncreasing = prices.zipWithNext { a, b -> a >= b }.all { it }
            Assertions.assertTrue(isIncreasing)

        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun `check advanced search for LADA GRANTA 2018 generation, price is greater than 1000 and less than 5_000_000 from 2007 and 2023, mechanic, petrol, from 0,7 to 6,0 litres, front wheel drive, unsaled, with photo, sedan, black color, with docs problems, from owner`(drivers: List<WebDriver>) {
        this.drivers = drivers
        val carBrand = "Лада"
        val model = "Гранта"
        val minYear = 2007
        val maxYear = 2023
        val minPrice = 1_000
        val maxPrice = 5_000_000
        val minV = 0.7
        val maxV = 6.0
        drivers.forEach { driver ->
            mainPage = MainPage(driver)
            mainPage.headerOptionClick(1)
            searchCarPage = SearchCarPage(driver)
            searchCarPage.waitUntilPageIsLoaded(3000)
            searchCarPage.advancedButtonClick()

            searchCarPage.scrollToElement(searchCarPage.getFilterForm())
            searchCarPage.openInputByPlaceholder("Марка")
            searchCarPage
                .getPlaceholderInput("Марка")
                .sendKeys(carBrand)

            Thread.sleep(1000)
            searchCarPage.findDropDownByDataValue(1, 3)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())


            searchCarPage.openInputByPlaceholder("Модель")
            searchCarPage
                .getPlaceholderInput("Модель")
                .sendKeys(model)

            searchCarPage.findDropDownByDataValue(2, 3)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())


            searchCarPage.buttonClick(1)
            searchCarPage.generationDropdownClick(1)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.openInputByPlaceholder("Цена от, ₽")
            searchCarPage
                .getPlaceholderInput("Цена от, ₽")
                .sendKeys(minPrice.toString())
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage
                .getMaxPriceInput()
                .sendKeys(maxPrice.toString())
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(2)
            searchCarPage.chooseElementByDropDownByDataValue(3, 20)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(3)
            searchCarPage.chooseElementByDropDownByDataValue(4, 4)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(4)
            searchCarPage.chooseElementByDropDownByDataValue(5, 7)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(5)
            searchCarPage.chooseElementByDropDownByDataValue(6, 3)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(6)
            searchCarPage.chooseElementByDropDownByDataValue(7, 3)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(7)
            searchCarPage.chooseElementByDropDownByDataValue(8, 36)
            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(8)
            searchCarPage.chooseElementByDropDownByDataValue(9, 4)

            searchCarPage.unsoldCheckboxClick()
            searchCarPage.withPhotoCheckboxClick()

            searchCarPage.buttonClick(9)

            // седан
            searchCarPage.chooseCarBody(1)
            searchCarPage.withBlackColorClick()

            searchCarPage.scrollToElement(searchCarPage.getFilterForm())

            searchCarPage.buttonClick(10)
            searchCarPage.chooseElementByDropDownByDataValue(10, 4)

            // собственник
            searchCarPage.byOwner(2)

            searchCarPage.submitButtonClick()

            searchCarPage.waitUntilPageIsLoaded(3000)

            val ads = searchCarPage.getAllAdsFromPage()

            ads.forEach { ad ->
                val ownerSize = ad.findElements(By.xpath(searchCarPage.getBullLabelOwner())).size
                Assertions.assertTrue(ownerSize > 0)
                val docsProblemsSize = ad.findElements(By.xpath(searchCarPage.getBullLabelNoDocs())).size
                Assertions.assertTrue(docsProblemsSize > 0)
                val title = ad.findElement(By.xpath("//*[@data-ftid='bull_title']")).text
                val array = title.trim().replace(" ", "").split(",")
                Assertions.assertTrue(array[0].lowercase().contains(carBrand.lowercase()))
                Assertions.assertTrue(array[0].lowercase().contains(model.lowercase()))
                Assertions.assertTrue(array[1].toInt() in minYear..maxYear)

                val price = ad.findElement(By.xpath("//*[@data-ftid='bull_price']")).text.trim().replace(" ", "").toInt()
                Assertions.assertTrue(price in minPrice..maxPrice)

                ad.sendKeys(Keys.COMMAND, Keys.RETURN)
                val windows = driver.windowHandles
                driver.switchTo().window(windows.last())
                searchCarPage.waitUntilPageIsLoaded(5000)

                val engineString = driver.findElement(By.xpath("//*[contains(text(), 'Двигатель')]/../td/span")).text
                Assertions.assertTrue(engineString.lowercase().contains("бензин"))
                val regex = Regex("""\d+\.\d+""")
                val matchResult = regex.find(engineString)
                Assertions.assertTrue(matchResult?.value?.toDoubleOrNull()!! in minV..maxV)

                val gearbox = driver.findElement(By.xpath("//*[contains(text(), 'Коробка передач')]/../td")).text.lowercase()
                Assertions.assertTrue(gearbox.contains("механика"))

                val privod = driver.findElement(By.xpath("//*[contains(text(), 'Привод')]/../td")).text.lowercase()
                Assertions.assertTrue(privod.contains("передний"))

                val kuzov = driver.findElement(By.xpath("//*[contains(text(), 'Тип кузова')]/../td")).text.lowercase()
                Assertions.assertTrue(kuzov.contains("седан"))

                val color = driver.findElement(By.xpath("//*[contains(text(), 'Цвет')]/../td")).text.lowercase()
                Assertions.assertTrue(color.contains("черный"))

                driver.close()
            }
        }
    }

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }
}