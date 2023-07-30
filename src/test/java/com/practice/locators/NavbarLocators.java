package com.practice.locators;

import com.core.utility.PropertyFileReader;

public class NavbarLocators {

    public static final String BASE_URL = PropertyFileReader.getProperty("url");
    public static final String HOME_LINK_XPATH = "//*[@id=\"sq-site-branding\"]/h3/a";

    public static final String LINKS_CONTAINER_ID = "#menu-primary-menu";
}
