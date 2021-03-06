package course.academy.dao;

import course.academy.model.Book;

import java.util.List;

/**
 * Public interface for managing lifecycle of Book objects
 */
public interface BookRepository extends PersistableRepository<Long, Book> {
    List<Book> findAllSortedByDate(boolean ascending);
}
