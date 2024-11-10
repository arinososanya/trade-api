package com.arinososanya.trade_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal; // provides operations for arithmetic, scale manipulation, rounding, comparison, hashing, and format conversion.
import java.time.LocalDateTime; // an immutable date-time object that represents a date-time, often viewed as year-month-day-hour-minute-second.
import java.util.UUID;

@Entity
@Table(name = "trades")
@Data // This annotation automatically creates all getters and setters

public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // UUID is more secure than simply using numbers 1,2,3 etc.
    private UUID id;

    private String symbol;
    private Integer quantity;
    private BigDecimal price;
    private String tradeType;
    private LocalDateTime timestamp;

}
