FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/spring-boot-web.jar

WORKDIR /docker-maria/docker-maria

COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]

