package ru.kalin.dmmitrii.pages;

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.provider.WebDriverProvider
import kotlin.test.assertEquals

class ReviewPageTest {
    private lateinit var drivers: List<WebDriver>

    private lateinit var reviewPage: ReviewPage

    private val UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG = "Unable to locate element:";

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testBwmButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/bmw/";
        val mark = "BMW";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testCheryButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/chery/";
        val mark = "Chery";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testNissanButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/nissan/";
        val mark = "Nissan";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFordButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/ford/";
        val mark = "Ford";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testAudiButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/audi/";
        val mark = "Audi";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testGeelyButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/geely/";
        val mark = "Geely";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testSkodaButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/skoda/";
        val mark = "Skoda";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testOmodaButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/omoda/";
        val mark = "OMODA";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testKiaButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/kia/";
        val mark = "Kia";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testVolkswagenButtonFilter(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/volkswagen/";
        val mark = "Volkswagen";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            reviewPage.redirectToFilterPage(filterLink)
            reviewPage.waitUntilPageIsLoaded(2000)
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //button[@class='f-input__input' and contains(text(),'$mark')]" })
            { reviewPage.findButtonWithMarkFilter(mark) }
            assertDoesNotThrow({ "$UNABLE_TO_LOCATE_ELEMENT_ERRROR_MSG //h1[contains(text(),'Отзывы владельцев $mark с ФОТО')]" })
            { reviewPage.findH1FilterPageInfo(mark) }
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectCarMarkRedirect(drivers: List<WebDriver>) {
        val filterLink = "https://www.drom.ru/reviews/qwertyuiop/";

        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)
            assertThrows<NoSuchElementException> {
                reviewPage.redirectToFilterPage(filterLink)
            }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testAllFilters(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Марка")
            reviewPage.findDropDownByDataValue("59")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Любая модель")
            reviewPage.findDropDownByDataValue("3169")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Поколение")
            reviewPage.findDropDownByDataValue("2_")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Год от")
            reviewPage.findDropDownByDataValue("1980")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("2023", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Объем от")
            reviewPage.findDropDownByDataValue("0.6")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("0.7", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("КПП")
            reviewPage.findDropDownByDataValue("1", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Топливо")
            reviewPage.findDropDownByDataValue("1", "[3]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.clickExtendedSearchButton()

            reviewPage.scrollToElement(reviewPage.getFilterForm())


            reviewPage.findAndClickFilterButton("Тип кузова")
            reviewPage.findDropDownByDataValue("1", "[4]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Привод")
            reviewPage.findDropDownByDataValue("1", "[5]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Регион эксплуатации")
            reviewPage.findDropDownByDataValue("517")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Город")
            reviewPage.findDropDownByDataValue("4822")

            reviewPage.clickforPhotoButton()
            reviewPage.setKeyWords("ЖОПА")
            reviewPage.showResults()
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testLadaWithFilters(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Марка")
            reviewPage.findDropDownByDataValue("99")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Любая модель")
            reviewPage.findDropDownByDataValue("4458")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Поколение")
            reviewPage.findDropDownByDataValue("1_0")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Год от")
            reviewPage.findDropDownByDataValue("2015")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("2023", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.showResults()

            reviewPage.scrollToElement(reviewPage.getResultList())

            reviewPage.scrollToElement(reviewPage.getResultList())
            driver.get(reviewPage.clickReviewLinkByCardIndex("[1]"))

            val table = reviewPage.getCharacteristicsTableContent();
            val rows = table.findElements(By.xpath("//tr"))
            for (row in rows) {
                val cells = row.findElements(By.xpath("//td"))
                val label = cells[0].text
                val value = cells[1].text
                if (label.equals("Год выпуска")) {
                    assertEquals(true, Integer.valueOf(value) in 2010..2017)
                }
                if (label.equals("Поколение")) {
                    assertEquals("1 поколение", "1 поколение")
                }
            }

            val reviewTitle = reviewPage.getReviewPageTitle();
            assertEquals(true, reviewTitle.contains("Лада"))
            assertEquals(true, reviewTitle.contains("Веста"))

        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testHyundaiWithFilters(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Марка")
            reviewPage.findDropDownByDataValue("56")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Любая модель")
            reviewPage.findDropDownByDataValue("4053")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Поколение")
            reviewPage.findDropDownByDataValue("1_1")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Год от")
            reviewPage.findDropDownByDataValue("2010")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("2017", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Объем от")
            reviewPage.findDropDownByDataValue("0.6")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("1.8", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("КПП")
            reviewPage.findDropDownByDataValue("2", "[2]")

            reviewPage.showResults()

            reviewPage.clickSortByRating()

            reviewPage.scrollToElement(reviewPage.getResultList())

            reviewPage.scrollToElement(reviewPage.getResultList())
            driver.get(reviewPage.clickReviewLinkByCardIndex("[1]"))

            val table = reviewPage.getCharacteristicsTableContent();
            val rows = table.findElements(By.xpath("//tr"))

            for (row in rows) {
                val cells = row.findElements(By.xpath("//td"))
                val label = cells[0].text
                val value = cells[1].text
                if (label.equals("Год выпуска")) {
                    assertEquals(true, Integer.valueOf(value) in 2010..2017)
                }
                if (label.equals("Поколение")) {
                    assertEquals("1 поколение рестайлинг", "1 поколение рестайлинг")
                }
                if (label.equals("Двигатель")) {
                    assertEquals(true, value.contains("1600 куб.см"))
                }
                if (label.equals("Трансмиссия")) {
                    assertEquals("автоматическая", "автоматическая")
                }
            }

            val reviewTitle = reviewPage.getReviewPageTitle();
            assertEquals(true, reviewTitle.contains("Хендай"))
            assertEquals(true, reviewTitle.contains("Солярис"))
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testBmwWithFilters(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Марка")
            reviewPage.findDropDownByDataValue("33")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Любая модель")
            reviewPage.findDropDownByDataValue("2842")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Поколение")
            reviewPage.findDropDownByDataValue("3_")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("2024", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Объем от")
            reviewPage.findDropDownByDataValue("1.0")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("6.0", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("КПП")
            reviewPage.findDropDownByDataValue("2", "[2]")

            reviewPage.findAndClickFilterButton("Топливо")
            reviewPage.findDropDownByDataValue("2", "[3]")

            reviewPage.showResults()

            reviewPage.scrollToElement(reviewPage.getResultList())

            reviewPage.scrollToElement(reviewPage.getResultList())
            driver.get(reviewPage.clickReviewLinkByCardIndex("[1]"))

            val table = reviewPage.getCharacteristicsTableContent();
            val rows = table.findElements(By.xpath("//tr"))

            for (row in rows) {
                val cells = row.findElements(By.xpath("//td"))
                val label = cells[0].text
                val value = cells[1].text
                if (label.equals("Год выпуска")) {
                    assertEquals(true, Integer.valueOf(value) <= 2024)
                }
                if (label.equals("Поколение")) {
                    assertEquals("3 поколение", "3 поколение")
                }
                if (label.equals("Двигатель")) {
                    assertEquals(true, value.contains("3000 куб.см"))
                    assertEquals(true, value.contains("дизель"))
                }
                if (label.equals("Трансмиссия")) {
                    assertEquals("автоматическая", "автоматическая")
                }
            }

            val reviewTitle = reviewPage.getReviewPageTitle();
            assertEquals(true, reviewTitle.contains("BMW"))
            assertEquals(true, reviewTitle.contains("X5"))
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testBmwWithCity(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Марка")
            reviewPage.findDropDownByDataValue("33")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Любая модель")
            reviewPage.findDropDownByDataValue("2842")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Поколение")
            reviewPage.findDropDownByDataValue("3_")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("2024", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Объем от")
            reviewPage.findDropDownByDataValue("1.0")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("6.0", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("КПП")
            reviewPage.findDropDownByDataValue("2", "[2]")

            reviewPage.findAndClickFilterButton("Топливо")
            reviewPage.findDropDownByDataValue("2", "[3]")

            reviewPage.clickExtendedSearchButton()

            reviewPage.findAndClickFilterButton("Тип кузова")
            reviewPage.findDropDownByDataValue("6", "[2]")

            reviewPage.findAndClickFilterButton("Регион эксплуатации")
            reviewPage.findDropDownByDataValue("52", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Город")
            reviewPage.findDropDownByDataValue("103", "[2]")

            reviewPage.showResults()

            reviewPage.clickSortByRating()

            reviewPage.scrollToElement(reviewPage.getResultList())

            reviewPage.scrollToElement(reviewPage.getResultList())
            driver.get(reviewPage.clickReviewLinkByCardIndex("[1]"))

            val table = reviewPage.getCharacteristicsTableContent();
            val rows = table.findElements(By.xpath("//tr"))

            for (row in rows) {
                val cells = row.findElements(By.xpath("//td"))
                val label = cells[0].text
                val value = cells[1].text
                if (label.equals("Год выпуска")) {
                    assertEquals(true, Integer.valueOf(value) <= 2024)
                }
                if (label.equals("Поколение")) {
                    assertEquals("3 поколение", "3 поколение")
                }
                if (label.equals("Двигатель")) {
                    assertEquals(true, value.contains("3000 куб.см"))
                    assertEquals(true, value.contains("дизель"))
                }
                if (label.equals("Трансмиссия")) {
                    assertEquals("автоматическая", "автоматическая")
                }
                if (label.equals("Тип кузова")) {
                    assertEquals("SUV", "SUB")
                }
            }

            val pageSource: String = driver.pageSource

            val phraseToFind: String = "Нижний Новгород"

            assertEquals(true, pageSource.contains(phraseToFind))

            val reviewTitle = reviewPage.getReviewPageTitle();
            assertEquals(true, reviewTitle.contains("BMW"))
            assertEquals(true, reviewTitle.contains("X5"))
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testVolkswagenWithCity(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers = drivers
        this.drivers.forEach { driver ->
            reviewPage = ReviewPage(driver)
            reviewPage.redirectFromMainPage()
            reviewPage.waitUntilPageIsLoaded(2000)

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Марка")
            reviewPage.findDropDownByDataValue("89")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Любая модель")
            reviewPage.findDropDownByDataValue("3859")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Поколение")
            reviewPage.findDropDownByDataValue("1_")

            reviewPage.findAndClickFilterButton("Год от")
            reviewPage.findDropDownByDataValue("2010")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("2011", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("Объем от")
            reviewPage.findDropDownByDataValue("0.6")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickRangeFilterButton("до", "[1]")
            reviewPage.findDropDownByDataValue("4.4", "[2]")

            reviewPage.scrollToElement(reviewPage.getFilterForm())

            reviewPage.findAndClickFilterButton("КПП")
            reviewPage.findDropDownByDataValue("1", "[2]")

            reviewPage.findAndClickFilterButton("Топливо")
            reviewPage.findDropDownByDataValue("1", "[3]")

            reviewPage.clickExtendedSearchButton()

            reviewPage.findAndClickFilterButton("Тип кузова")
            reviewPage.findDropDownByDataValue("1", "[4]")

            reviewPage.findAndClickFilterButton("Привод")
            reviewPage.findDropDownByDataValue("1", "[5]")

            reviewPage.clickforPhotoButton()

            reviewPage.showResults()

            reviewPage.scrollToElement(reviewPage.getResultList())

            reviewPage.scrollToElement(reviewPage.getResultList())
            driver.get(reviewPage.clickReviewLinkByCardIndex("[2]"))

            val table = reviewPage.getCharacteristicsTableContent();
            val rows = table.findElements(By.xpath("//tr"))

            for (row in rows) {
                val cells = row.findElements(By.xpath("//td"))
                val label = cells[0].text
                val value = cells[1].text
                if (label.equals("Год выпуска")) {
                    assertEquals(true, Integer.valueOf(value) in 2010..2011)
                }
                if (label.equals("Поколение")) {
                    assertEquals("1 поколение", "1 поколение")
                }
                if (label.equals("Двигатель")) {
                    assertEquals(true, value.contains("1800 куб.см"))
                    assertEquals(true, value.contains("бензин"))
                }
                if (label.equals("Трансмиссия")) {
                    assertEquals("механическая", "механическая")
                }
                if (label.equals("Тип кузова")) {
                    assertEquals("Седан", "Седан")
                }
            }

            val reviewTitle = reviewPage.getReviewPageTitle();
            assertEquals(true, reviewTitle.contains("Фольксваген"))
            assertEquals(true, reviewTitle.contains("Пассат СС"))
        }
    }
}
