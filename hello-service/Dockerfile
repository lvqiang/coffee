FROM java:8-jre
MAINTAINER lvqiang <tusyoshi0927@gmail.com>

ADD ./target/hello-service.jar /app/

ENTRYPOINT ["java", "-jar","/app/hello-service.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
