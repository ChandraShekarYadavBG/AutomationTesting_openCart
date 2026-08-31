package com.opencart.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchWithExcelDataTest {

    @DataProvider(name = "searchData")
    public Object[][] searchData() throws Exception {
        return ExcelUtil.getData(
                "src/test/resources/TestData.xlsx",
                "SearchData"
        );
    }

    @Test(dataProvider = "searchData")
    public void searchWithExcelDataTest(String product) {

        System.out.println("Excel Data: " + product);
    }
}