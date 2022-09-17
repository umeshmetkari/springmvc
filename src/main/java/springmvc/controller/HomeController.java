package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "mayur");
		System.out.println("this is home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is home url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView andView = new ModelAndView();
		 andView.addObject("Name", "Mayur Rathod");
		 andView.setViewName("help");
 return andView;		
	}
	
	@RequestMapping("/search")
  public String search()
	{
		
		
	 return "search";	
	}
	
	@RequestMapping("/mysearch")
	  public RedirectView mysearch(@RequestParam("querybox") String querybox)
		{
		
		   String url="https://www.google.com/search?q="+querybox;
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(url);
		 return redirectView;	
		}
		
	
}
