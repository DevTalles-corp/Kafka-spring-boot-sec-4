package com.bistro.tables.model;

import java.time.LocalDateTime;

public record TableUnavailable(
        Long reservationId,
        String reason,
        LocalDateTime occurredAt
) {
}
