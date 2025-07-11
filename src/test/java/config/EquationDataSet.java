package config;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;
import screen.CalcScreen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EquationDataSet {
    @DataProvider(name = "CSV-Dataset")
    public Object[][] setData() throws IOException {
        String filePath = "./src/test/resources/data.csv";
        List<Object[]> data = new ArrayList<>();

        CSVParser parser = new CSVParser(new FileReader(filePath), CSVFormat.DEFAULT.withFirstRecordAsHeader());
        for (CSVRecord record : parser) {
            String expression = record.get("expression").trim();
            String expected = record.get("expected").trim();
            data.add(new Object[]{expression, expected});
        }
        parser.close();
        return data.toArray(new Object[0][]);
    }
}




