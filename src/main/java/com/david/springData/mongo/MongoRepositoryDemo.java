package com.david.springData.mongo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.david.springData.mongo.model.Book;
import com.david.springData.mongo.repository.BookRepository;
import com.david.springData.mongo.util.BookUtil;

public class MongoRepositoryDemo {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");) {
			BookRepository repo = context.getBean(BookRepository.class);
			MongoOperations template = (MongoTemplate) context.getBean("mongoTemplate");
			Book newBook=BookUtil.create();
			
			template.dropCollection(Book.class);
			
			repo.save(newBook);
		}
	}

}
