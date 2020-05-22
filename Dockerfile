FROM tomcat:9.0.20-jre8

WORKDIR .

COPY ./target/*.jar ./app-0.0.1.jar

CMD ["java", "-jar", "app-0.0.1.jar"]