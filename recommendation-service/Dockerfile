FROM openjdk:8

EXPOSE 8081

ADD ./target/*app.jar recommendation-app.jar

ENTRYPOINT ["java","-jar","recommendation-app.jar"]