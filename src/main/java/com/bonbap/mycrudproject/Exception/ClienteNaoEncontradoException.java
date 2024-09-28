package com.bonbap.mycrudproject.Exception;

public class ClienteNaoEncontradoException extends RuntimeException {
    public ClienteNaoEncontradoException(String message) {
        super(message);
    }

    public ClienteNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
