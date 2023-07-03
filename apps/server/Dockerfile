FROM maven:3.8.3-openjdk-11-slim

WORKDIR /app
COPY . .

RUN mvn wrapper:wrapper
RUN ./mvnw clean package

CMD ["java", "-jar", "target/your-application.jar"]
