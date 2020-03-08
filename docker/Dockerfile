FROM  gradle:jdk11

ARG SOURCE_BRANCH=NO_BRANCH_INFORMED_DURING_BUILD
ARG SOURCE_COMMIT=NO_COMMIT

RUN mkdir -p /app/build
WORKDIR /app/build

COPY config ./config
COPY src ./src
COPY *.gradle ./

RUN gradle test && gradle build 
RUN cp ./build/libs/boilerplate.jar .. 

WORKDIR /app
RUN rm -rf ./build
RUN echo "${SOURCE_BRANCH}-${SOURCE_COMMIT}" | tee build.version

CMD ["java", "-jar", "boilerplate.jar"]