package com.cafemanager.cafe.repository;


import com.cafemanager.cafe.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
 // List<Student> findByUser_UserId(Integer userId);

  List<Student> findByUser_UserId(int userId);
}
