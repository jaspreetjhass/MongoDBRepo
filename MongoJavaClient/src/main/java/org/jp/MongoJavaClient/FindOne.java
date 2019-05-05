package org.jp.MongoJavaClient;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class FindOne {

	public static void main(String[] args) {

		// create instance of MongoClient
		MongoClient client = new MongoClient();
		// get database instance from client
		MongoDatabase database = client.getDatabase("local");
		// get collection name from database
		MongoCollection<Document> collection = database.getCollection("person");
		// call find method to fetch only one document from the collection
		Document document = collection.find(Filters.eq("name", "jaspreet")).first();
		System.out.println(document);
		client.close();

	}
}
