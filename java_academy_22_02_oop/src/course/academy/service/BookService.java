package course.academy.service;

import course.academy.exception.InvalidEntityDataException;
import course.academy.exception.NoneexistingEntityException;
import course.academy.model.Book;

import java.util.Collection;

import java.util.List;

public interface BookService {
    void loadData();
    Collection<Book> getAllBooks();

    List<Book> getAllBooksByDate(boolean ascending);

    Book getBookById(Long id) throws NoneexistingEntityException;
    Book addBook(Book book) throws InvalidEntityDataException;
    Book updateBook(Book book) throws NoneexistingEntityException, InvalidEntityDataException;
    Book deleteBookById(Long id) throws NoneexistingEntityException;
    long count();
}
