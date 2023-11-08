package edu.pro.dean.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
  @author   george
  @project   ms-template
  @class  ExaminationClient
  @version  1.0.0 
  @since 06.11.23 - 20.58
*/
@FeignClient(name = "exam-client", url = "${application.config.exam-url}")
public interface ExaminationClient {
    @RequestMapping("/good/{group}")
    List<String> extractGoodStudentsFromExams(@PathVariable String group);

}
