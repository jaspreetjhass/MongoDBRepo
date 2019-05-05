package org.jp.MongoSpringIntegrationApproach2;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

public class Find {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);
		
		//call find all method of template
		List<Person> personList = template.findAll(Person.class);
		
		//print each person document fetched from mongo db database
		personList.forEach(System.out::println);
		
		//close the context
		context.close();

	}
}
