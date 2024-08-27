FROM openjdk:17-slim

WORKDIR /app

COPY ./build/libs/DailyCheck-0.0.1-SNAPSHOT.jar /app/DailyCheck-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=mock", "-jar", "/app/DailyCheck-0.0.1-SNAPSHOT.jar"]

