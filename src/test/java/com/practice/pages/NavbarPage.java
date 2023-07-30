package com.practice.pages;

import com.core.utility.MasterPage;
import com.practice.locators.NavbarLocators;

import static com.practice.locators.NavbarLocators.BASE_URL;

public class NavbarPage extends MasterPage {

    public void clickOnHomeLink() {
        auto_setClickElement(NavbarLocators.HOME_LINK_XPATH);
    }


    public void verifyHomeTitle() {
        auto_checkPageTitleContains("AcademyBugs.com");
    }

    public void navigateToSubPage() {
        auto_openURLInBrowser(BASE_URL);
    }
}
