package com.example.library.controller;

import com.example.library.entity.*;
import com.example.library.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibraryController {

    @Autowired private ReaderRepository readerRepo;
    @Autowired private BookRepository bookRepo;
    @Autowired private AuthorRepository authorRepo;
    @Autowired private CategoryRepository categoryRepo;

    // Reader APIs
    @PostMapping("/readers")
    public Reader addReader(@RequestBody Reader reader) {
        return readerRepo.save(reader);
    }

    @GetMapping("/readers")
    public List<Reader> getAllReaders() {
        return readerRepo.findAll();
    }

    @PutMapping("/readers/{id}")
    public Reader updateReader(@PathVariable Long id, @RequestBody Reader updated) {
        updated.setId(id);
        return readerRepo.save(updated);
    }

    @DeleteMapping("/readers/{id}")
    public void deleteReader(@PathVariable Long id) {
        readerRepo.deleteById(id);
    }

    // Author APIs
    @PostMapping("/authors")
    public Author addAuthor(@RequestBody Author author) {
        return authorRepo.save(author);
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    @PutMapping("/authors/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author updated) {
        updated.setId(id);
        return authorRepo.save(updated);
    }

    @DeleteMapping("/authors/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorRepo.deleteById(id);
    }

    // Category APIs
    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryRepo.save(category);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @PutMapping("/categories/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category updated) {
        updated.setId(id);
        return categoryRepo.save(updated);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryRepo.deleteById(id);
    }

    // Book APIs
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updated) {
        updated.setId(id);
        return bookRepo.save(updated);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepo.deleteById(id);
    }
}
