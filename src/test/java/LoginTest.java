import Page.ClientAreaPage;
import Page.LoginPage;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    @Test (priority=1)
    public void wrongLoginTest ()
    {
        LoginPage lp=new LoginPage();
        lp.login("sdsd@df.ru",user.getPassword());
        lp.getLabelErr().shouldHave(Condition.matchText("Login Details Incorrect. Please try again."));
    }
    @Test(priority=2)
    public void wrongPasswordTest()
    {
        LoginPage lp=new LoginPage();
        lp.login(user.getLogin(),"sdsdsdfas");
        lp.getLabelErr().shouldHave(Condition.matchText("Login Details Incorrect. Please try again."));
    }
    @Test(priority=3)
    public void zeroValueLoginPasswordTest()
    {
        LoginPage lp=new LoginPage();
      //  1
        lp.login("","");
        lp.getLabelErr().shouldHave(Condition.matchText("Login Details Incorrect. Please try again."));
    }
    @Test (priority=4)

    public void loginTestL()
    {
        LoginPage loginPage =new LoginPage();
        loginPage.login(user.getLogin(),user.getPassword());

        ClientAreaPage cl=new ClientAreaPage();
        cl.getWelcome().shouldHave(Condition.matchText("Welcome Back, ivan"));
    }
}
