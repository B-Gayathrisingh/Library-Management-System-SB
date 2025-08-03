package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate publishDate;

    
    public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public Reader getReader() {
		return reader;
	}

	public Category getCategory() {
		return category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@ManyToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
