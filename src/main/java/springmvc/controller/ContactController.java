package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ContactController {

    @RequestMapping("/contact")
	public String showForm()
	{
		
	return "contact";	
	}
    
    @RequestMapping(path="/processform",method = RequestMethod.POST )
   	public String processform(
   			@RequestParam("email") String email,Model model,
   			@RequestParam("userName") String userName,
   			@RequestParam("userPassword") String userPassword)
   	{
    	System.out.println("User Email"+email);
    	System.out.println("UserName"+userName);
    	System.out.println("Password"+userPassword);
    	
    	model.addAttribute("userName", userName);
    	model.addAttribute("email", email);
    	model.addAttribute("userPassword", userPassword);
      	return "success";	
   	}
    
}
