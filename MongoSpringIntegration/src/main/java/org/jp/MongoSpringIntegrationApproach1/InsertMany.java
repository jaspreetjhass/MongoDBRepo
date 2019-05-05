package org.jp.MongoSpringIntegrationApproach1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoCollection;

public class InsertMany {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);
		// get collection name from database
		MongoCollection<Document> collection = template.getCollection("person");
		// perpare key value map to pass it to the document
		Map<String, Object> map = new HashMap<>();
		map.put("name", "harpreet");
		List<String> skills = new ArrayList<>();
		skills.add("cricket");
		skills.add("volleyball");

		map.put("skillset", skills);
		// create document instance and store the map
		Document document = new Document(map);

		// perpare list of documents
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);

		// call insertMany method to store only one document in the collection
		collection.insertMany(documents);

		context.close();

	}
}
