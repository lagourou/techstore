FROM openjdk:26-jdk

WORKDIR /app

COPY target/*.jar /app/techstore.jar


ENTRYPOINT ["java", "-jar", "/app/techstore.jar"]