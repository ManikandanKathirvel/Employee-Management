
FROM eclipse-temurin:17
COPY target/EmployeeManagementProject.jar EmployeeManagementProject.jar
CMD [ "java","-jar","EmployeeManagementProject.jar" ]