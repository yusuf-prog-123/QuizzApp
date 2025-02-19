package com.tester.QuizApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {

	public QuestionController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("allQuestion")
	public String allQuestion() {
		
		return "Question testing";
		
	}

}
