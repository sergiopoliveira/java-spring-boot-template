# Java Spring Boot Template for REST API

[![CircleCI](https://circleci.com/gh/sergiopoliveira/java-spring-boot-template.svg?style=svg)](https://circleci.com/gh/sergiopoliveira/java-spring-boot-template)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/4cb17899b04743ddb92fc72d2cd36ff9)](https://www.codacy.com/app/sergiopoliveira/java-spring-boot-template?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=sergiopoliveira/java-spring-boot-template&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/sergiopoliveira/java-spring-boot-template/branch/master/graph/badge.svg)](https://codecov.io/gh/sergiopoliveira/java-spring-boot-template)

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

[Public page from Docker Hub](https://hub.docker.com/r/sergiopoliveira/java-spring-boot-template)

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

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details