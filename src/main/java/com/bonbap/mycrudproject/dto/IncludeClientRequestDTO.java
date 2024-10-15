package com.bonbap.mycrudproject.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class IncludeClientRequestDTO {

    @NotNull
    private String id;

    @NotNull(message = "The field name cannot be null!")
    private String name;

    @NotNull(message = "The field registrationNumber cannot be null!")
    private String registrationNumber;

    @NotNull(message = "The field cellphoneNumber cannot be null!")
    private String cellphoneNumber;

}
