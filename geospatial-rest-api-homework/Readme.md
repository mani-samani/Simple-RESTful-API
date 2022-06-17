#  Simple RESTful API That Interacts With a Backend Database

Develop a simple RESTful CRUD API for an ATM tracking application using Spring Boot, Mysql, JPA and Hibernate.

## Minimum Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/mani-samani/Simple-RESTful-API.git
```

**2. Create Mysql database**
```bash
create database atm_app
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/atm-app-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/atm
    
    POST /api/atm
    
    GET /api/atm/{id}
    
    PUT /api/atm/{id}
    
    DELETE /api/atm/{id}

You can test them using postman or any other rest client.