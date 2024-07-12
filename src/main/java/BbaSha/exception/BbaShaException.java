package BbaSha.exception;

import lombok.Getter;

@Getter
public class BbaShaException extends RuntimeException {

    private Class<?> targetClass = BbaShaException.class;

    public BbaShaException(String message) {
        super("[ERROR] " + message);
    }

    public BbaShaException(Class<?> clazz, String message) {
        super("[ERROR]" +  message);
        this.targetClass = clazz;
    }


}
