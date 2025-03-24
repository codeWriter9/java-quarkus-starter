FROM eclipse-temurin:21-jre-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} java-quarkus-starter.0.1-SNAPSHOT-runner.jar 
ENTRYPOINT ["java","-jar","/java-quarkus-starter.0.1-SNAPSHOT-runner.jar"]
