package steps;
import Pages.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.io.IOException;
import java.time.Duration;


public class loginstep extends Base {


    @Given("User Go To URL")
    public void user_go_to_url() throws IOException {
        lunchBrowser();

    }
    @And("Select Lang as English")
    public void select_lang_as_english() {
        webDriver.findElement(By.className("lang")).click();

    }
    @And("Go to “Shop By Brand” section and select “Iphone”")
    public void go_to_shop_by_brand_section_and_select_iphone() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
       webDriver.findElement(By.xpath("/html/body/app-root/div/app-home-page/div/app-brand/div/div/div[1]/ul/li[7]")).click();

    }
    @Then("Select any of returned iphone mobiles")
    public void select_any_of_returned_iphone_mobiles() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
     //  webDriver.manage().timeouts().implicitlyWait(1000 , TimeUnit.SECONDS)
        WebDriverWait webDriverWait= new WebDriverWait(webDriver , Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/ul/li[2]/a/div/div[2]/a/img")));
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/ul/li[2]/a/div/div[2]/a/img")).click();

    }
    @And("Press add to cart.")
    public void press_add_to_cart() {
        WebDriverWait webDriverWait= new WebDriverWait(webDriver , Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("addToBasket-btn")));
        webDriver.findElement(By.className("addToBasket-btn")).click();

    }
    @And("Press Proceed to Checkout")
    public void press_proceed_to_checkout() {
        WebDriverWait webDriverWat= new WebDriverWait(webDriver , Duration.ofSeconds(120));
        webDriverWat.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-shoping-cart/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/button")));
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-shoping-cart/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/button")).click();


    }
    @Then("Select “Delivery Options” as “Cairo” “Ain Shams”")
    public void select_delivery_options_as_cairo_ain_shams() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        // /html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[2]/div[1]/select
        WebDriverWait Wait= new WebDriverWait(webDriver , Duration.ofSeconds(30));
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[2]/div[1]/select")));
        Select drpCountry = new Select(webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[2]/div[1]/select")));
        drpCountry.selectByVisibleText("Cairo");
        WebDriverWait webDriverWaitt= new WebDriverWait(webDriver , Duration.ofSeconds(30));
        webDriverWaitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[2]/div[2]/select")));
        Select drpCountryy = new Select(webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[2]/div[2]/select")));
        drpCountryy.selectByVisibleText("Ain Shams");


    }
    @Then("Select “Deliver to My Address”")
    public void select_deliver_to_my_address() {

        WebDriverWait webDriverWt= new WebDriverWait(webDriver , Duration.ofSeconds(30));
        webDriverWt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[1]/div[1]")));
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[1]/div[1]")).click();

    }
    @And("Add address details")
    public void add_address_details() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[1]/div/input")).sendKeys("shoubra" , Keys.RETURN);
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]/div/input")).sendKeys("1" , Keys.RETURN);
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[3]/div/input")).sendKeys("1111" , Keys.RETURN);
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[4]/div/input")).sendKeys("121" , Keys.RETURN);


    }

    @And("Press continue.")
    public void press_continue() {
        webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[2]/div[2]/form/div/button")).click();

    }
    @Then("assertion error message")
    public void assertion_error_message() {
       String actual =  webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]/div/div/div")).getText();
       String expected = "Please enter a valid name";
       WebElement element= webDriver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page-cc/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]/div/div/div"));
        Assert.assertEquals(true , element.isDisplayed());
        System.out.println("Test Passed !");

    }


}
