package ru.kalin.dmmitrii.pages;

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import ru.kalin.dmmitrii.util.URL

class ReviewPage(
    driver: WebDriver,
) : AbstractPage(driver) {

    init {
        if (!driver.currentUrl.equals(URL))
            throw IllegalArgumentException(driver.currentUrl)
    }

    private val redirectFromMainPagePath =
        "//a[contains(@href, 'https://www.drom.ru/reviews/')]"

    private var carMarkFilterButton = "//button[@class='f-input__input' and contains(text(),'<mark>')]";

    private var h1FilterPageInfo = "//h1[contains(text(),'Отзывы владельцев <mark> с ФОТО')]";

    private var redirectToFilterPagePath =
        "//a[contains(@href, '<link>')]"

    fun redirectFromMainPage() = driver.findElement(By.xpath(redirectFromMainPagePath)).click()

    private var filterButtonPath =
        "//button[contains(text(),'<text>')]";

    private var mainCarModelFilterButtonPath =
        "//button[contains(text(),'Любая модель')]";

    private var mainCarMarkFilterDropDown = "//div[@data-value='<data_value>']";

    private val formPath = "//form[@data-drom-new-form='']"

    private val rangeToFilterPath = "(//button[contains(text(),'<text>')])"

    private var mainCarFilterDropDownWithMultipleFields = "(//div[@data-value='<data_value>'])";

    private val extendedFilterButtonPath = "(//button[@id='searchLink'])"

    private var forInomarkaPath = "//span[@for='inomarka']";

    private var forPhotoPath = "//label[@for='foto']";

    private var forLeftWheelPath = "//span[@for='w']";

    private var keyWordsInput = "//input[@name='keywords']";

    private val submitButton = "(//button[contains(text(),'Показать')])"

    private val cardPath =
        "//div[@class='review-item-block b-info-block b-info-block_like-text b-info-block_width_215']"

    private val reviewLink =
        "//div[@class='review-item-block b-info-block b-info-block_like-text b-info-block_width_215']<index>//a[2]"
    private val reviewTitle =
        "//div[@class='review-item-block b-info-block b-info-block_like-text b-info-block_width_215']<index>//span[1]"

    private val resultListPath = "//div[@class='b-flex b-flex_w_2-col-reviews bm-reviews-2col']"

    private val characteristicsTable = "//table"

    private val reviewPageTitle = "//span[@class='fn']"

    private val sortByRating = "//span[contains(., 'По рейтингу')]"

    fun getResultList() = driver.findElement(By.xpath(resultListPath));

    fun getFilterForm() = driver.findElement(By.xpath(formPath))

    fun clickExtendedSearchButton() = driver.findElement(By.xpath(extendedFilterButtonPath)).click()

    fun clickforInomarkaButton() = driver.findElement(By.xpath(forInomarkaPath)).click()

    fun clickSortByRating() = driver.findElement(By.xpath(sortByRating)).click()


    fun clickforPhotoButton() = driver.findElement(By.xpath(forPhotoPath)).click()

    fun clickforLeftWheelButton() = driver.findElement(By.xpath(forLeftWheelPath)).click()

    fun showResults() = driver.findElement(By.xpath(submitButton)).click()

    fun getCharacteristicsTableContent() : WebElement {
        return driver.findElement(By.xpath(characteristicsTable));
    }

    fun getReviewCardTitleByCardIndex(index: String): String {
        val title = reviewTitle.replace("<index>", index)
        return driver.findElement(By.xpath(title)).text;
    }

    fun getReviewPageTitle(): String {
        return driver.findElement(By.xpath(reviewPageTitle)).text;
    }

    fun clickReviewLinkByCardIndex(index: String) : String {
        val cardLink = reviewLink.replace("<index>", index)
        return driver.findElement(By.xpath(cardLink)).getAttribute("href");
    }


    fun setKeyWords(keywords: String) {
        driver.findElement(By.xpath(keyWordsInput)).sendKeys(keywords)
    }

    fun findAndClickFilterButton(placeholderText: String) {
        val filterButton = filterButtonPath.replace("<text>", placeholderText)
        driver.findElement(By.xpath(filterButton)).click()
    }


    fun findAndClickRangeFilterButton(value: String, index: String) {
        val rangeFilterButton = rangeToFilterPath.replace("<text>", value) + index
        driver.findElement(By.xpath(rangeFilterButton)).click()
    }

    fun findDropDownByDataValue(dataValue: String) {
        val dropDownValue = mainCarMarkFilterDropDown.replace("<data_value>", dataValue)
        driver.findElement(By.xpath(dropDownValue)).click()
    }

    fun findDropDownByDataValue(dataValue: String, index: String) {
        val dropDownValue = mainCarFilterDropDownWithMultipleFields.replace("<data_value>", dataValue) + index
        driver.findElement(By.xpath(dropDownValue)).click()
    }

    fun findButtonWithMarkFilter(mark: String) {
        carMarkFilterButton = carMarkFilterButton.replace("<mark>", mark);
        driver.findElement(By.xpath(carMarkFilterButton))
    }

    fun findH1FilterPageInfo(mark: String) {
        h1FilterPageInfo = h1FilterPageInfo.replace("<mark>", mark)
        driver.findElement(By.xpath(h1FilterPageInfo))
    }

    fun redirectToFilterPage(linkText: String) {
        redirectToFilterPagePath = redirectToFilterPagePath.replace("<link>", linkText)
        driver.findElement(By.xpath(redirectToFilterPagePath)).click()
    }

}
