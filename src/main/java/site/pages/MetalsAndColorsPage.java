package site.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import site.sections.Summary;

@JPage(url = "/page2.htm", title = "Metal and Colors")
public class MetalsAndColorsPage extends WebPage {
    public static Summary summary;
}
