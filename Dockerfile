FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/personal-eureka-server-0.0.1-SNAPSHOT.jar service.jar
ENTRYPOINT ["java","-jar","/service.jar"]