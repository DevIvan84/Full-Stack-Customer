package org.customer.api.customerapi.customer;

public record CustomerRegistrationRequest (
        String name,
        String email,
        Integer age
){}
