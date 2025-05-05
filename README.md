# S4.02-APIRESTSpringBoot-Nivel3

This is a Spring Boot project built with Maven as the dependency manager. 
It implements a complete CRUD for a `Fruit` entity and follows the MVC pattern, using REST best practices 
and persistence with a MongoDB database.

## Requirements

- Java JDK (minimum version 17)
- Maven installed
- MongoDB installed and running (local or cloud)
- Postman (or any HTTP client) to test the API

---

## MongoDB Configuration

Before running the app, make sure MongoDB is running.

1. If using **local MongoDB**, no extra configuration is needed by default.
2. If using **MongoDB Atlas (cloud)**, update your `application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/frutasdb
```

## How to Run the Application

1- Clone this repository or download the project.

2- Open a terminal in the project root directory.

3- Run the following Maven command:
```bash
bash
Copiar
Editar
mvn spring-boot:run
```
4- The app will be available at http://localhost:8080.

## API Endpoints
This API has been tested using Postman.