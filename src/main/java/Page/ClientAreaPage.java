package Page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ClientAreaPage {
//
    public SelenideElement getWelcome()
    {
        return $(By.xpath("//*[@class='header-lined']"));
    }
}
