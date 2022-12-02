FROM adoptopenjdk/openjdk11:jdk-11.0.9_11-alpine
COPY target/personservice.jar personservice.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","personservice.jar"]
