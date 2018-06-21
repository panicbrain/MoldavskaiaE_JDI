package site;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import entities.users.User;
import enums.SummaryNumbers;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import site.pages.IndexPage;
import site.pages.MetalsAndColorsPage;
import site.sections.Header;
import site.sections.LoginForm;
import site.sections.Summary;

@JSite(domain = "https://jdi-framework.github.io/tests/")
public class JDIFrameworkSite {
    public static IndexPage indexPage;
    public static LoginForm loginForm;
    public static Header header;
    public static MetalsAndColorsPage metalsAndColorsPage;
    public static Summary summery;


    private Selector<SummaryNumbers> summeryNumbers() {
        return metalsAndColorsPage.summary.summeryNumbersR;
    }

    @FindBy(css = ".profile-photo")
    public static Label profilePhoto;

    @Step
    public static void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }

    public static void metalColorPageOpen() {
        header.metalsColors.click();

    }

    public void selectSummeryNumber(int number) {
        summeryNumbers().select(number);

    }


}
