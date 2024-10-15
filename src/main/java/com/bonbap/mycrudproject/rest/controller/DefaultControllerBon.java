package com.bonbap.mycrudproject.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DefaultControllerBon {

    public <T> ResponseEntity<T> post(final T body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }

    public <T> ResponseEntity<T> get(final T body) {
        if (null == body) {
            throw new IllegalArgumentException("Body is null");
        }
        return ResponseEntity.ok().body(body);
    }
}