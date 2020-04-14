FROM openjdk:8
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]

FROM ubuntu
RUN apt-get update && apt-get install -y git
RUN git clone https://github.com/ghusta/docker-postgres-world-db.git 

CMD docker build --pull --tag ghusta/postgres-world-db .
CMD docker container run ghusta/postgres-world-db -d