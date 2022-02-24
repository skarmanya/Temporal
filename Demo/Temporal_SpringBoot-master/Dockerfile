FROM adoptopenjdk:11-jre-hotspot

LABEL COMPANY="Publicis Sapient"
LABEL APPLICATION="Swiggy Clone"

COPY /target/Demo-0.0.1-SNAPSHOT.jar Demo-service.jar

EXPOSE 8001

# ENTRYPOINT ["java", "-jar", "Demo-service.jar"]
ENTRYPOINT exec java $JAVA_OPTS -jar Demo-service.jar