# JWT 

This project is a Java Spring Boot application that implements JWT (JSON Web Token) authentication.

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository: `git clone https://github.com/karththikeyanK/JWT.git`
2. Navigate to the project directory: `cd JWT`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Configuration

The project uses Spring Security to handle authentication and authorization. By default, all API endpoints require a valid JWT token except for the `/api/v1/auth/**` path.

To configure additional request matchers that don't require a token, you can modify the `WebSecurityConfig` class. In the `configure` method, add the following line:
