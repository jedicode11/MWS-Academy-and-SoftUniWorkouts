package course.academy.controller;

import course.academy.exception.InvalidEntityDataException;
import course.academy.service.BookService;
import course.academy.view.Menu;
import course.academy.view.NewBookDialog;

import java.util.List;

public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void init() throws InvalidEntityDataException {
        var menu = new Menu("Main Menu", List.of(
                new Menu.Option("Load Books", () -> {
                    System.out.println("Loading books ...");
                    bookService.loadData();
                    return "Books loaded successfully.";
                }),
                new Menu.Option("Print All Books", () -> {
                    var books = bookService.getAllBooks();
                    books.forEach(System.out::println);
                    return "Total book count: " + books.size();
                }),
                new Menu.Option("Add New books", () -> {
                    var book = new NewBookDialog().input();
                    var books = bookService.addBook(book);
                    return String.format("Book ID:%s: '%s' added successfull");
                })
        ));
        menu.show();
    }
}