FROM openjdk:11.0.3-jdk

VOLUME /tmp

COPY target/poc-elasticache-1.0.0.jar poc-elasticache.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/poc-elasticache.jar"]

