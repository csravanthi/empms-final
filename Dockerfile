FROM openjdk:11


# Copy the jar to the production image from the builder stage.
COPY  "target/EmployeeManagementSystem-0.0.1-SNAPSHOT.jar" /empms.jar


# Run the web service on container startup.
CMD java  -jar /empms.jar
