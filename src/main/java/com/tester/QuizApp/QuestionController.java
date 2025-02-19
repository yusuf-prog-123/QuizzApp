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
		
		return questionService.getAllQuestions();//A method in service class or model class this where operations happenss for different request by the client
		
	}

}
