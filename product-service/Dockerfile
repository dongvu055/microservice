FROM openjdk:8

EXPOSE 8081

ADD ./target/*app.jar product-app.jar

ENTRYPOINT ["java","-jar","product-app.jar"]