package ru.kalin.dmmitrii.pages

import lombok.Getter
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import ru.kalin.dmmitrii.util.autoDromUrl
import ru.kalin.dmmitrii.util.dataFtid

class SearchCarPage(
    driver: WebDriver
) : AbstractPage(driver) {
    private val url = autoDromUrl

    init {
        if (!driver.currentUrl.equals(url))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val advancedButton = "//*[@$dataFtid='sales__filter_advanced-button']"
    private val placeholderInput = "//*[@placeholder='<placeholder>']"
    private val submitButton = "//*[@$dataFtid='sales__filter_submit-button']"
    private val buttonWithOption = "(//*[@$dataFtid='component_select_button'])[<index>]"
    private val form = "//*[@$dataFtid='sales__filter']"
    private val generationDropdown = "//div[@data-ga-stats-name='generation_card'][<index>]"
    private val maxPriceInput = "//*[@$dataFtid='sales__filter_price-to']"

    private val filterDropDown = "(//div[@$dataFtid='component_select_dropdown'])[<index1>]/div/div[<index2>]/div"
    private val filterDropDownNumberTwo = "(//div[@$dataFtid='component_select_dropdown'])[<index1>]/div[<index2>]"
    private val unsoldCheckbox = "//*[@for='sales__filter_unsold']"
    private val withPhotoCheckbox = "//*[@for='photo']"
    private val blackColor = "//*[@id='clr-grp-2']"
    private val carBody = "//div[@$dataFtid='sales__filter_frame']/div[2]/div[3]/div[<index>]"
    private val owner = "//*[@$dataFtid='sales__filter_seller']/div[<index>]"
    private val ads = "//*[@$dataFtid='bulls-list_bull']"

    private val filterForFeed = "//*[@$dataFtid='component_select_button']"

    private val bullLabelOwner = "//*[@$dataFtid='bull_label_owner']"

    private val bullLabelNoDocs = "//*[@$dataFtid='bull_label_nodocs']"
    private val prices = "//*[@$dataFtid='bull_price']"
    private val years = "//*[@$dataFtid='bull_title']"
    private val volumes = "(//*[@$dataFtid='bull_description-item'])[1]"

    fun getBullLabelOwner() : String {
        return bullLabelOwner
    }

    fun getBullLabelNoDocs() : String {
        return bullLabelNoDocs
    }

    fun advancedButtonClick() = driver.findElement(By.xpath(advancedButton)).click()
    fun buttonClick(index: Int) = driver.findElement(getButtonXpath(index)).click()
    fun unsoldCheckboxClick() = driver.findElement(By.xpath(unsoldCheckbox)).click()
    fun withPhotoCheckboxClick() = driver.findElement(By.xpath(withPhotoCheckbox)).click()
    fun withBlackColorClick() = driver.findElement(By.xpath(blackColor)).click()
    fun byOwner(index: Int) = driver.findElement(getOwnerXpath(index)).click()

    fun openInputByPlaceholder(placeholder: String) {
        val newPlaceholder = placeholderInput.replace("<placeholder>", placeholder)
        driver.findElement(By.xpath(newPlaceholder)).click()
    }

    fun getPrices() = driver.findElements(By.xpath(prices))

    fun getYears() : List<WebElement> {
        return driver.findElements(By.xpath(years))
    }

    fun getVolumes() : List<WebElement> {
        return driver.findElements(By.xpath(volumes))
    }

    fun getAllAdsFromPage() : List<WebElement> {
        return driver.findElements(By.xpath(ads))
    }

    fun getFilterFeed() : WebElement {
        return driver.findElements(By.xpath(filterForFeed)).last()
    }

    private fun getOwnerXpath(index: Int) : By {
        return By.xpath(owner.replace("<index>", index.toString()))
    }


    private fun getButtonXpath(index: Int) : By {
        return By.xpath(buttonWithOption.replace("<index>", index.toString()))
    }

    fun submitButtonClick() {
        driver.findElement(By.xpath(submitButton)).click()
    }

    fun getSubmitButton() = driver.findElement(By.xpath(submitButton))
    fun getFilterForm() = driver.findElement(By.xpath(form))
    fun getPlaceholderInput(placeholder: String) : WebElement {
        val newPlaceholder = placeholderInput.replace("<placeholder>", placeholder)
        return driver.findElement(By.xpath(newPlaceholder))
    }

    fun generationDropdownClick(index: Int) {
        val newXPath = generationDropdown.replace("<index>", index.toString())
        driver.findElement(By.xpath(newXPath)).click()
    }

    fun findDropDownByDataValue(index1: Int, index2: Int) {
        val newXPath = filterDropDown
            .replace("<index1>", index1.toString())
            .replace("<index2>", index2.toString())
        driver.findElement(By.xpath(newXPath)).click()
    }

    fun chooseElementByDropDownByDataValue(index1: Int, index2: Int) {
        val newXPath = filterDropDownNumberTwo
            .replace("<index1>", index1.toString())
            .replace("<index2>", index2.toString())
        driver.findElement(By.xpath(newXPath)).click()
    }

    fun getMaxPriceInput() : WebElement {
        return driver.findElement(By.xpath(maxPriceInput))
    }

    fun chooseCarBody(index: Int) {
        val newXPath = carBody
            .replace("<index>", index.toString())
        driver.findElement(By.xpath(newXPath)).click()
    }

}