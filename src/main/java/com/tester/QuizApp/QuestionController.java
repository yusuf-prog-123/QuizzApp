package com.tester.QuizApp;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tester.QuizApp.Service.questionserrvice;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
    questionserrvice questionService;

	@GetMapping("/allQuestion")
	public List<ModelClass> getallQuestion() {
		
		return questionService.getAllQuestions();//A method in service class or model class this where operations happenss for different request by the client
		
	}

}
