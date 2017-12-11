FROM java:8-jre
MAINTAINER lvqiang <tusyoshi0927@gmail.com>

ADD ./target/order-service.jar /app/

ENTRYPOINT ["java", "-jar","/app/order-service.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
