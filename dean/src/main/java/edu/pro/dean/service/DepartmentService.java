package edu.pro.dean.service;
/*
  @author   george
  @project   ms-template
  @class  DepartmentService
  @version  1.0.0 
  @since 06.11.23 - 12.19
*/

import edu.pro.dean.client.ExaminationClient;
import edu.pro.dean.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final ExaminationClient client;

    private List<Department> list = new ArrayList<>(
            Arrays.asList(
                    new Department(1, "Computer Systems", "CSM","Vorobets", "123"),
                    new Department(2, "Math. problem", "MPUIK","Drin", "456"),
                    new Department(3, "Software Engineering", "PZKS","Ostapov", "789"),
                    new Department(4, "Computer Science", "CS","Vorobets", "101")
            )
    );
    private Map<String, String> map = new HashMap<>();

    {
        map.put("CSM", "241");
        map.put("MPUIK", "242");
        map.put("PZKS", "243");
        map.put("CS", "244");
    }

    public List<Department> getAll() {
        return list;
    }

    public Map<String, List<String>> getAllGood(String dep) {
        Map<String, List<String>> result = new HashMap<>();
        List<String> students = new ArrayList<>();
        String group = map.get(dep);
        if (group != null) {
            students = client.extractGoodStudentsFromExams(group);
        }
        result.put(dep, students);
        return result;
    }
}
