FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ENTRYPOINT ["java", "-jar", "/app.jar"]
COPY ${JAR_FILE} app.jar
