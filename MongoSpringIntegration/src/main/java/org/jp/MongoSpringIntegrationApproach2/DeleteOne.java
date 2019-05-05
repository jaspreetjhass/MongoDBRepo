package org.jp.MongoSpringIntegrationApproach2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class DeleteOne {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);

		// call remove method of template to remove the JSON document from mongo
		// Database
		template.remove(Query.query(Criteria.where("name").is("jaspreet")), Person.class);
		// close the context
		context.close();
	}
}
