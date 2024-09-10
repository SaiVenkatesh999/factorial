# Use an official OpenJDK runtime as a parent image
FROM openjdk:22-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/factorial-0.0.1-SNAPSHOT.jar /app/factorial.jar

<<<<<<< HEAD
# Expose the container's port 9090
=======
# Expose the container's port 8080
>>>>>>> acb5234 (updated)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/factorial.jar"]

