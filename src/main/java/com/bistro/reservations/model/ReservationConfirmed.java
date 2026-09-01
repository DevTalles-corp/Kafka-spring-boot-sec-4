package com.bistro.reservations.model;

import java.time.LocalDateTime;

public record ReservationConfirmed(
        Long reservationId,
        String reservationCode,
        String customerEmail,
        String tableNumber,
        LocalDateTime reservationTime,
        LocalDateTime occurredAt
) {
}
