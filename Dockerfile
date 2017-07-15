FROM java:openjdk-8-jdk-alpine

#meu comentario
ADD build/libs/*.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

ENTRYPOINT java -jar app.jar
