package org.jp.MongoSpringIntegrationApproach2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

public class DeleteMany {

	public static void main(String[] args) {

		//create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);
		//call remove method to remove all JSON documents from mongo db
		template.remove(Person.class).all();
		//close the context
		context.close();
	}
}
