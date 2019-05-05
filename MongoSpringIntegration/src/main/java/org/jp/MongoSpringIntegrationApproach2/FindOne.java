package org.jp.MongoSpringIntegrationApproach2;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class FindOne {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);
		//call find method of template to find the JSON document based on the query criteria passed
		List<Person> personList = template
				.find(Query.query(Criteria.where("name").in(new Object[]{"jaspreet","harpreet"})), Person.class);
		System.out.println(personList);
		//close the context
		context.close();

	}
}
