FROM openjdk:8

EXPOSE 8081

ADD ./target/*app.jar product-composite-app.jar

ENTRYPOINT ["java","-jar","product-composite-app.jar"]