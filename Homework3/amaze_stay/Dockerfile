FROM maven:3.8.2-jdk-11

COPY . .

RUN mvn clean package

EXPOSE 8080 443

CMD ["java", "-jar", "target/technical_prototype-0.0.1-SNAPSHOT.jar"]
