# all-kinds-of-demo
将各种工具封装起来，有什么需要都可以说！！！
准备封装一个权限管理模块
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <artifactId>web-test</artifactId>
    <version>1.0-SNAPSHOT</version>

    <parent>
        <groupId>org.example</groupId>
        <version>1.0</version>
        <artifactId>all-kinds-of-demo</artifactId>
        <relativePath>../all-kinds-of-demo/pom.xml</relativePath>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.example</groupId>
            <artifactId>app-service</artifactId>
            <version>1.0</version>
        </dependency>
        <dependency>
            <groupId>org.example</groupId>
            <artifactId>web</artifactId>
            <version>1.0</version>
        </dependency>
    </dependencies>
</project>
```
配置，然后直接使用
application.properties
```
active.record.jdbcUrl=jdbc:mysql://localhost/zhou?characterEncoding=utf8&useSSL=false&zeroDateTimeBehavior=convertToNull&serverTimezone=UTC
active.record.user=root
active.record.password=123456
```
### file模块：package work.koreyoshi.project.file;
提供文件保存和获取操作
