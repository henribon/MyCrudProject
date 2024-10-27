package com.bonbap.mycrudproject.dto.domain;

public enum DomainClientSituation {
    ACTIVATE("A", "Client active in our database"),
    INACTIVATE("I", "Client inactivated in our database"),;

    DomainClientSituation(String value, String description) {
    }
}
