FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app-0.0.1.jar
ENTRYPOINT ["java","-jar","/app-0.0.1.jar"]