package edu.pro.dean.controller;
/*
  @author   george
  @project   ms-template
  @class  DepartmentController
  @version  1.0.0 
  @since 06.11.23 - 12.27
*/

import edu.pro.dean.model.Department;
import edu.pro.dean.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService service;

    @RequestMapping("")
    public List<Department> getAll() {
        return service.getAll();
    }

    @RequestMapping("/good-students/{dep}")
    public Map<String, List<String>>
            extractGoodStudentsOfDepartment(@PathVariable String dep)  {
        return service.getAllGood(dep);
    }
}
