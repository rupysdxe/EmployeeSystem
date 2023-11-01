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
# Explanation 


1. **com.dev.employeesystem**: This is the root package of the application.

2. **adapters**: In Clean Architecture, the adapters are the mechanisms by which data and control are transferred between the outer layers and inner circles.

   - **in.web**: This is where the web-related adapters reside. It serves as the interface through which external systems communicate with the application. Here's the breakdown:
     - **AddNewEmployeeController**: A web controller handling the addition of a new employee.
     - **EmployeeDto**: Data Transfer Object, which is a pattern used to transfer data between software application subsystems.
     - **RequestEmployeeDetailsController**: A web controller to fetch employee details.

   - **out.persistence**: This represents the persistence (or database) adapters that the application uses.
     - **EmployeeEntity**: This likely represents a database entity for an employee.
     - **EmployeeJPARepository**: A JPA repository interface for CRUD operations.
     - **EmployeeRepositoryImpl**: The actual implementation of the repository interface. 

3. **application**: Represents the application-specific business rules. This would be considered as the use cases of the system.

   - **domain**: This encapsulates enterprise-wide business rules.
     - **commands**: Contains command objects which represent requests to perform an action. 
       - **CreateNewEmployeeCommand**: A command to create a new employee.
     - **model**: Holds domain models, which encapsulate the business logic.
       - **Employee**: The main domain model representing an employee.
     - **service**: Contains services which operate on the domain models and commands.
       - **EmployeeCommandService**: Service to handle operations related to employee commands.
       - **EmployeeQueryService**: Service to query employee data.

   - **port**: Ports are the entry and exit points to the inner circles.
     - **in**: Represents use cases of the application. They define how the outer layer interacts with the application.
       - **AddNewEmployeeUseCase**: A use case for adding a new employee.
       - **EmployeeRetrievalUseCase**: A use case to retrieve employee details.
     - **out**: Represents interfaces that the application implements. 
       - **FetchEmployeeById**: Likely an interface to fetch employee by their ID.
       - **PersistEmployee**: Likely an interface to persist an employee.

4. **CanteenSystemApplication**: This is the main application class, bootstrapping the entire system.

5. **resources**: Contains resources like configurations, properties, etc.
   - **application.properties**: Configuration properties for the application.

### Explanation of Adherence to Clean Architecture:

- **Separation of Concerns**: The architecture clearly divides the system into different packages and layers based on their responsibilities.

- **Independent of UI**: The `in.web` package ensures that the core logic doesn't depend on the UI. The controllers can be changed without affecting the business logic.

- **Independent of Database**: The database details are abstracted away in the `out.persistence` package. This ensures that the core logic doesn't have to change if the database technology or schema changes.

- **Centralized Business Logic**: All business logic is centralized in the `domain` package, making it easier to manage, modify, and test.

Overall, folder structure adheres to the principles of Clean Architecture by ensuring that the software is organized in a way that maintains separation of concerns, flexibility, testability, and scalability.

## Dependencies

List any external libraries, frameworks, or tools used in this project.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

If you have any questions or suggestions, feel free to contact me.
