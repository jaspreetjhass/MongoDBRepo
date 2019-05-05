package org.jp.MongoJavaClient;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertOne {

	public static void main(String[] args) {

		// create instance of MongoClient
		MongoClient client = new MongoClient();
		// get database instance from client
		MongoDatabase database = client.getDatabase("local");
		// get collection name from database
		MongoCollection<Document> collection = database.getCollection("person");
		// perpare key value map to pass it to the document
		Map<String, Object> map = new HashMap<>();
		map.put("name", "jaspreet");
		map.put("salary", 56000.0f);
		// create document instance and store the map
		Document document = new Document(map);
		// call insertOne method to store only one document in the collection
		collection.insertOne(document);

		client.close();

	}
}
