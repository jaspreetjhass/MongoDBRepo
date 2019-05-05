package org.jp.MongoJavaClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertMany {

	public static void main(String[] args) {

		// create instance of MongoClient
		MongoClient client = new MongoClient();
		// get database instance from client
		MongoDatabase database = client.getDatabase("local");
		// get collection name from database
		MongoCollection<Document> collection = database.getCollection("person");
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

		client.close();

	}
}
