FROM java:8-jre
MAINTAINER lvqiang <tusyoshi0927@gmail.com>

ADD ./target/sleuth-zipkin-monitor.jar /app/

RUN echo "Asia/Shanghai" > /etc/timezone

ENTRYPOINT ["java", "-jar","/app/sleuth-zipkin-monitor.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]