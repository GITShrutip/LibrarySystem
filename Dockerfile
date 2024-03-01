FROM maven:3.8.1-openjdk-17-slim
COPY ..
RUN mvn clean package

FROM openjdk:17-jdk-slim-buster
COPY --from=build /target/LibraryManagementSystem-0.0.1-SNAPSHOT.jar LibraryManagementSystem.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "LibraryManagementSystem.jar"]
