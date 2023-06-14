FROM openjdk:17
EXPOSE 8080
ADD target/jenkins-test-application.jar jenkins-test-application.jar
ENTRYPOINT ["java","-jar","/jenkins-test-application.jar"]