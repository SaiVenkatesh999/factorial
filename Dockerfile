# Use an official OpenJDK runtime as a parent image
FROM openjdk:22-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/factorial-0.0.1-SNAPSHOT.jar /app/factorial.jar

# Expose the container's port 9090
EXPOSE 9090

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/factorial.jar"]

