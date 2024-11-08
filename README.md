# Trade-API

A RESTful API service built with Spring Boot that manages trading operations. This project allows users to create, read, update, and delete trade records, with filtering capabilities for specific trading scenarios.

## Features

- Full CRUD operations for trade records
- Data filtering using Spring Data JPA
- Exception handling
- MySQL database integration
- Unit tests coverage
- RESTful architecture

## Technologies Used

- Java 21
- Spring Boot 3.2.3
- Spring Data JPA
- MySQL
- Maven
- JUnit (for testing)

## Prerequisites

- JDK 21 or higher
- Maven
- MySQL
- Git

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone [repository-url]
   cd trading-api

2. Create MySQL Database
CREATE DATABASE trading_db;


3. Configure database connection:
Create src/main/resources/application.properties
Add your database configuration

4. Run the application
   ./mvnw spring-boot:run

## API Endpoints

GET /api/trades - Retrieve all trades
GET /api/trades/{id} - Retrieve a specific trade
POST /api/trades - Create a new trade
PUT /api/trades/{id} - Update an existing trade
DELETE /api/trades/{id} - Delete a trade

## Project Structure
src/
├── main/
│   ├── java/
│   │   └── com/[Arin]/tradingapi/
│   │       ├── controllers/
│   │       ├── models/
│   │       ├── repositories/
│   │       └── services/
│   └── resources/
└── test/
    └── java/


    This project is licensed under the MIT License - see the LICENSE file for details.
    
   
