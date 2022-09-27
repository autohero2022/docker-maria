FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/autoheroback-0.0.1-SNAPSHOT.jar

WORKDIR /docker-maria/docker-maria

COPY ${JAR_FILE} app.jar
EXPOSE 8080

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]

