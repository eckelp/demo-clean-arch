package com.example.democleanarch.gateways.http.json;

import java.math.BigDecimal;

public record CreateProductJson(
        String name,
        BigDecimal price
) {
}
