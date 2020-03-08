FROM  gradle:jdk11

ARG VERSION=NO_VERSION_INFORMED_DURING_BUILD

RUN mkdir -p /app/build
WORKDIR /app/build

COPY config ./config
COPY src ./src
COPY *.gradle ./

RUN gradle test && gradle build 
RUN cp ./build/libs/boilerplate.jar .. 

WORKDIR /app

RUN rm -rf ./build

CMD ["java", "-jar", "boilerplate.jar"]