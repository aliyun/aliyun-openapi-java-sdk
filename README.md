English | [简体中文](./README-CN.md)

<p align="center">
<a href=" https://www.alibabacloud.com"><img src="https://aliyunsdk-pages.alicdn.com/icons/AlibabaCloud.svg" alt="alibaba cloud logo"></a>
</p>

<h1 align="center">Alibaba Cloud SDK for Java</h1>

[![Maven Central Version](https://img.shields.io/maven-central/v/com.aliyun/aliyun-java-sdk-core)](https://search.maven.org/search?q=g:%22com.aliyun%22%20AND%20a:%22aliyun-java-sdk-core%22)
[![Java CI with Maven](https://github.com/aliyun/aliyun-openapi-java-sdk/actions/workflows/maven.yml/badge.svg)](https://github.com/aliyun/aliyun-openapi-java-sdk/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/graph/badge.svg?token=4LHp6BfqKF)](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk)

The Alibaba Cloud SDK for Java allows you to access Alibaba Cloud services such as Elastic Compute Service (ECS), Server Load Balancer (SLB), and CloudMonitor. You can access Alibaba Cloud services without the need to handle API related tasks, such as signing and constructing your requests.

This document introduces how to obtain and call Alibaba Cloud SDK for Java.

If you have any problem while using Alibaba Cloud SDK for Java, please [submit an issue](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new).

## Requirements

- To use Alibaba Cloud SDK for Java, you must have an Alibaba Cloud account as well as an `AccessKey ID` and an `AccessKey Secret`. Create and view your AccessKey on the [RAM console](https://ram.console.aliyun.com "RAM console") or contact your system administrator.
- To use the Alibaba Cloud SDK for Java to access the APIs of a product, you must first activate the product on the [Alibaba Cloud console](https://home.console.aliyun.com) if required.
- The Alibaba Cloud Java SDK requires JDK 1.8 or later.

## Installation

If you use Apache Maven to manage Java projects, you only need to add corresponding dependencies to the pom.xml files of the projects. You can view the Maven dependencies of different cloud products in [Alibaba Cloud SDK Center](https://api.aliyun.com/api-tools/sdklang?language=java&sdkStyle=old).

You must install `aliyun-java-sdk-core` library no matter which product development kit you want to use. For example, to call the ECS SDK, you need to install `aliyun-java-sdk-core` library  and `aliyun-java-sdk-ecs` library .

To use the Ecs SDK as an example, you only need to declare the following two dependencies in the `pom.xml` file.

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

If maven is not downloading jar packages from a central repository, you need to add these dependencies in the pom.xml file, or a NoClassDefFoundError exception will be reported

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

## Troubleshoot

[Troubleshoot](https://troubleshoot.api.aliyun.com/?source=github_sdk) Provide OpenAPI diagnosis service to help developers quickly locate and troubleshoot errors by using `RequestID` or `error message`, and provide solutions.

## Quick Examples

The following code example shows how to use Alibaba Cloud SDK for Java :

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
        // 1. Create and initialize a DefaultAcsClient instance
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // The region ID
            "<your-access-key-id>",      // The AccessKey ID of the RAM account
            "<your-access-key-secret>"); // The AccessKey Secret of the RAM account
        IAcsClient client = new DefaultAcsClient(profile);

        // 2. Create an API request and set parameters
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);

        // 3. Initiate the request and handle the response or exceptions
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

> For security reason, we don't recommend to hard code credentials information in source code. You should access
> credentials from external configurations or environment variables.

## Documentation

- [Requirements](./docs/0-Requirements-EN.md)
- [Installation](./docs/1-Installation-EN.md)
- [Client & Credentials](./docs/2-Client-EN.md)
- [Connection Pool](./docs/3-Pool-EN.md)
- [Timeout](./docs/4-Timeout-EN.md)
- [HTTPS Configurations](./docs/5-HTTPS-EN.md)
- [Proxy Configurations](./docs/6-Proxy-EN.md)
- [Debug](./docs/7-Debug-EN.md)
- [Log](./docs/8-Log-EN.md)
- [Exception](./docs/9-Exception-EN.md)
- [Endpoint](./docs/10-Endpoint-EN.md)

## Issues

[Opening an Issue](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new), Issues not conforming to the guidelines may be closed immediately.

## Changelog

Detailed changes for each release are documented in the [release notes](./aliyun-java-sdk-core/ChangeLog.txt).

## Contribution

Please make sure to read the [Contributing Guide](CONTRIBUTING.md) before making a pull request.

## References

- [Alibaba Cloud Regions & Endpoints](https://developer.aliyun.com/endpoints)
- [Alibab Cloud OpenAPI Portal](https://api.aliyun.com/)
- [Latest Release](https://github.com/aliyun/aliyun-openapi-java-sdk)

## License

[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
