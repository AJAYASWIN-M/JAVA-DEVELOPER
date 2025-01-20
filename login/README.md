# Login Page with Servlet and MySQL Integration

This project demonstrates a simple login form using HTML for the front-end, a servlet for handling requests, and MySQL for database interaction.



## Prerequisites

Before running the application, make sure you have the following:

1. **Java Development Kit (JDK)** - Installed on your machine.
2. **MySQL Database** - Installed and running.
3. **Apache Tomcat or any Java Servlet container** - To deploy the servlet.
4. **JDBC Connector (MySQL)** - Add the MySQL JDBC driver in your classpath.

## Setup Instructions

### 1. Clone this repository:
```bash
git clone https://github.com/AJAYASWIN-M/JAVA-DEVELOPER.git
```
### 2. Database Setup:
Create a database in MySQL:
```
CREATE DATABASE ajay_db;
```
Create the necessary table for storing user login details:
```
CREATE TABLE login_table (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    pass VARCHAR(255) NOT NULL
);
```
### 3. Servlet Configuration:
Ensure that your servlet is configured in web.xml or through annotations in your servlet class. The servlet /website will handle the login requests and insert user details into the database.

### 4. Compile and Deploy:
Compile the servlet files and deploy them on your servlet container (e.g., Apache Tomcat).
Start your Tomcat server.
### 5. Test the Application:
Open your browser and navigate to the login page (e.g., http://localhost:8080/login/index.html).
Enter a username and password, and click Login. The user details will be inserted into the MySQL database.
<b>
<b>
## How It Works
The login form (HTML) submits the user data (username and password) to the website servlet.
The servlet processes the form data and inserts it into the login_table of the MySQL database.
If the insertion is successful, a success message is shown; otherwise, a failure message appears.
<b>
<b>
## Acknowledgments
MySQL Database for storing user data.
Apache Tomcat for deploying the servlet.
JDBC for database interaction.
