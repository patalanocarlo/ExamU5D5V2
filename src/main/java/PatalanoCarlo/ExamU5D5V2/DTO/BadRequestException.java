package PatalanoCarlo.ExamU5D5V2.DTO;

import org.springframework.validation.ObjectError;

import java.util.List;

public class BadRequestException extends RuntimeException {
    private final List<ObjectError> errorsList;

    public BadRequestException(String message) {
        super(message);
        this.errorsList = null;
    }

    public BadRequestException(List<ObjectError> errorsList) {
        super("Validation errors");
        this.errorsList = errorsList;
    }

    public List<ObjectError> getErrorsList() {
        return errorsList;
    }
}