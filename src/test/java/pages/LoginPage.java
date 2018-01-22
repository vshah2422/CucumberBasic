package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy(how = How.ID, using = "fakeusername")
    public WebElement txtusername;

    @FindBy(how = How.ID, using = "fakepassword")
    public WebElement txtpassword;

    @FindBy(how = How.XPATH, using = "//div[@id='login-btn-ctn']//a[@class='btn-go']")
    public WebElement logindBtn;

    public void Login (String username, String password)
    {
        txtusername.sendKeys(username);
        txtpassword.sendKeys(password);
    }

    public void CLickLogin()
    {
        logindBtn.click();
    }

}




