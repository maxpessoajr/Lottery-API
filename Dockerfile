FROM java:openjdk-8-jdk-alpine

ADD build/libs/*.jar /app/app.jar

WORKDIR /app

ENTRYPOINT java -jar /app/app.jar


