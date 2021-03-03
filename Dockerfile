FROM gradle:6.8.3-jdk11

WORKDIR /srv/backend/

EXPOSE 8080

CMD gradle run -t