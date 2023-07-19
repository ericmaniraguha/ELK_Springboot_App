# ELK_Springboot_App

# Microservices Logging | ELK Stack | Elastic Search | Logstash | Kibana |

## Project Setup
In this project, the focus was on integrating the ELK Stack (Elasticsearch, Logstash, and Kibana) for microservices logging. The setup involved downloading and configuring Elasticsearch, Logstash, and Kibana alongside the Spring Boot suite. 

To start, the following steps were performed:

1. Download and install Elasticsearch, Logstash, and Kibana.
2. Modify the Logstash sample configuration file (`logstash-sample.config`) to define the pipeline for processing and forwarding logs.
3. Configure Logstash to read logs from a specific file (`mylogfile.log`) by providing the full path.
4. Configure Logstash to send processed logs to Elasticsearch for storage.
5. Specify the Elasticsearch connection details, including the host URL, SSL settings, index name, and user credentials.

## Controller and Service
To ensure a well-structured and maintainable codebase, the project was organized using the MVC (Model-View-Controller) architecture pattern. The code was split into a **controller** and a **service**, providing clear separation of responsibilities.

### UserController.java (Controller)
The `UserController` class serves as the REST controller responsible for handling incoming HTTP requests related to user data. It defines the `/getUser/{id}` endpoint, allowing retrieval of a user by their ID. The controller delegates the user retrieval logic to the `UserService`.

### UserService.java (Service)
The `UserService` class contains the business logic for retrieving user data. It includes the `getUserById` method, which takes an ID as input and returns the corresponding `User` object. If the user is found, an info message is logged. If the user is not found, an error message is logged, and a default `User` object is returned.

By separating the controller and service, the project maintains a modular and scalable code structure, facilitating ease of maintenance and future enhancements.

