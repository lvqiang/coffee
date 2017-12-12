FROM java:8-jre
MAINTAINER lvqiang <tusyoshi0927@gmail.com>

ADD ./target/register-center.jar /app/

RUN echo "Asia/Shanghai" > /etc/timezone

ENTRYPOINT ["java", "-jar","/app/register-center.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
