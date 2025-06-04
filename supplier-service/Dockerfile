# Use an official OpenJDK image as the base image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8082

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
