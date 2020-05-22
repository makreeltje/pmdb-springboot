FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} pmdb-0.1.0.jar
ENTRYPOINT ["java","-jar","/pmdb-0.1.0.jar"]