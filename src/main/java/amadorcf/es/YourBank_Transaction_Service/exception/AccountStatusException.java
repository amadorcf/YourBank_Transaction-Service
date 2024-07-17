package amadorcf.es.YourBank_Transaction_Service.exception;

public class AccountStatusException extends GlobalException {

    public AccountStatusException(String message) {
        super(message, GlobalErrorCode.BAD_REQUEST);
    }
}
