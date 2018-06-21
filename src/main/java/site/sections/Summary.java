package site.sections;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.complex.Selector;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import enums.SummaryNumbers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Summary extends Section{
    @FindBy(css = "#odds-selector p")
    public Selector<SummaryNumbers> odds;
    @FindBy(css = "#odds-selector p")
    public Selector<SummaryNumbers> oddsWithSelected = new Selector<SummaryNumbers>() {
        @Override
        protected boolean isSelectedAction(WebElement el) {
            return el.findElement(By.tagName("input")).getAttribute("checked") != null;
        }
    };
    @FindBy(css = "#odds-selector p")
    public RadioButtons<SummaryNumbers> summeryNumbersR;
    @FindBy(css = "#odds-selector p")
    public RadioButtons<SummaryNumbers> oddsRWithSelected = new RadioButtons<SummaryNumbers>() {
        @Override
        protected boolean isSelectedAction(WebElement el) {
            return el.findElement(By.tagName("input")).getAttribute("checked") != null;
        }
    };

    @FindBy(id = "calculate-button")
    public IButton calculate;
}
