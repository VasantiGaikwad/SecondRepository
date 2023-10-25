package com.cjc.crud.webapp.CrudApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.webapp.CrudApp.model.Student;
import com.cjc.crud.webapp.CrudApp.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService hs;
	
@RequestMapping("/")
public String prelogin()	
{
	return "login";
}


@RequestMapping("/login")
public String logincheck(@RequestParam("username")String un, @RequestParam("password")String ps, Model m )	
{
	hs.logincheck(un,ps);
	Iterable list= hs.displayAllDetails();
	
	m.addAttribute("data", list);
	
	return "Success";
}

@RequestMapping("/log")
public String preregister()	
{
	return "Register";
}

@RequestMapping("/register")
public String registerData(@ModelAttribute Student s )	
{
	hs.saveData(s);
	return "login";
}

}
