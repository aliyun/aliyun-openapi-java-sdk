[← Requirements](0-Requirements-EN.md) | Installation[(中文)](1-Installation-CN.md) | [Client →](2-Client-EN.md)
***

If you use Apache Maven to manage Java projects, you only need to add corresponding dependencies to the pom.xml files of the projects. You can download the Maven dependencies of different cloud products in [Alibaba Cloud SDK](https://www.alibabacloud.com/support/developer-resources?spm=a3c0i.7911826.675768.dnavresources1.32a0737buJ2Rr4).

You must install the Alibaba Cloud SDK for Java core library for any SDK you use. For example, to call the ECS SDK, you must install both the ECS SDK and the Alibaba Cloud SDK for Java core library.

For example, with SDK core library latest version and ECS SDK latest version, you need to declare the two SDKs in the pom.xml file.

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

If maven is not downloading jar packages from a central repository, you need to add this dependency in the pom.xml file, or a NoClassDefFoundError exception will be reported
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.5</version>
</dependency>
```

***
[← Requirements](0-Requirements-EN.md) | Installation[(中文)](1-Installation-CN.md) | [Client →](2-Client-EN.md)