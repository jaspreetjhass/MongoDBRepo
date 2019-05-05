package org.jp.services;

import java.util.List;

import org.jp.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private MongoTemplate template;

	public Category findOneCategory(String name) {

		return template.findOne(Query.query(Criteria.where("categoryName").is(name)), Category.class);
	}

	public List<Category> findAllCategories() {

		return template.findAll(Category.class);
	}

	public Category addCategory(Category category) {

		template.save(category);

		return category;
	}

	public Category updateCategory(Category category) {

		return template.findAndReplace(Query.query(Criteria.where("categoryName").is(category.getCategoryName())), category);
	}

	public Category deleteCategory(String name) {

		return template.findAndRemove(Query.query(Criteria.where("categoryName").is(name)), Category.class);
	}
}
