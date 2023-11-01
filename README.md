# Employee System

## Introduction

This project is a simple Employee System designed to demonstrate the implementation of clean architecture principles. It provides two main endpoints for creating and retrieving employee records:

- POST /api/v1/employees
- GET /api/v1/employees/{id}

## Clean Architecture Principles

Clean Architecture is an architectural pattern that promotes separation of concerns and maintainability of code. Here's how this project adheres to clean architecture principles:

### 1. Separation of Concerns

The project is divided into distinct layers:

- **Presentation Layer**: This is where the API endpoints are defined and interact with the external world. It handles HTTP requests and responses.

- **Application Layer**: This layer contains the business logic of the application. It is responsible for processing requests from the presentation layer and coordinating the interactions between the domain layer and data access layer.

- **Domain Layer**: The core of the application. It defines the business entities, use cases, and business rules. It is independent of any external framework or technology.

- **Data Access Layer**: This layer deals with data storage and retrieval. It abstracts the database interactions and provides repository interfaces for the application layer to use.

### 2. Dependency Inversion Principle (DIP)

The project follows the Dependency Inversion Principle by ensuring that high-level modules (application layer) do not depend on low-level modules (data access layer). Instead, both depend on abstractions defined in the domain layer. This allows for flexibility and easier testing.

### 3. Single Responsibility Principle (SRP)

Each component within the project follows the SRP. For example, the controllers in the presentation layer are responsible for handling HTTP requests and responses only. The domain layer defines business rules without being concerned about how data is stored or presented.

## Design Patterns

In addition to clean architecture, this project also incorporates the following design patterns:

### 1. Repository Pattern

The Data Access Layer uses the Repository Pattern to abstract the data storage and retrieval operations. This pattern provides a clean and consistent interface for the application layer to interact with the database, promoting code maintainability.

### 2. RESTful API Design

The project follows RESTful API design principles, using HTTP methods (POST and GET) and resource URIs (/api/v1/employees) for creating and retrieving employee records. This promotes a consistent and predictable API.

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository to your local machine.
2. Set up a database connection and configure it in the project.
3. Build and run the application.

## API Endpoints

- **POST /api/v1/employees**: Create a new employee record. Provide employee details in the request body.

- **GET /api/v1/employees/{id}**: Retrieve an employee record by ID.

## Folder Structure 

<img width="418" alt="Screenshot 2023-11-01 at 6 35 13 PM" src="https://github.com/rupysdxe/EmployeSystem/assets/83266954/ea3b47e3-2756-4742-9863-308666d783e0">

## Dependencies

List any external libraries, frameworks, or tools used in this project.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

If you have any questions or suggestions, feel free to contact me.
