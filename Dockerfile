FROM openjdk:latest
ADD target/hello_world.jar hello_world.jar
EXPOSE 1212
ENTRYPOINT ["java","-jar","hello_world.jar"]