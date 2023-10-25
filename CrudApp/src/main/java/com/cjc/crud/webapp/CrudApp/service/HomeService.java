package com.cjc.crud.webapp.CrudApp.service;

import com.cjc.crud.webapp.CrudApp.model.Student;

public interface HomeService {
public void saveData(Student s);
public Iterable displayAllDetails();
public void logincheck(String username, String password);
}
