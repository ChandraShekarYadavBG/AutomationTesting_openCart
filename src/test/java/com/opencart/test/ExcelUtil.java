package com.opencart.test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtil {

    public static Object[][] getData(String filePath, String sheetName)
            throws Exception {

        FileInputStream file = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(file);

        Sheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rows - 1][1];

        for (int i = 1; i < rows; i++) {
            data[i - 1][0] =
                    sheet.getRow(i).getCell(0).getStringCellValue();
        }

        workbook.close();
        file.close();

        return data;
    }
}