package com.bonbap.mycrudproject.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DefaultControllerBon {

    public <T> ResponseEntity<T> post(final T body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }
}
