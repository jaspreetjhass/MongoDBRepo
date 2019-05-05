package org.jp.MongoSpringIntegrationApproach1;

import org.bson.Document;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

public class Find {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);
		// get template name from database
		MongoCollection<Document> collection = template.getCollection("person");
		// call find method to fetch only one document from the collection
		collection.find(Filters.eq("name", "harpreet")).spliterator().forEachRemaining(document -> {
			System.out.println(document);
		});
		context.close();

	}
}
