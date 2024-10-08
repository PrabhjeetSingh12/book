package com.Book.spring_data_jpa_book;

import com.Book.spring_data_jpa_book.model.Book;
import com.Book.spring_data_jpa_book.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class SpringDataJpaBookApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext context =
				SpringApplication.run(SpringDataJpaBookApplication.class, args);

		//BookRepo repo = context.getBean(BookRepo.class);

//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////
////
////
//	Book book1 = context.getBean(Book.class);
//		book1.setId(5);
//		book1.setName("The Silent Patient");
//		book1.setauthor("Alex Michaelides");
//		book1.setReleased_Date(dateFormat.parse("2024-09-05"));
//		book1.setPrice(20);
//
//		Book book2 = context.getBean(Book.class);
//		book2.setId(2);
//		book2.setName("Where the Crawdads Sing");
//		book2.setauthor("Delia Owens");
//		book2.setReleased_Date(dateFormat.parse("2024-09-06"));
//		book2.setPrice(25);
////
//		Book book3 = context.getBean(Book.class);
//		book3.setId(3);
//		book3.setName("The Night Circus");
//		book3.setauthor("Erin Morgenstern");
//		book3.setReleased_Date(dateFormat.parse("2024-09-07"));
//		book3.setPrice(30);
////
//		Book book4 = context.getBean(Book.class);
//		book4.setId(4);
//		book4.setName("Circe");
//		book4.setauthor("Madeline Miller");
//		book4.setReleased_Date(dateFormat.parse("2024-09-08"));
//		book4.setPrice(22);
//
//
//		Book book5 = context.getBean(Book.class);
//		book5.setId(1);
//		book5.setName("The Silent Patient");
//		book5.setauthor("Alex Michaelides");
//		book5.setReleased_Date(dateFormat.parse("2024-09-05"));
//		book5.setPrice(20);
//
//			repo.save(book1);
//			repo.save(book2);
//			repo.save(book3);
//			repo.save(book4);
//			repo.save(book5);



//		System.out.println(repo.findById(3));
	//	System.out.println(repo.findByName("the night circus"));

	}

}
