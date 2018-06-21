package site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

public class Header extends Section {
    @FindBy(id = "Home")
    public Button home;

    @FindBy(id = "Contact form")
    public Button contactForm;

    @FindBy(css = ".open")
    public Dropdown service;

    @FindBy(css = ".nav [href=\"page2.htm\"]")
    public Button metalsColors;
}
