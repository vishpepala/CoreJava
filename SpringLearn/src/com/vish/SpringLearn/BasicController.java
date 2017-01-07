package com.vish.SpringLearn;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class BasicController {

	@Autowired
	Employee employee;

	//@GetMapping(path = "indexPage")
	@GetMapping(path = "indexPage")
	public @ResponseBody List<String> getIndexPage(ModelMap modelMap) {

		modelMap.addAttribute("myMessage", "Hello World.  Model message");

		Set<String> set = modelMap.keySet();

		return Arrays.asList("tes","tets");
	}
}
