package org.wecancodeit.userreviewsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/writeareview")
	public String writeareview() {
		return "writeareview";
	}
	
	@RequestMapping("/review") 
		public String review() {
			return "review";
		
	}

}
