package cdrenttest.cdrent.exceptions.cdexception;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }
}
