package com.Book.spring_data_jpa_book.repo;

import com.Book.spring_data_jpa_book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

    List<Book> findById(int id);
    List<Book> findByName(String name);
    List<Book> findByAuthor(String author);

    List<Book> findByAuthorContainingOrPrice(String author, Integer price);

    List<Book> findByAuthorContainingOrNameContainingOrPrice(String author, String name, Integer price);


   //  Custom query to search books based on optional criteria.
    @Query("SELECT b FROM Book b WHERE " +
            "(:author IS NULL OR b.author = :author) AND " +
            "(:name IS NULL OR b.name =:name) AND " +
            "(:price IS NULL OR b.price = :price)")
    List<Book> findBooksByCriteria(@Param("author") String author,
                                   @Param("name") String name,
                                   @Param("price") Integer price);
}
