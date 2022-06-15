package com.fredson.umlusecase.services.exceptions;

public class EntityNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EntityNotFoundException(String mensage) {
        super(mensage);
    }
}
