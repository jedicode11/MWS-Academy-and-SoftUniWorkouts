package course.academy.dao;

public interface DaoFactory {
    BookRepository createBookRepository();

    BookRepository createBookRepository(String dbFileName);

    BookRepository createBookRepositoryFile(String dbFileName);

    UserRepository createUserRepository();
}
