FROM openjdk:8-jdk-alpine
MAINTAINER brijendra
COPY build/libs/productCatelog-0.0.1-SNAPSHOT.jar docker-productCatelog-app-1.0.0.jar
ENTRYPOINT ["java","-jar","/docker-productCatelog-app-1.0.0.jar"]