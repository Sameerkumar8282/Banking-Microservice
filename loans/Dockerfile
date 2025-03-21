#Start with the base image
FROM openjdk:21-jdk-slim
MAINTAINER sameerkumar
COPY target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/loans-0.0.1-SNAPSHOT.jar"]
EXPOSE 8090
