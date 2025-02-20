package com.tester.QuizApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tester.QuizApp.ModelClass;
@Repository
public interface Daoooo extends JpaRepository<ModelClass, Integer> {
/*by using Daooo as an extention of JPArepository class we can use JPArepository classes methood like findall() on
	a Daooo instance used in questionserverce.java*/
}
