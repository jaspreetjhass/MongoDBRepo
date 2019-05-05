package org.jp.MongoSpringIntegrationApproach1;

import org.bson.Document;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

public class DeleteOne {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);
		// get collection name from database
		MongoCollection<Document> collection = template.getCollection("person");
		// call deleteOne method to store only one document in the collection
		collection.deleteOne(Filters.eq("name", "jaspreet"));
		context.close();

	}
}
