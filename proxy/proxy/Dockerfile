FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Proxy"

COPY /target/proxy-0.0.1-SNAPSHOT.jar proxy-service.jar

EXPOSE 9002

ENTRYPOINT ["java", "-jar", "proxy-service.jar"]