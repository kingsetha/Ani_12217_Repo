FROM openjdk:18
WORKDIR /app
COPY ./target/SeleniumJunitJest1-0.0.1-SNAPSHOT.jar /app
EXPOSE 8081
CMD ["java", "-jar", "SeleniumJunitJest1-0.0.1-SNAPSHOT.jar"]
