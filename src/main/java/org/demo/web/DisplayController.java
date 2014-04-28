package org.demo.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {

	@RequestMapping("/results")
	public String displayResults(Model model, HttpSession session) {

		//	Bad code: Session use...
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("desc", session.getAttribute("desc"));
		
		String port = System.getenv("PORT");
		model.addAttribute("port", port);
		
		return "display";
	}
}
