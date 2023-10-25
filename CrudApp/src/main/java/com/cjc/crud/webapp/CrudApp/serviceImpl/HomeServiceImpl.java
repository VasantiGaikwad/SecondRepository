package com.cjc.crud.webapp.CrudApp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cjc.crud.webapp.CrudApp.model.Student;
import com.cjc.crud.webapp.CrudApp.repository.HomeRepository;
import com.cjc.crud.webapp.CrudApp.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
@Autowired
HomeRepository hr;


@Override
public void saveData(Student s)
{
	hr.save(s);
}


@Override
public Iterable displayAllDetails() {
	return hr.findAll(Sort.by(Direction.DESC,"name"));
}


@Override
public void logincheck(String username, String password) {
	hr.findAllByUsernameAndPassword(username,  password);
}

}
