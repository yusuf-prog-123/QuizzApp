package com.tester.QuizApp.Service;

import com.tester.QuizApp.Dao.Daoooo;
import com.tester.QuizApp.ModelClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class questionserrvice {
	
	@Autowired
	Daoooo dao1;
	
	

	public ResponseEntity<List<ModelClass>> getAllQuestions() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(dao1.findAll(),HttpStatus.OK);
	}

	public ResponseEntity<List<ModelClass>> getquestbycatagory(String catagory) {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<ModelClass>>( dao1.findBydifficultylevel(catagory),HttpStatus.BAD_GATEWAY);
		/*check out buy requesting a get "http://localhost:8080/question/catagory/Easy" eventhough you got the response n
		 * postman it will show "502 Bad Gateway" this because we aded "HttpStatus.BAD_GATEWAY" if the function 
		 * succesfully executed*/
	}

	public ResponseEntity<String> addingQuest(ModelClass questi) {
		// TODO Auto-generated method stub
		dao1.save(questi);
		return new ResponseEntity<String>("Success",HttpStatus.CREATED);
	}
	

}

