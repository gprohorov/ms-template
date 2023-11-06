package edu.pro.examination;
/*
  @author   george
  @project   ms-template
  @class  ExaminationService
  @version  1.0.0 
  @since 06.11.23 - 12.40
*/

import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExaminationService {
    private final ExaminationRepository repository;
    private List<Examination> list;

  //  @PostConstruct
    void init() throws CsvValidationException, IOException {
    list = MyUtil.extractDataFromCsv("/home/george/Desktop/exams.csv");
    repository.saveAll(list);
    }

    public List<Examination> getAll() {
        return repository.findAll();
    }
}
