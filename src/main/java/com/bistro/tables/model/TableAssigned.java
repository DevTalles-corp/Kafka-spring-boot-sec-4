package com.bistro.tables.model;

import java.time.LocalDateTime;

public record TableAssigned(
        Long reservationId,
        Long tableId,
        String tableNumber,
        LocalDateTime occurredAt
) {
}
