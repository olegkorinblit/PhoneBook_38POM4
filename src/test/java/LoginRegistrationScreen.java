import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegistrationScreen {
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/action_bar']/android.widget.TextView")
    MobileElement activityViewText;
    @FindBy(xpath="//*[@resource-id='com.sheygam.contactapp:id/inputEmail']")
    MobileElement EditEmailInput;
    @FindBy(xpath="//*[@resource-id='com.sheygam.contactapp:id/inputPassword']")
    MobileElement EditPasswordInput;

    @FindBy(xpath="//*[@resource-id='com.sheygam.contactapp:id/regBtn']")
    MobileElement RegBtn;

    @FindBy(xpath="//*[@resource-id='com.sheygam.contactapp:id/loginBtn']")
    MobileElement LoginBtn;

}
