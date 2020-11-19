# Getting Started

### Messaging with RabbitMQ

This guide walks you through the process of setting up a RabbitMQ AMQP server that publishes and subscribes to messages and creating a Spring Boot application to interact with that RabbitMQ server



## Explanation of REST

To provide a standard way of accessing the data the plugin is using REST.

| HTTP Method       | Usage                                                        |
| ----------------- | ------------------------------------------------------------ |
| **POST** /order/? | make a request to the end-point with some JSON body,sending the message in the URL |



## JSON Formats Examples

> ```
> {
>  "name":"Jon",
>  "quantity":1,
>  "price":349
> }
> ```



## Running Locally

OS X - Linux - Windows

> ```
> git clone https://github.com/RicardoVargasLeslie/rabbitMQ-demo.git
> cd rabbitMQ-demo-main
> run ./mvnw spring-boot:run
> ```

### Built With

- [Maven -Version 3.6.3](https://maven.apache.org/)
- [Java11](https://github.com/RicardoVargasLeslie/lyst-project/blob/master)
- [Eclipse IDE for Enterprise Java Developer-Version: 2020-03 (4.15.0)](https://www.eclipse.org/ide/)



### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/#build-image)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-amqp)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Contact Me

If you want to contact me you can reach me at [RicardoVargasLeslie@gmail.com](mailto:RicardoVargasLeslie@gmail.com).

### License

This project uses the following license: [Apache License 2.0](https://github.com/RicardoVargasLeslie/lyst-project/blob/master/link).

