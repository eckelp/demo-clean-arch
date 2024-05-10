package com.example.democleanarch.domains;

import java.math.BigDecimal;

public record Product(
        String id,
        String name,
        BigDecimal price
) {
}
