# spring-boot-projection-in-jpa

Experiment with Projection in Spring Data JPA

1. Simple Student CRUD
2. Two Report API [_Projection used in Dao/JpaRepository layer_]
3. Department Report API: _GET localhost:8090/projection-in-jpa-1.0/api/v1/student/department-report/Female_
4. Enrollment Report API: _GET localhost:8090/projection-in-jpa-1.0/api/v1/student/enrollment-report/2022-07-18_
5. Postman collection kept in the project directory (_documents/Spring Boot projection.postman_collection.json_)
6. Tools: JDK 17, Gradle 7.4.2, Spring Boot 2.7.1, DBMS MySQL

**Instructions**:
1. clone this project
2. open in your IDE
3. create studentinfo scheme by executing _documents/v1_studentinfo_scheme_create.sql_
4. set _spring.datasource.password=_ to your MySQL root user password.
5. run the project