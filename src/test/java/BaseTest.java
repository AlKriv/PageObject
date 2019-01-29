import Model.User;
import org.junit.Before;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    User user = new User();
//
    @BeforeTest
    public void Before(){

        user.setLogin("dert6705@gmail.com");
        user.setPassword("qwerty1QWERTY");
        baseUrl = "https://phptravels.org";


    }
}
