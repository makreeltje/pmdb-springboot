FROM java:8
EXPOSE 8080
ADD target/pmdb-springboot.jar pmdb-springboot.jar
ENTRYPOINT ["java","-jar","pmdb-springboot.jar"]