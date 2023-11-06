package edu.pro.dean.service;
/*
  @author   george
  @project   ms-template
  @class  DepartmentService
  @version  1.0.0 
  @since 06.11.23 - 12.19
*/

import edu.pro.dean.model.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DepartmentService {
    private List<Department> list = new ArrayList<>(
            Arrays.asList(
                    new Department(1, "Computer Systems", "CSM","Vorobets", "123"),
                    new Department(2, "Math. problem", "MPUIK","Drin", "456"),
                    new Department(3, "Software Engineering", "PZKS","Ostapov", "789"),
                    new Department(4, "Computer Science", "CS","Vorobets", "101")
            )
    );

    public List<Department> getAll() {
        return list;
    }

}
