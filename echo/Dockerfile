FROM maven:latest AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN --mount=type=cache,target=/root/.m2 mvn -f /usr/src/app/pom.xml clean package


FROM openjdk:latest
COPY --from=build /usr/src/app/target/echo-0.0.1-SNAPSHOT.war /app/ 
CMD ["java", "-jar", "/app/echo-0.0.1-SNAPSHOT.war"]
EXPOSE 8080