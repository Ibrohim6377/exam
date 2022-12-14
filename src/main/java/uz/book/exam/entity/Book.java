package uz.book.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Double price;
    private Date publishedAt;
    private String publishedBy;
    private String authorName;
    private Integer pages;
    private String genre;
}
