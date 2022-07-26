# build
# ---------------------------------------------------------------

FROM openjdk:11
#openjdk:11 is the docker image name and tag name
#java 11 version will be downloaded from dockerhub

# Copy the jar to the production image from the builder stage.
COPY  "target/EmployeeManagementSystem-0.0.1-SNAPSHOT.jar" /empms.jar

# ---------------------------------------------------------------

# Run the web service on container startup.
CMD java  -jar /empms.jar

# ---------------------------------------------------------------
