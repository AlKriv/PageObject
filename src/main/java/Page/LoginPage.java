package Page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {


    public LoginPage openPage()
    {
        //
        open("/clientarea.php");
        return this;
    }
    public  LoginPage typeLogin(String login){
        $(By.name("username")).sendKeys(login);
        return this;
    }
    public  LoginPage typePassword(String password){
        $(By.name("password")).sendKeys(password);
        return this;
    }
    public void clickLoginButton()
    {
        $(By.id("login")).click();
    }
    public void login(String login, String password)
    {
        this.openPage()
                .typeLogin(login)
                .typePassword(password)
                .clickLoginButton();
    }
    public SelenideElement getLabelErr()
    {
        return $(By.cssSelector("div.alert.alert-danger.text-center"));
    }

}
