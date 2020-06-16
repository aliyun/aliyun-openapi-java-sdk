English | [简体中文](./README-CN.md)

<p align="center">
<a href=" https://www.alibabacloud.com"><img src="https://aliyunsdk-pages.alicdn.com/icons/AlibabaCloud.svg"></a>
</p>

<h1 align="center">Alibaba Cloud SDK for Java</h1>

<p align="center">
<a href="https://search.maven.org/search?q=g:%22com.aliyun%22%20AND%20a:%22aliyun-java-sdk-core%22"><img src="https://img.shields.io/maven-central/v/com.aliyun/aliyun-java-sdk-core.svg?label=Maven%20Central" alt="Latest Stable Version"/></a>
<a href="https://travis-ci.org/aliyun/aliyun-openapi-java-sdk"><img src="https://travis-ci.org/aliyun/aliyun-openapi-java-sdk.svg?branch=master"/></a>
<a href="https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk"><img src="https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/branch/master/graph/badge.svg"/></a>
<a href="https://www.codacy.com/app/aliyun/aliyun-openapi-java-sdk?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=aliyun/aliyun-openapi-java-sdk&amp;utm_campaign=Badge_Grade"><img src="https://api.codacy.com/project/badge/Grade/aef3826e57ca444fb217bab8edaed195"/></a>
<a href="https://ci.appveyor.com/project/aliyun/aliyun-openapi-java-sdk"><img src="https://ci.appveyor.com/api/projects/status/levg38kb55k0pn1v/branch/master?svg=true"/></a>
</p>

The Alibaba Cloud SDK for Java allows you to access Alibaba Cloud services such as Elastic Compute Service (ECS), Server Load Balancer (SLB), and CloudMonitor. You can access Alibaba Cloud services without the need to handle API related tasks, such as signing and constructing your requests.

This document introduces how to obtain and call Alibaba Cloud SDK for Java.

If you have any problem while using Alibaba Cloud SDK for Java, please [submit an issue](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new).

## Requirements

- To use Alibaba Cloud SDK for Java, you must have an Alibaba Cloud account as well as an `AccessKey ID` and an `AccessKey Secret`. Create and view your AccessKey on the [RAM console](https://ram.console.aliyun.com "RAM console") or contact your system administrator.

- To use the Alibaba Cloud SDK for Java to access the APIs of a product, you must first activate the product on the [Alibaba Cloud console](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w) if required.

- The Alibaba Cloud Java SDK requires JDK 1.6 or later.

## Installation

If you use Apache Maven to manage Java projects, you only need to add corresponding dependencies to the pom.xml files of the projects. You can download the Maven dependencies of different cloud products in [Alibaba Cloud developer resources](https://help.aliyun.com/learn/developer.html).

You must install `aliyun-java-sdk-core` library no matter which product development kit you want to use. For example, to call the ECS SDK, you need to install `aliyun-java-sdk-core` library  and `aliyun-java-sdk-ecs` library .

To use the Ecs SDK as an example, you only need to declare the following two dependencies in the `pom.xml` file.

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

If maven is not downloading jar packages from a central repository, you need to add these dependencies in the pom.xml file, or a NoClassDefFoundError exception will be reported
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

## Quick Examples

The following code example shows the three main steps to use Alibaba Cloud SDK for Java :

1. Create and initialize a `DefaultAcsClient` instance.

2. Create an API request and set parameters.

3. Initiate the request and handle the response or exceptions.

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
        // Create and initialize a DefaultAcsClient instance
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // The region ID
            "<your-access-key-id>",      // The AccessKey ID of the RAM account
            "<your-access-key-secret>"); // The AccessKey Secret of the RAM account
        IAcsClient client = new DefaultAcsClient(profile);
        // Create an API request and set parameters
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        // Initiate the request and handle the response or exceptions
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


## Documentation
* [Requirements](./docs/0-Requirements-EN.md)
* [Installation](./docs/1-Installation-EN.md)
* [Client & Credentials](./docs/2-Client-EN.md)
* [Connection Pool](./docs/3-Pool-EN.md)
* [Timeout](./docs/4-Timeout-EN.md)
* [HTTPS Configurations](./docs/5-HTTPS-EN.md)
* [Proxy Configurations](./docs/6-Proxy-EN.md)
* [Debug](./docs/7-Debug-EN.md)
* [Log](./docs/8-Log-EN.md)
* [Exception](./docs/9-Exception-EN.md)
* [Endpoint](./docs/10-Endpoint-EN.md)


## Issues
[Opening an Issue](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new), Issues not conforming to the guidelines may be closed immediately.

## Changelog
Detailed changes for each release are documented in the [release notes](./aliyun-java-sdk-core/ChangeLog.txt).

## Contribution
Please make sure to read the [Contributing Guide](CONTRIBUTING.md) before making a pull request.

## References
* [Alibaba Cloud Regions & Endpoints](https://developer.aliyun.com/endpoints)
* [OpenAPI Explorer](https://api.aliyun.com/)
* [Latest Release](https://github.com/aliyun/aliyun-openapi-java-sdk)

## License
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
