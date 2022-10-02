FROM azul/zulu-openjdk:8u332-8.62.0.19
COPY *.jar /app.jar
CMD ["--server.port=8081"]
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]