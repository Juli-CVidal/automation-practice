package com.practice.locators;

import com.core.utility.PropertyFileReader;

public class FindBugsLocator {
    public static final String MAIN_URL = PropertyFileReader.getProperty("url") + "/find-bugs/";

    public static final String SORTING_FIELD_ID = "#sortfield";

    public static final String PRODUCTS_PER_PAGE_OPTIONS_CONTAINER_CLASS = ".ec_product_page_perpage";

    public static final String PRODUCTS_LIST_ID = "#ec_store_product_list";
}
