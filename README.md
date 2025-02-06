# Trade-API
A RESTful API service built with Spring Boot that manages trading operations. This project allows users to create, read, update, and delete trade records.

## Features
- Full CRUD operations for trade records
- MySQL database integration
- Swagger UI documentation
- RESTful architecture

## Technologies Used
- Java 21
- Spring Boot 3.2.2
- Spring Data JPA
- MySQL
- Maven
- Swagger UI (OpenAPI)

## Prerequisites
- JDK 21 or higher
- Maven
- MySQL


## Setup Instructions

1. Clone the repository:
   ```bash
   git clone [repository-url]
   cd trading-api

2. Create MySQL Database
CREATE DATABASE trading_db;


3. Configure database connection:
Navigate to src/main/resources/application.properties
Add your database configuration (see application.properties file) --> On line spring.datasource.password=YOUR_PASSWORD , replace "YOUR_PASSWORD" with your MySql password


5. Run the application
   ./mvnw spring-boot:run

## API Endpoints
- `GET /trades` - Retrieve all trades
- `GET /trades/{id}` - Retrieve a specific trade 
- `POST /trades` - Create a new trade
- `PUT /trades/{id}` - Update an existing trade
- `DELETE /trades/{id}` - Delete a trade

## Project Structure
![My folder structure prplebg](https://github.com/user-attachments/assets/4e1d62a8-9c65-4038-92d8-7caae46a0643)



    This project is licensed under the MIT License - see the LICENSE file for details.
    
   
