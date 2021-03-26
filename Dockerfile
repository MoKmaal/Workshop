FROM openjdk:8-jdk-alpine
ADD target/workshop-0.0.1-SNAPSHOT.jar /workshop.jar
ENTRYPOINT ["java","-jar","/workshop.jar"]
EXPOSE 9090
