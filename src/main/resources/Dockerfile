FROM  anapsix/alpine-java:latest

ADD src/main/resources/entrypoint.sh /entrypoint.sh
ADD target/app.jar /app.jar
RUN chmod 775 /app.jar && chmod 775 /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]