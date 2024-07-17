package amadorcf.es.YourBank_Transaction_Service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalException extends RuntimeException {

    private String errorCode;

    private String message;

    public GlobalException(String message) {
        this.message = message;
    }
}
