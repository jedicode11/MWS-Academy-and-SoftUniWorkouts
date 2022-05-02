package course.academy.exception;

public class NoneexistingEntityException extends Exception {

    public NoneexistingEntityException() {
    }

    public NoneexistingEntityException(String message) {
        super(message);
    }

    public NoneexistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoneexistingEntityException(Throwable cause) {
        super(cause);
    }
}
