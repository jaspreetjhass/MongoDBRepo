package org.jp.controllers;

import java.util.List;

import org.jp.models.Category;
import org.jp.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/categories" })
public class CategoryRestController {

	@Autowired
	private CategoryService service;

	@RequestMapping(value = { "{categoryName}" }, produces = { "application/json" }, method = RequestMethod.GET)
	public Category findOneCategory(@PathVariable("categoryName") String name) {

		return service.findOneCategory(name);
	}

	@RequestMapping(produces = { "application/json" }, method = RequestMethod.GET)
	public List<Category> findAllCategories() {

		return service.findAllCategories();
	}

	@RequestMapping(produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public Category addCategory(@RequestBody Category category) {

		return service.addCategory(category);
	}

	@RequestMapping(produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.PUT)
	public Category updateCategory(@RequestBody Category category) {

		return service.updateCategory(category);
	}

	@RequestMapping(value = { "{categoryName}" }, produces = { "application/json" }, method = RequestMethod.DELETE)
	public Category deleteCategory(@PathVariable("categoryName") String name) {

		return service.deleteCategory(name);
	}

}
