# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
# COPY target/myapplication-test-0.0.1-SNAPSHOT.jar /app
COPY target/myfirstdemo-0.0.1-SNAPSHOT.jar /app
# Specify the command to run on container startup
#CMD ["java", "-jar", "myapplication-test-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
CMD ["java", "-jar","myfirstdemo-0.0.1-SNAPSHOT.jar"]
