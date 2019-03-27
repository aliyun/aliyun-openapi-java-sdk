[← 环境要求](0-Requirements-CN.md) | 安装[(English)](1-Installation-EN.md) | [客户端 →](2-Client-CN.md)
***

无论您要使用哪个产品的开发工具包，都必须安装`SDK核心库`。比如，对云服务器SDK的调用，您需要安装`SDK核心库`和`云服务器`的SDK。
#### 通过Maven来管理项目依赖(推荐)
如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。您可以在[阿里云开发工具包](https://develop.aliyun.com/tools/sdk#/java)中下载各云产品的Maven依赖。
以最新版本的SDK核心库和最新版本的Ecs SDK为例，您只需在`pom.xml`中声明这两个开发工具包，如下所示：
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

如果 maven 没有从中央存储库下载 jar 包，则需要将此依赖项添加到`pom.xml`文件中，否则将报告 NoClassDefFoundError 异常
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.5</version>
</dependency>
```
***
[← 环境要求](0-Requirements-CN.md)  | 安装[(English)](1-Installation-EN.md) | [客户端 →](2-Client-CN.md)