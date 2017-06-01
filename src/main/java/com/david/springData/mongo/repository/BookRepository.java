package com.david.springData.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.david.springData.mongo.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String>{

}
