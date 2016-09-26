package helloController;

import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	

 @RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	  String message = "HELLO SPRING MVC HOW R U";  
	  model.addAttribute("msg",message);
      return "hello";
	
 }	

}
