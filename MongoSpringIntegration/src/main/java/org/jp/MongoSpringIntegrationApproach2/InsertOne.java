package org.jp.MongoSpringIntegrationApproach2;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

public class InsertOne {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);

		List<String> skillSet = new ArrayList<String>();
		skillSet.add("sap");
		skillSet.add("java");
		
		//create instance of person
		Person person =  new Person(ObjectId.get(), "harpreet", skillSet);
		
		//save person as JSON in mongo db database
		template.save(person,"person");
		
		//close the context
		context.close();

	}
}

class Person {
	
	private ObjectId _id;
	private String name;
	private List<String> skillSet;
	
	public Person() {

	}

	public Person(ObjectId _id, String name, List<String> skillSet) {
		super();
		this._id = _id;
		this.name = name;
		this.skillSet = skillSet;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}

	@Override
	public String toString() {
		return "Person [_id=" + _id + ", name=" + name + ", skillSet=" + skillSet + "]";
	}
	
}
