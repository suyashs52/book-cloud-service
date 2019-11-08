package com.example.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class BooksApplication {
//http://localhost:8080/v1/books/11/licenses/111
	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

}
