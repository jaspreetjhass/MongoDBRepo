package org.jp.MongoSpringIntegrationApproach2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class UpdateOne {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);

		// call update first method of template to update the JSON document
		template.updateFirst(Query.query(Criteria.where("name").is("jaspreet")), Update.update("salary", 56000),
				Person.class);

		// close the context
		context.close();

	}
}
