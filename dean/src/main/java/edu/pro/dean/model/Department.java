package edu.pro.dean.model;
/*
  @author   george
  @project   ms-template
  @class  Department
  @version  1.0.0 
  @since 06.11.23 - 12.13
*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    private int id;
    private String name;
    private String abbreviation;
    private String chief;
    private String phone;
}
