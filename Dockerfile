FROM openjdk:17
WORKDIR /app
COPY target/pageabledtodemo-0.0.1-SNAPSHOT.jar /app/mydemo.jar
ENTRYPOINT ["java", "-jar", "mydemo.jar"]