[← Requirements](0-Requirements-EN.md) | Installation[(中文)](1-Installation-CN.md) | [Client & Credentials →](2-Client-EN.md)
***

If you use Apache Maven to manage Java projects, you only need to add corresponding dependencies to the `pom.xml` files of the projects. You can download the Maven dependencies of different cloud products in [Alibaba Cloud developer resources](https://help.aliyun.com/learn/developer.html).

You must install `aliyun-java-sdk-core` library no matter which product development kit you want to use. For example, to call the ECS SDK, you need to install `aliyun-java-sdk-core` library  and `aliyun-java-sdk-ecs` library.

To use the Ecs SDK as an example, you only need to declare the following two dependencies in the `pom.xml` file:
```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>[4.3.2,5.0.0)</version>
</dependency>
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-ecs</artifactId>
    <version>[4.16.0,5.0.0)</version>
</dependency>
```

If maven is not downloading jar packages from a central repository, you need to add this dependency in the `pom.xml` file, or a NoClassDefFoundError exception will be reported
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.5</version>
</dependency>
```

***
[← Requirements](0-Requirements-EN.md) | Installation[(中文)](1-Installation-CN.md) | [Client & Credentials →](2-Client-EN.md)