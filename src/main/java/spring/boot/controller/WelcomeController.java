package spring.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Narendra");
		return "welcome";
	}
}