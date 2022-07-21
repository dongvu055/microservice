#Build with JRE
FROM adoptopenjdk:8u292-b10-jre-openj9-0.26.0-focal as builder
#Build with JDK
#FROM openjdk:8
WORKDIR dongspring
ADD ./target/eureka-0.0.1-SNAPSHOT.jar eureka-server-app.jar
RUN java -Djarmode=layertools -jar eureka-server-app.jar extract

FROM adoptopenjdk:8u292-b10-jre-openj9-0.26.0-focal
EXPOSE 8080
WORKDIR dongapp
COPY --from=builder dongspring/dependencies/ ./
COPY --from=builder dongspring/spring-boot-loader/ ./
COPY --from=builder dongspring/snapshot-dependencies/ ./
COPY --from=builder dongspring/application/ ./

ENTRYPOINT ["java","org.springframework.boot.loader.JarLauncher"]