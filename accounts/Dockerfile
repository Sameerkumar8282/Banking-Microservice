#Start with the base image
FROM openjdk:21-jdk-slim
MAINTAINER sameerkumar
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/accounts-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
