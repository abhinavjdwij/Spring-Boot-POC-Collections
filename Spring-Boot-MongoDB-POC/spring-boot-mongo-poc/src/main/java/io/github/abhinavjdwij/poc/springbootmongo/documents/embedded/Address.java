package io.github.abhinavjdwij.poc.springbootmongo.documents.embedded;

import lombok.Data;

@Data
public class Address {
    private Integer pinCode;
    private String addressLine;
    private String city;
    private String state;
    private String country;
}
