FROM openjdk:8

EXPOSE 8083

ADD ./target/*app.jar review-app.jar

ENTRYPOINT ["java","-jar","review-app.jar"]