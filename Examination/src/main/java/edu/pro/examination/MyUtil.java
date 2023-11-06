package edu.pro.examination;
/*
  @author   george
  @project   ms-template
  @class  MyUtil
  @version  1.0.0 
  @since 06.11.23 - 14.47
*/

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyUtil {
    public static List<Examination> extractDataFromCsv(String file)
            throws IOException, CsvValidationException {
        List<List<String>> records = new ArrayList<List<String>>();
        List<Examination> exams = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        }
        records.stream()
                .forEach(list -> {
                    Examination exam = Examination.builder()
                            .id(Integer.valueOf(list.get(0)))
                            .name(list.get(1))
                            .group(list.get(2))
                            .discipline(list.get(3))
                            .evaluation(Integer.valueOf(list.get(4)))
                    .build();
                    exams.add(exam);
                });


        return exams;
    }


}
