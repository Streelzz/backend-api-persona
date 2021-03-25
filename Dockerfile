FROM openjdk:14
COPY ./target/api-persona-0.0.1-SNAPSHOT.jar /tmp/api-persona.jar
WORKDIR /tmp
CMD ["java" , "-jar","api-persona.jar"]