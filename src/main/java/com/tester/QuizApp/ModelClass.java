package com.tester.QuizApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


// this is the model class of MVC  dont confuse the service class at all cuze its the operation class like adding 2 nuber
// or something like ml sothing very unrelated MVC but a tool for operation
// this is the class that deals with the connectivity of the backend 
//ORM

@Data// this is what gennertes the setter and getter 
@Entity
@Table(name ="questiontb")
public class ModelClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String category;
	private String difficultylevel;
	private String option1;
	private String option2;
	private String option3;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDifficultylevel() {
		return difficultylevel;
	}
	public void setDifficultylevel(String difficultylevel) {
		this.difficultylevel = difficultylevel;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}

	// Lombok dosent seems to be working so manually added getters and setters
}
