package org.jp.MongoJavaClient;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdateMany {

	public static void main(String[] args) {

		// create instance of MongoClient
		MongoClient client = new MongoClient();
		// get database instance from client
		MongoDatabase database = client.getDatabase("local");
		// get collection name from database
		MongoCollection<Document> collection = database.getCollection("person");
		// call updateMany method to store only one document in the collection
		collection.updateMany(Filters.eq("name", "harpreet"), Updates.set("name", "harryDosanjh"));
		client.close();

	}
	
}
