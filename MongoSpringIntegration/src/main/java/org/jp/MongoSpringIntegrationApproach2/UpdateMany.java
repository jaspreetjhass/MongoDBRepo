package org.jp.MongoSpringIntegrationApproach2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class UpdateMany {

	public static void main(String[] args) {

		// create instance of application context
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// get instance of template
		MongoTemplate template = context.getBean(MongoTemplate.class);

		// create skillsets
		List<String> skillSet = new ArrayList<String>();
		skillSet.add("sap");
		skillSet.add("java");
		skillSet.add("unix");
		// call updateMulti method of template to update multiple JSON document
		template.updateMulti(Query.query(Criteria.where("skillSet").in(skillSet)), Update.update("hobby", "music"),
				Person.class);
		// close the application context
		context.close();

	}

}
