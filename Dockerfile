# Use an official Maven image with JDK
FROM maven:3.9.4-eclipse-temurin-21 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project to the container
COPY . .

# Package the application using Maven, skipping tests
RUN mvn clean package -DskipTests

# Use a smaller JDK image for running the application
FROM eclipse-temurin:21-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file from the build stage
COPY --from=build /app/target/todo-0.0.1-SNAPSHOT.jar todo.jar

# Set environment variables (optional)
ENV MONGO_URI=""

# Command to run the jar file
CMD ["java", "-jar", "todo.jar"]
