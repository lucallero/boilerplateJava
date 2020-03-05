FROM openjdk:11

RUN mkdir boilerplate 

WORKDIR /boilerplate

COPY config .
COPY build/libs/boilerplate-0.1.0-SNAPSHOT.jar .

RUN ls -l

CMD ["java", "-jar", "boilerplate-0.1.0-SNAPSHOT.jar"]