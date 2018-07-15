FROM java:8
EXPOSE 8080
RUN mkdir -p /app/
ADD ./build/libs/ciexample.jar /app/ciexample.jar
ENTRYPOINT ["java", "-jar", "/app/ciexample.jar"]