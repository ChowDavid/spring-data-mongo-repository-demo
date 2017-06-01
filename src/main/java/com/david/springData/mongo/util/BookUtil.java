package com.david.springData.mongo.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.david.springData.mongo.model.Author;
import com.david.springData.mongo.model.Book;

public class BookUtil {
	
	public static Book create(){
		Book book=new  Book("Java Core",new Date(),500,new BigDecimal("200.16"));
		book.setAuthor(new Author("David","Chow","Australia"));
		return book;
	}
	
	public static List<Book> create(int numberOfBook){
		List<Book> books=new ArrayList<>();
		for (int i=0;i<numberOfBook;i++){
			books.add(create());
		}
		return books;
	}

}
