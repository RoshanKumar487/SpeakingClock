# SpeakingClock
The Speaking Clock Application is a Java Spring Boot project designed to convert the current time from a 24-hour clock format into words. It aims to provide a user-friendly representation of the time in a natural language form.
# Speaking Clock Application

## Overview
The Speaking Clock Application is a Spring Boot project that converts the given time in 24-hour format into words.

## Requirements
- Java 8 or above
- Maven

## Build and Run
To build and run the project, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/speaking-clock.git
Navigate to the project directory:

   ```bash
   cd speaking-clock
Build the project using Maven:

mvn clean install
Run the Spring Boot application:


java -jar target/speaking-clock-1.0.0.jar
Open your browser and go to http://localhost:8080/swagger-ui.html to access the Swagger documentation and test the API.

API Endpoints
Convert Time to Words
Endpoint: /api/time/{inputTime}
Method: GET
Example: /api/time/12:34
Response: It's twelve thirty four
Swagger Documentation
The API is documented using Swagger. Access the Swagger UI at http://localhost:8080/swagger-ui.html for detailed API documentation and testing.

Additional Information
Author: Roshan kumar
Email: Roshankumar70975@gmail.com
License: This project is licensed under the NONE - see the LICENSE file for details.
vbnet


