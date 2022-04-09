package webworkout.project.exception;


import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class ConstraintViolationException extends Exception {
    private List<ConstraintViolationException> fieldViolations = Collections.emptyList();


    public ConstraintViolationException(String name, String title, String creator, String publisher) {
    }

    public ConstraintViolationException(String message, List<ConstraintViolationException> fieldViolations) {
        super(message);
        this.fieldViolations = fieldViolations;
    }

    public ConstraintViolationException(String message, Throwable cause, List<ConstraintViolationException> fieldViolations) {
        super(message, cause);
        this.fieldViolations = fieldViolations;
    }

    public ConstraintViolationException(Throwable cause, List<ConstraintViolationException> fieldViolations) {
        super(cause);
        this.fieldViolations = fieldViolations;
    }

    public ConstraintViolationException(String name, String title, boolean tags, String publisher) {
    }


    public List<ConstraintViolationException> getFieldViolations() {
        return fieldViolations;
    }

    public void setFieldViolations(List<ConstraintViolationException> fieldViolations) {
        this.fieldViolations = fieldViolations;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ", " + "Constraint violations: " + getFieldViolations();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ConstraintViolationException.class.getSimpleName() + "[", "]")
                .add("fieldViolations=" + fieldViolations)
                .toString();
    }
}
