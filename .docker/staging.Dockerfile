FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV SCOPE="staging" PORT=$PORT
ENTRYPOINT ["java", "-jar", "/app.jar"]