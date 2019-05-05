package org.jp.MongoSpringIntegrationApproach2;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

public class InsertMany {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);

		//add skillset 
		List<String> skillSet = new ArrayList<String>();
		skillSet.add("unix");
		skillSet.add("property Dealer");

		// create instances of person class
		Person person1 = new Person(ObjectId.get(), "mankirat", null);
		Person person2 = new Person(ObjectId.get(), "amanbhandari", skillSet);

		//create collection of person class
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);

		//call insertAll method of template
		template.insertAll(personList);

		//close the context
		context.close();

	}
}
