# ECS-Api-Test
A simple Java web server application built by SSM (Spring + SpringMVC + Mybatis).

This is used for AliCbabacloud ECS and RDS starter.

How to deploy:
1. Run:
```shell
mvn clean package
```
And get `ECS-Api-Test.war` in `target`.

2. Send `ECS-Api-Test.war` to `.../tomcat/webapps` on your ECS (Java Web environment is required).

   
3. Goto `http://http://<ip>:<port>/ECS-api-test` in the browser, and there should be a "Hello word" on the page.



