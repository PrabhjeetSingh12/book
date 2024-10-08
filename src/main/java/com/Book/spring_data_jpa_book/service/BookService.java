package com.Book.spring_data_jpa_book.service;

import com.Book.spring_data_jpa_book.repo.BookRepo;
import com.Book.spring_data_jpa_book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepo repo;

    public List<Book> getAllBooks(){
        return repo.findAll();
    }

    public void addBook(Book book ){
        repo.save(book);
    }

    public List<Book> getBook(int id){
        return repo.findById(id);
    }

    public void updateBook(Book book){
        repo.save(book);
    }

    public void deleteBook(int id){
        repo.deleteById(id);
    }
    public List<Book> getBookName(String name){
        return repo.findByName(name);
    }

    public List<Book> getAuthor(String author) {
        return repo.findByAuthor(author);
    }


    public List<Book> search(Integer keyword) {
        return repo.findByAuthorContainingOrPrice(String.valueOf(keyword),keyword);
    }

    public List<Book> searchBooks(String author, String name, Integer price) {
        // Call the repository method with the passed parameters.
        // The implementation should handle various combinations of non-null parameters.
        return repo.findBooksByCriteria(author, name, price);
    }
    public List<Book> searchBoooks(String author, String name, Integer price){
       return repo.findByAuthorContainingOrNameContainingOrPrice(author,name,price);
    }
}
