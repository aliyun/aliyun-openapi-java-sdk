[English](./README.md) | 简体中文

<p align="center">
<a href=" https://www.alibabacloud.com"><img src="https://aliyunsdk-pages.alicdn.com/icons/Aliyun.svg"></a>
</p>

<h1 align="center">Alibaba Cloud SDK for Java (V1.0)</h1>

<p align="center">
<a href="https://search.maven.org/search?q=g:%22com.aliyun%22%20AND%20a:%22aliyun-java-sdk-core%22"><img src="https://img.shields.io/maven-central/v/com.aliyun/aliyun-java-sdk-core.svg?label=Maven%20Central" alt="Latest Stable Version"/></a>
<a href="https://travis-ci.org/aliyun/aliyun-openapi-java-sdk"><img src="https://travis-ci.org/aliyun/aliyun-openapi-java-sdk.svg?branch=master"/></a>
<a href="https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk"><img src="https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/branch/master/graph/badge.svg"/></a>
<a href="https://ci.appveyor.com/project/aliyun/aliyun-openapi-java-sdk"><img src="https://ci.appveyor.com/api/projects/status/levg38kb55k0pn1v/branch/master?svg=true"/></a>
</p>

> ⚠️ **重要声明**：阿里云 V1.0 Java SDK 已进入基础安全维护阶段，不再建议使用。新用户请直接使用 [V2.0 Java SDK](https://github.com/aliyun/alibabacloud-java-sdk)；已经集成 V1.0 Java SDK 的用户也建议迁移至 [V2.0 Java SDK](https://github.com/aliyun/alibabacloud-java-sdk)。V2.0 Java SDK 使用方式请参见[帮助中心文档](https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk)以及[阿里云 OpenAPI 开发者门户](https://next.api.aliyun.com/)。

欢迎使用 Alibaba Cloud SDK for Java (V1.0)。Alibaba Cloud SDK for Java 让您不用复杂编程即可访问云服务器、云监控等多个阿里云服务。
这里向您介绍如何获取 Alibaba Cloud SDK for Java (V1.0) 并开始调用。
如果您在使用 Alibaba Cloud SDK for Java (V1.0) 的过程中遇到任何问题，欢迎在当前 GitHub [提交 Issues](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new)。

## ⚠️ 迁移声明

**阿里云 V1.0 Java SDK 已弃用，2025年3月1日后将不再接收更新。**

### 为什么要迁移到 V2.0？
- **更好的性能**：改进的架构和优化的性能
- **增强的安全性**：现代化的安全实践和凭证管理
- **持续维护**：持续的更新和错误修复
- **更丰富的功能**：新功能和改进的API设计

### 迁移资源
- **V2.0 SDK 仓库**：[https://github.com/aliyun/alibabacloud-java-sdk](https://github.com/aliyun/alibabacloud-java-sdk)
- **V2.0 文档**：[https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk](https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk)
- **V1/V2 SDK 差异对比**：[https://help.aliyun.com/zh/sdk/product-overview/differences-between-v1-and-v2-sdks](https://help.aliyun.com/zh/sdk/product-overview/differences-between-v1-and-v2-sdks)

## 环境要求
1. 要使用 Alibaba Cloud SDK for Java ，您需要一个云账号以及一对`Access Key ID`和`Access Key Secret`。 请在阿里云控制台中的[AccessKey管理页面](https://usercenter.console.aliyun.com/?spm=5176.doc52740.2.3.QKZk8w#/manage/ak)上创建和查看您的Access Key，或者联系您的系统管理员。
2. 要使用 Alibaba Cloud SDK for Java 访问某个产品的API，您需要事先在[阿里云控制台](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w)中开通这个产品。
3.  Alibaba Cloud SDK for Java 需要1.6以上的JDK。

## 安装依赖
无论您要使用哪个产品的开发工具包，都必须安装`aliyun-java-sdk-core`。比如，对云服务器SDK的调用，您需要安装`aliyun-java-sdk-core`和`aliyun-java-sdk-ecs`。
#### 通过Maven来管理项目依赖(推荐)
如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。您可以在[阿里云开发者资源](https://help.aliyun.com/learn/developer.html)中下载各云产品的Maven依赖。
以使用Ecs SDK为例，您只需在`pom.xml`中声明以下两个依赖：
```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>[4.4.9,5.0.0)</version>
</dependency>
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-ecs</artifactId>
    <version>[4.16.0,5.0.0)</version>
</dependency>
```

如果 maven 没有从中央存储库下载 jar 包，则需要将这些依赖项添加到`pom.xml`文件中，否则将报告 NoClassDefFoundError 异常
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.5</version>
</dependency>
<dependency>
    <groupId>io.opentracing</groupId>
    <artifactId>opentracing-api</artifactId>
    <version>0.33.0</version>
</dependency>
<dependency>
    <groupId>io.opentracing</groupId>
    <artifactId>opentracing-util</artifactId>
    <version>0.33.0</version>
</dependency>
```

## 使用诊断
[Troubleshoot](https://troubleshoot.api.aliyun.com/?source=github_sdk) 提供 OpenAPI 使用诊断服务，通过 `RequestID` 或 `报错信息` ，帮助开发者快速定位，为开发者提供解决方案。

## 快速使用

以下这个代码示例向您展示了调用 Alibaba Cloud SDK for Java (V1.0) 的3个主要步骤：
1. 创建DefaultAcsClient实例并初始化。
2. 创建API请求并设置参数。
3. 发起请求并处理应答或异常。

```java
package com.testprogram;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ecs.model.v20140526.*;
public class Main {
    public static void main(String[] args) {
         // 创建DefaultAcsClient实例并初始化
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // 地域ID
            "<your-access-key-id>",      // RAM账号的AccessKey ID
            "<your-access-key-secret>"); // RAM账号Access Key Secret
        IAcsClient client = new DefaultAcsClient(profile);
         // 创建API请求并设置参数
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        // 发起请求并处理应答或异常
        DescribeInstancesResponse response;
        try {
            response = client.getAcsResponse(request);
            for (DescribeInstancesResponse.Instance instance:response.getInstances()) {
                System.out.println(instance.getPublicIpAddress());
            }
        } catch (ServerException e) {
            e.printStackTrace();
         } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
```


## 文档
* [环境要求](./docs/0-Requirements-CN.md)
* [安装](./docs/1-Installation-CN.md)
* [客户端与凭证](./docs/2-Client-CN.md)
* [连接池](./docs/3-Pool-CN.md)
* [超时机制](./docs/4-Timeout-CN.md)
* [HTTPS配置](./docs/5-HTTPS-CN.md)
* [代理配置](./docs/6-Proxy-CN.md)
* [调试](./docs/7-Debug-CN.md)
* [日志](./docs/8-Log-CN.md)
* [异常](./docs/9-Exception-CN.md)
* [域名](./docs/10-Endpoint-CN.md)

## 问题
[提交 Issue](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new)，不符合指南的问题可能会立即关闭。

## 发行说明
每个版本的详细更改记录在[发行说明](./aliyun-java-sdk-core/ChangeLog.txt)中。

## 贡献
提交 Pull Request 之前请阅读[贡献指南](CONTRIBUTING.md)。

## 相关
* [阿里云服务 Regions & Endpoints](https://developer.aliyun.com/endpoints)
* [OpenAPI 开发者门户](https://next.api.aliyun.com/)
* [最新源码](https://github.com/aliyun/aliyun-openapi-java-sdk)
* [V2.0 Java SDK 仓库](https://github.com/aliyun/alibabacloud-java-sdk)
* [V2.0 Java SDK 文档](https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk)

## 许可证
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.

