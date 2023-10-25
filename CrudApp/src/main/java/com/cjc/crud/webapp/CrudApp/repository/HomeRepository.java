package com.cjc.crud.webapp.CrudApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.webapp.CrudApp.model.Student;
@Repository
public interface HomeRepository extends PagingAndSortingRepository<Student, Integer>{


	public void findAllByUsernameAndPassword(String username, String password);

}
