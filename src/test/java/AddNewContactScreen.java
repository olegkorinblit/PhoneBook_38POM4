import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AddNewContactScreen {
    @FindBy(xpath="//android.widget.ImageView[@content-desc='More options']")
    MobileElement Burger;
    @FindBy(xpath="//*[@resource-id='com.sheygam.contactapp:id/add_contact_btn']")
    MobileElement addContactBtn;

}
