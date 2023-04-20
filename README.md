# cinema-app



# PROJECT DESCRIPTION
This project was created for people who need help in managing their cinema business. It keeps all the information about cinema halls, movies, movie sessions and customers, who buying tickets.

# FEATURES
- customer registration;
- customer authentication;
- roles for administrator and customers (different permissions)
- created, update and remove movies;
- created, update and remove movie sessions;
- created, update and remove customers;
- display list of all movies;
- display list of all orders;
- display list of all cinema halls;
- give all info about orders by user;
- give all info about active movie sessions on requirement date.

# PROJECT STRUCTURE
- DAO - data access layer;
- Service - application logic layer;
- Controllers - presentation layer;
- Security - security level.

# TECHNOLOGIES
- Java 17
- Git
- Apache Maven
- Apache TomCat
- MySQL
- Javax Servlet
- Spring Framework
- Hibernate Framework

# INSTALLATION
(You need MySQL, TomCat v.9.0.71)

- Clone the project from GitHub;
- Open file src/main/resources/db.properties and fill form with your configuration parameters; After that hibernate build storage in your mentioned place.
- In src/main/java/cinema/config/DataInitializer.java we set test user with administrating permissions. Recommend to change it with your own.
- Set connection with DB by editing ConnectionUtil;
- Set TomCat;
- Run TomCat and enter your email and password.
