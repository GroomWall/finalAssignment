package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CounterPage {
    protected WebDriver driver;
    @FindBy(xpath = "//button[contains(text(),'Decre')]")
    private WebElement decrementeButton;
    @FindBy(xpath = "//button[contains(text(),'Incre')]")
    private WebElement incrementeButton;
    @FindBy(xpath = "//div[@id='counter']/label")
    private WebElement counterValue;

    public CounterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void decrementeClick() {
        decrementeButton.click();
    }

    public void incrementeClick() {
        incrementeButton.click();
    }

    public String getCounterValue() {
        return counterValue.getText();
    }
}
