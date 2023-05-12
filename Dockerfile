FROM openjdk:17-oracle
COPY target/*.jar practice.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "practice.jar"]