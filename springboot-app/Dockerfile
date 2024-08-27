FROM openjdk:17-slim

WORKDIR /app

COPY ./build/libs/your-springboot-app.jar /app/your-springboot-app.jar

ENTRYPOINT ["java", "-jar", "/app/your-springboot-app.jar"]
