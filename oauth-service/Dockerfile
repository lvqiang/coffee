FROM java:8-jre
MAINTAINER lvqiang <tusyoshi0927@gmail.com>

ADD ./target/oauth-service.jar /app/

ENTRYPOINT ["java", "-jar","/app/oauth-service.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
