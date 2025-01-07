# Use an official Maven image with JDK
FROM maven:3.9.4-eclipse-temurin-21

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project to the container
COPY . .

# Package the application using Maven
RUN mvn clean package

# Command to run the jar file
CMD ["java", "-jar", "target/TODO-App-Backend-0.0.1-SNAPSHOT.jar"]
