FROM openjdk:17
EXPOSE 7000
ADD target/devops.jar devops.jar
ENTRYPOINT ["java","-jar","/devops.jar"]