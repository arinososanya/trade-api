package com.arinososanya.trade_api.repository;

import com.arinososanya.trade_api.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// The repository handles raw data and basic database operations

@Repository // This annotation tells Spring that this is a component that handles data access
public interface TradeRepository extends JpaRepository<Trade, UUID> {
}
