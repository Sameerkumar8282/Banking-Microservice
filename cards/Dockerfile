#Start with the base image
FROM openjdk:21-jdk-slim
MAINTAINER sameerkumar
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cards-0.0.1-SNAPSHOT.jar"]
EXPOSE 9000
