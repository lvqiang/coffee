FROM java:8-jre
MAINTAINER lvqiang <tusyoshi0927@gmail.com>

ADD ./target/app-api-gateway.jar /app/

ENTRYPOINT ["java", "-jar","/app/app-api-gateway.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
