package org.jp.MongoJavaClient;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeleteOne {

	public static void main(String[] args) {

		// create instance of MongoClient
		MongoClient client = new MongoClient();
		// get database instance from client
		MongoDatabase database = client.getDatabase("local");
		// get collection name from database
		MongoCollection<Document> collection = database.getCollection("person");
		// call deleteOne method to store only one document in the collection
		collection.deleteOne(Filters.eq("name", "jaspreet"));
		client.close();

	}
}
