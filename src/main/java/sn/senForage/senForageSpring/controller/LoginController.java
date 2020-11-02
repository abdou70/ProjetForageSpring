package sn.senForage.senForageSpring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LoginController {
	@RequestMapping(value="/")
	public String liste() {
		
		
		return "user/login";
	}
}
