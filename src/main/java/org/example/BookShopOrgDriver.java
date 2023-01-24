package org.example;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

//!!!!Important - Bookshop.org only let me run this twice before it stopped me with both protection. Oh well, good practice!
public class BookShopOrgDriver {

    private FirefoxDriver driver = new FirefoxDriver();
    private List<String> prices = new ArrayList<>();

    public BookShopOrgDriver() {
        driver.get("https://bookshop.org/");
    }

    public String findPrice(String searchString) {
        WebElement searchBar = driver.findElement(By.xpath("//input[@name='keywords']"));
        searchBar.sendKeys(searchString);

        WebElement searchSubmit = driver.findElement(By.xpath("//button[@class='button is-secondary search-button']"));
        searchSubmit.submit();

        return null;

    }

    public void addPrice(String price) {
        prices.add(price);
    }

    public List<String> getPrices() {
        return prices;
    }
}
