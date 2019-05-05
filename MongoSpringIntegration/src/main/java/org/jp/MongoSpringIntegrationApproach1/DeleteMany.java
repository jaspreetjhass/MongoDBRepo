package org.jp.MongoSpringIntegrationApproach1;

import org.bson.Document;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

public class DeleteMany {

	public static void main(String[] args) {

		//create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);
		//get collection from template
		MongoCollection<Document> collection = template.getCollection("person");
		// call deleteMany method to delete only one document from the collection
		collection.deleteMany(Filters.eq("name", "harryDosanjh"));
		context.close();
	}
}
