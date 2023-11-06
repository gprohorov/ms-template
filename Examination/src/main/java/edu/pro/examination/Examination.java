package edu.pro.examination;
/*
  @author   george
  @project   ms-template
  @class  Examination
  @version  1.0.0 
  @since 06.11.23 - 12.33
*/

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Document
public class Examination {
    private Integer id;
    private String name;
    private String group;
    private String discipline;
    private Integer evaluation;
}
