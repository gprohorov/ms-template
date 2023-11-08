package edu.pro.examination;
/*
  @author   george
  @project   ms-template
  @class  ExaminationRepository
  @version  1.0.0 
  @since 06.11.23 - 12.38
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface ExaminationRepository extends MongoRepository<Examination, Integer> {
    List<Examination> findExaminationsByEvaluationGreaterThanEqual(int evaluation);
}
