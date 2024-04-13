package ru.kalin.dmmitrii.pages

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource
import org.openqa.selenium.WebDriver
import ru.kalin.dmmitrii.provider.WebDriverProvider

class VinPageTest {

    private lateinit var drivers: List<WebDriver>

    private lateinit var vinPage: VinPage


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate1(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("o777oo777")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру О777ОО777", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate2(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("a777aa666")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру А777АА666", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate3(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("A111AA53")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру А111АА53", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate4(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("C761CB12")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру С761СВ12", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate5(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("K123OO66")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру К123ОО66", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate6(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("K440HK96")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру К440НК96", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate7(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("C717KK53")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру С717КК53", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate8(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("C717KK89")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру С717КК89", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate9(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("C717CC53")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру С717СС53", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByPlate10(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("B717KK53")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по госномеру В717КК53", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin1(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("S09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN S09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin2(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("P09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN P09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin3(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("L09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN L09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin4(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("M09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN M09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin5(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("J09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN J09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin6(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("B09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN B09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin7(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("M09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN M09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin8(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("V09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN V09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin9(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("D09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN D09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByVin10(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("A09XXXXXXXXYYYXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по VIN A09XXXXXXXXYYYXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody1(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("A09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова A09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody2(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("B09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова B09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody3(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("C09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова C09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody4(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("D09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова D09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody5(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("E09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова E09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody6(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("F09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова F09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody7(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("G09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова G09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody8(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("H09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова H09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody9(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("K09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова K09XXXX", text)
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testFindInfoByCarBody10(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("M09XXXX")
            vinPage.submitForm()
            val text = vinPage.findInfoSpanText()
            Assertions.assertEquals("Ищем данные об автомобиле по номеру кузова M09XXXX", text)
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput1(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("ЖОПА")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput2(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("АРТЁМ")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }


    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput3(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("ДИМА")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput4(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("ВАНЯ")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput5(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("ЕГОР")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput6(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("ПАРВОЛД")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput7(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("МИАРОВЛ")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput8(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("489ЦУШЩМАТОИР")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput9(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("93ГШУРАМИОТ")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @ParameterizedTest
    @ArgumentsSource(WebDriverProvider::class)
    fun testIncorrectInput10(drivers: List<WebDriver>) {
        this.drivers = drivers
        this.drivers.forEach { driver ->
            vinPage = VinPage(driver)
            vinPage.redirectFromMainPage()
            val windowHandles = driver.windowHandles

            for (windowHandle in windowHandles) {
                driver.switchTo().window(windowHandle)
                if (driver.title.contains("Проверка авто по Вин")) {
                    break
                }
            }

            vinPage.waitUntilPageIsLoaded(3000)
            vinPage.enterValue("")
            vinPage.submitForm()
            vinPage.findErrorMessageField()
            assertDoesNotThrow({ "Unable to locate element: //div[@data-ftid='error-message']" })
            { vinPage.findErrorMessageField() }
        }
    }

    @AfterEach
    fun quitDrivers() {
        drivers.forEach(WebDriver::quit)
    }

}