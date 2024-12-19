FROM maven:3.8-openjdk-17 AS build
WORKDIR /carrive-entity
COPY pom.xml . 
COPY src ./src 
RUN mvn clean install -DskipTests

FROM alpine:latest AS artifact
WORKDIR /carrive-entity
COPY --from=build /carrive-entity/target/*.jar ./carrive-0.0.1-SNAPSHOT.jar
CMD ["echo", "Le JAR carrive-entity.jar est prêt."]