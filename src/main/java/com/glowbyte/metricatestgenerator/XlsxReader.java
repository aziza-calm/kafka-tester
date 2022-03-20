package com.glowbyte.metricatestgenerator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XlsxReader {

    FileInputStream file;
    Workbook workbook;

    public XlsxReader(String fileLocation) throws IOException {
        this.file = new FileInputStream(fileLocation);
        this.workbook = new XSSFWorkbook(file);
    }

    public List<Map<String, String>> read() {
        Sheet sheet = workbook.getSheetAt(0);
        int startRow = sheet.getFirstRowNum();
        int lastRow = sheet.getLastRowNum();
        List<Map<String, String>> data = new ArrayList<>();
        for (int i = startRow + 1; i <= lastRow; i++) {
            Map<String, String> map = new HashMap<>();
            for (int j = 2; j < sheet.getRow(i).getLastCellNum(); j++) {
                map.put(sheet.getRow(startRow).getCell(j).toString().toLowerCase(),
                        sheet.getRow(i).getCell(j).toString());
            }
            data.add(map);
        }
        return data;
    }
}
