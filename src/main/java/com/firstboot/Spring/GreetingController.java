package com.firstboot.Spring;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
<<<<<<< HEAD
		//this comment is made after initial commits
		//changes in mithilesh branch -edit
=======
		//this comment is made after initial commit
>>>>>>> parent of 5e9ef73... this is third commity
		return "greeting";
	}

}