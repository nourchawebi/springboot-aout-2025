package com.demo.demo.DAO;

import com.demo.demo.model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends ReactiveMongoRepository<Student,String> {

}
