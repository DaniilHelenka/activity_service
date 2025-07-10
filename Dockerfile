FROM eclipse-temurin:21-jre

WORKDIR /app

COPY build/libs/activity_service-0.0.1-SNAPSHOT.jar app.jar

# Добавляем wait-for-it.sh
ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

EXPOSE 8083

ENTRYPOINT ["/wait-for-it.sh", "mongo:27017", "--timeout=60", "--", "/wait-for-it.sh", "kafka:9092", "--timeout=60", "--", "java", "-jar", "app.jar"]