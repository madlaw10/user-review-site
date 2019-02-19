package org.wecancodeit.userreviewsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/review")
	public String review() {
		return "review";
		// Q: Add method here to pull Reviews collection?
	}

	@RequestMapping("/writeareview")
	public String writeareview() {
		return "writeareview";
	}
	
	@RequestMapping("/verifyreview")
	public String verifyreview() {
		return "verifyreview";
	}

}
