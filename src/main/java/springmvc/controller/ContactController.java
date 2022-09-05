package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;
@Controller
public class ContactController {

	@Autowired
	private UserService service;
    @RequestMapping("/contact")
	public String showForm()
	{
		
	return "contact";	
	}
    
    @RequestMapping(path="/processform",method = RequestMethod.POST )
    
   	public String processform( @ModelAttribute User user, Model model)
   	{
    	
    	System.out.println(user);
    this.service.createUser(user);    	
      	return "success";	
   	}
    
}
