# Java Spring Boot Template for REST API

[![CircleCI](https://circleci.com/gh/sergiopoliveira/book-recommendation-system.svg?style=svg)](https://circleci.com/gh/sergiopoliveira/book-recommendation-system)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5b84bf2bcc5949338bb9806e35b4988e)](https://www.codacy.com/app/sergiopoliveira/book-recommendation-system?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=sergiopoliveira/book-recommendation-system&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/sergiopoliveira/book-recommendation-system/branch/master/graph/badge.svg)](https://codecov.io/gh/sergiopoliveira/book-recommendation-system)

One-line description of project.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

JDK 11 and Maven or Docker is required to run this project.

### Build and Run

#### Maven

Build and run the project with Maven:

```
mvn package
mvn spring-boot:run
```

#### Docker

Pull image: 

```actuator 
docker pull sergiopoliveira/book-recommendation-system
```

Run it:

```
docker run -p 8080:8080 sergiopoliveira/book-recommendation-system
```

## REST Endpoints

```
Describe REST Endpoints
```
## Testing Examples

Describe an example of using this project.

## Business Logic

Describe what this project does, how it processes data and presents it to the consumer.

## Running the tests

Tests created using JUnit and Mockito. Run them as:

```
mvn test
```

## Built With

*   Java 11
*   Spring Boot
*   Spring Data JPA
*   Project Lombok
*   MapStruct
*   Maven
*   JUnit, Mockito
*   H2 in-memory database

## Authors

*   **Sérgio Oliveira** - [sergiopoliveira](https://github.com/sergiopoliveira)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details