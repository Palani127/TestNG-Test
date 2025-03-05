# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file from target directory (from Maven build)
COPY target/myapp.jar app.jar

# Expose the application port (8080 for Spring Boot)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
