package com.arinososanya.trade_api.controller;

import com.arinososanya.trade_api.model.Trade;
import com.arinososanya.trade_api.service.TradeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController // This tells Spring this class handles HTTP requests and automatically converts responses to JSON
@RequestMapping("/trades") // Sets the base URL path for all endpoints in this controller to "/trades"
@Tag(name = "Trade API", description = "Trade management API endpoints")



// This class handles the HTTP Requests and works with my TradeService
public class TradeController {

    @Autowired
    private TradeService tradeService;  // Controller uses my existing TradeService

    // When HTTP POST request comes in
    @PostMapping
    @Operation(
            summary = "Create a new trade",
            description = "Creates a new trade with the given trade details"
    )

    public Trade createTrade(@RequestBody Trade trade) {
        return tradeService.createTrade(trade);  // Calls your existing service method
    }

    // When HTTP GET request comes in for all trades
    @GetMapping
    @Operation(summary = "Get all trades",
    description = "Retrieves a list of all trades")
    public List<Trade> getAllTrades() {
        return tradeService.getAllTrades();  // Calls your existing service method
    }

    // When HTTP GET request comes in for a specific trade
    @GetMapping("/{id}")
    @Operation(summary = "Get a trade by ID",
    description = "Retrieves a specific trade using its ID")
    public ResponseEntity<Trade> getTradeById(
            @Parameter(description = "ID of the trade to retrieve")
            @PathVariable UUID id) {
        Trade trade = tradeService.getTrade(id);  // Calls your existing service method
        return ResponseEntity.ok(trade);
    }

    // When HTTP PUT request comes in
    @PutMapping("/{id}")
    @Operation(summary = "Update a trade",
            description = "Updates an existing trade with new information")
    public ResponseEntity<Trade> updateTrade(@PathVariable UUID id, @RequestBody Trade trade) {
        return ResponseEntity.ok(tradeService.updateTrade(id, trade));  // Calls your existing service method
    }

    // When HTTP DELETE request comes in
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a trade",
            description = "Deletes a trade by its ID")
    public ResponseEntity<Void> deleteTrade(@PathVariable UUID id) {
        tradeService.deleteTrade(id);
        return ResponseEntity.ok().build();
    }
}

