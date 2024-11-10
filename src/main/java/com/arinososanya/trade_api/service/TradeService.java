package com.arinososanya.trade_api.service;

import com.arinososanya.trade_api.model.Trade;
import com.arinososanya.trade_api.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


// This is where I add business functionalities / logic
// What my Trade API Does (CRUD Methods):
// Get all trades
// Get one trade
// Create trade
// Update trade
// Delete trade


@Service
public class TradeService {
    @Autowired // This annotation is for dependency injection. It allows Spring to resolve and inject collaborating beans into our bean.

    private TradeRepository tradeRepository;

    // Get all trades
    public List<Trade> getAllTrades(){
        return tradeRepository.findAll();
    }

    // Get a specific trade by ID
    public Trade getTrade(UUID id){
        return tradeRepository.findById(id).orElseThrow(() -> new RuntimeException("Trade not found"));
    }


    // Create a new trade
    public Trade createTrade(Trade trade){
        // Set the timestamp to now
        trade.setTimestamp(LocalDateTime.now());
        return tradeRepository.save(trade);
    }

    // Update an existing trade
    public Trade updateTrade(UUID id, Trade trade){
        Trade existingTrade = getTrade(id);
        existingTrade.setSymbol(trade.getSymbol());
        existingTrade.setQuantity(trade.getQuantity());
        existingTrade.setPrice(trade.getPrice());
        existingTrade.setTradeType(trade.getTradeType());
        return tradeRepository.save(existingTrade);

    }

    // Delete a trade
    public void deleteTrade(UUID id){
        // First check if trade exists
        Trade trade = getTrade(id);
        // If trade exists, delete it
        tradeRepository.deleteById(id);
    }

}
