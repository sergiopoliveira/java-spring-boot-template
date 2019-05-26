package com.book.service;

import com.book.api.model.BookDTO;

import java.util.List;

public interface BookService {

	List<BookDTO> getBooksByName(String name);
	
	BookDTO giveFeedback(String name, String asin, String feedback);
	
}
