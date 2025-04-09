[English](./README.md) | 简体中文

<p align="center">
<a href=" https://www.alibabacloud.com"><img src="https://aliyunsdk-pages.alicdn.com/icons/Aliyun.svg" alt="alibaba cloud logo"></a>
</p>

<h1 align="center">Alibaba Cloud SDK for Java</h1>

[![Maven Central Version](https://img.shields.io/maven-central/v/com.aliyun/aliyun-java-sdk-core)](https://search.maven.org/search?q=g:%22com.aliyun%22%20AND%20a:%22aliyun-java-sdk-core%22)
[![Java CI with Maven](https://github.com/aliyun/aliyun-openapi-java-sdk/actions/workflows/maven.yml/badge.svg)](https://github.com/aliyun/aliyun-openapi-java-sdk/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/graph/badge.svg?token=4LHp6BfqKF)](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk)

阿里云 V1.0 SDK 即将进入基础安全维护阶段，不再建议使用，建议使用 V2.0 SDK。

如果您在使用 Alibaba Cloud SDK for Java 的过程中遇到任何问题，欢迎在当前 GitHub [提交 Issues](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new)。

## 环境要求

1. 要使用 Alibaba Cloud SDK for Java ，您需要一个云账号以及一对`Access Key ID`和`Access Key Secret`。 请在阿里云控制台中的[RAM管理页面](https://ram.console.aliyun.com)上创建和查看您的Access Key，或者联系您的系统管理员。
2. 要使用 Alibaba Cloud SDK for Java 访问某个产品的API，您需要事先在[阿里云控制台](https://home.console.aliyun.com)中开通这个产品。
3. Alibaba Cloud SDK for Java 需要 1.8 以上的 JDK。

## 安装依赖

无论您要使用哪个产品的开发工具包，都必须安装`aliyun-java-sdk-core`。比如，对云服务器SDK的调用，您需要安装`aliyun-java-sdk-core`和`aliyun-java-sdk-ecs`。

### 通过Maven来管理项目依赖(推荐)

如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。您可以在[阿里云SDK中心](https://api.aliyun.com/api-tools/sdklang?language=java&sdkStyle=old)中查看各云产品的Maven依赖。
以使用Ecs SDK为例，您只需在`pom.xml`中声明以下两个依赖：

```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>[4.6.3,5.0.0)</version>
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
    <version>2.10.1</version>
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

以下这个代码示例向您展示了如何调用 Alibaba Cloud SDK for Java：

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
        // 1. 创建DefaultAcsClient实例并初始化。
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // 地域ID
            "<your-access-key-id>",      // RAM账号的AccessKey ID
            "<your-access-key-secret>"); // RAM账号Access Key Secret
        IAcsClient client = new DefaultAcsClient(profile);

        // 2. 创建API请求并设置参数
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);

        // 3. 发起请求并处理应答或异常
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

> 因为安全的原因，我们不推荐在源代码中硬编码凭证信息。你应该通过外部配置或者环境变量的方式来访问凭证信息。

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
* [OpenAPI 开发者门户](https://api.aliyun.com/)
* [最新源码](https://github.com/aliyun/aliyun-openapi-java-sdk)

## 许可证

[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
