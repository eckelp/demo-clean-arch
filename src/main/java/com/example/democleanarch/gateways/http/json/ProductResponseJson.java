package com.example.democleanarch.gateways.http.json;

import java.math.BigDecimal;

public record ProductResponseJson(
        String id,
        String name,
        BigDecimal price
) {
}
