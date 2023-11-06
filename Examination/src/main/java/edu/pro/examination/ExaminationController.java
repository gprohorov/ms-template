package edu.pro.examination;
/*
  @author   george
  @project   ms-template
  @class  ExaminationController
  @version  1.0.0 
  @since 06.11.23 - 15.06
*/

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/exams")
@RequiredArgsConstructor
public class ExaminationController {
    private final ExaminationService service;

    @RequestMapping("")
    public List<Examination> extractAll() {
        return service.getAll();
    }
}
