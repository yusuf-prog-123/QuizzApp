package com.tester.QuizApp.Service;

import com.tester.QuizApp.Dao.Daoooo;
import com.tester.QuizApp.ModelClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class questionserrvice {
	
	@Autowired
	Daoooo dao1;
	
	

	public List<ModelClass> getAllQuestions() {
		// TODO Auto-generated method stub
		return dao1.findAll();
	}

	public List<ModelClass> getquestbycatagory(String catagory) {
		// TODO Auto-generated method stub
		return dao1.findBydifficultylevel(catagory);
	}
	

}

