package com.Book.spring_data_jpa_book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
//@Scope("prototype")
@Entity
public class Book {
    @Id
    private int id;
    private String name;
    private String author;
    private Date released_Date;
    private int price;



//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//   public String getauthor() {
//        return author;
//   }
////
//    public void setauthor(String author) {
//       this.author= author;
//    }
//
//    public Date getReleased_Date() {
//        return released_Date;
//    }
//
//    public void setReleased_Date(Date released_Date) {
//        this.released_Date = released_Date;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author_Name='" + author_Name + '\'' +
//                ", released_Date=" + released_Date +
//                ", price=" + price +
//                '}';
//    }
}
