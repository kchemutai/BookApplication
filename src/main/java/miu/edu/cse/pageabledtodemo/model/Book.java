package miu.edu.cse.pageabledtodemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String title;
    private String isbn;
    private LocalDate publishedLocalDate;
    private BigDecimal price;

    public Book(String title, String isbn, LocalDate publishedLocalDate, BigDecimal price) {
        this.title = title;
        this.isbn = isbn;
        this.publishedLocalDate = publishedLocalDate;
        this.price = price;
    }
}
