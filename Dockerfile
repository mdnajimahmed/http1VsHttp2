FROM amazoncorretto:21
RUN yum update -y && yum install -y net-tools procps-ng
WORKDIR /app
COPY build/libs/demo-0.0.1-SNAPSHOT.jar api.jar
ENTRYPOINT ["java", "-jar", "/app/api.jar"]
