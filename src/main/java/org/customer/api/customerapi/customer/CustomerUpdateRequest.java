package org.customer.api.customerapi.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
