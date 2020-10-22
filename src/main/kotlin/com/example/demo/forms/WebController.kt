package com.example.demo.forms;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

	@GetMapping("/")
	fun getForm(model: Model): String{
		model.addAttribute("personForm", PersonForm())
		return "form"
	}

	@PostMapping("/")
	fun doPost(personForm: PersonForm, model:Model, errors: Errors): String {
		if (errors.hasErrors())
			return "form"
		return "success"
	}
}
