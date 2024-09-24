package com.bonbap.mycrudproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class DefaultService {
    protected static final Logger log = LoggerFactory.getLogger(DefaultService.class);

    public DefaultService() {
    }

    protected void info(String message) { log.info(message);}
    protected void warn(String message) { log.warn(message);}
    protected void error(String message) { log.error(message);}

    public <T> ResponseEntity<T> save(T entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

}
