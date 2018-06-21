import org.testng.annotations.Test;

import static site.JDIFrameworkSite.*;

public class MetalAndColorsPageTest extends TestInit {

    @Test
    public void loginTest()  {
        indexPage.open();
        login();
        indexPage.checkOpened();
        metalColorPageOpen();
        metalsAndColorsPage.checkOpened();
    }

}
