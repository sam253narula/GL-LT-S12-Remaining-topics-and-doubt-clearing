package com.greatlearning.library.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.entity.Library;

@RestController
public class CustomQueryDemoController {

	@Autowired
	EntityManager entityManager;

	@GetMapping("/getLibWithNoBooks")
	public List<Library> getLibWithNoBooks(String commaSeperatedBookNames) {
		TypedQuery<Library> query = entityManager
				.createQuery("Select l from Library l where l.commaSeperatedBooknames = '"+ commaSeperatedBookNames + "'" , Library.class);
		return query.getResultList();

	}
}
