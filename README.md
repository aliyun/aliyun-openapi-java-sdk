# Alibaba Cloud Java Software Development Kit

[![Maven Central](https://img.shields.io/maven-central/v/com.aliyun/aliyun-java-sdk-core.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.aliyun%22%20AND%20a:%22aliyun-java-sdk-core%22)
[![Build Status](https://travis-ci.org/aliyun/aliyun-openapi-java-sdk.svg?branch=master)](https://travis-ci.org/aliyun/aliyun-openapi-java-sdk)
[![Appveyor Badge](https://ci.appveyor.com/api/projects/status/bymi868y6443gwdp?svg=true)](https://ci.appveyor.com/project/aliyun/aliyun-openapi-java-sdk)
[![codecov](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/branch/master/graph/badge.svg)](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/aef3826e57ca444fb217bab8edaed195)](https://www.codacy.com/app/aliyun/aliyun-openapi-java-sdk?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=aliyun/aliyun-openapi-java-sdk&amp;utm_campaign=Badge_Grade)

[中文文档](./README_zh.md)

The Alibaba Cloud Software Development Kit Java (SDK) allows you to access Alibaba Cloud services such as Elastic Compute Service (ECS), Server Load Balancer (SLB), and CloudMonitor. You can access Alibaba Cloud services without the need to handle API related tasks, such as signing and constructing your requests.

This document introduces how to obtain and call Alibaba Cloud Java SDK.

If you have any problem while using Java SDK, please [submit an issue](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new).

## Prerequisites

-  To use Alibaba Cloud Java SDK, you must have an Alibaba Cloud account as well as an `AccessKey ID` and an `AccessKey Secret`. Create and view your AccessKey on the [RAM console](https://ram.console.aliyun.com "RAM console") or contact your system administrator.

- To use an Alibaba Cloud Java SDK to access the APIs of a product, you must first activate the product on the [Alibaba Cloud console](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w) if required.

-  Alibaba Cloud Java SDK requires JDK 1.6 or later.

## Install Java SDK

If you use Apache Maven to manage Java projects, you only need to add corresponding dependencies to the pom.xml files of the projects. You can download the Maven dependencies of different cloud products in [Alibaba Cloud SDK](https://www.alibabacloud.com/support/developer-resources?spm=a3c0i.7911826.675768.dnavresources1.32a0737buJ2Rr4).

You must install the SDK core library for any SDK you use. For example, to call the ECS SDK, you must install both the ECS SDK and the SDK core library.

For example, with SDK core library latest version and ECS SDK latest version, you need to declare the two SDKs in the pom.xml file.

```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>[4.3.2,10.0.0)</version>
</dependency>
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-ecs</artifactId>
    <version>[4.16.0,10.0.0)</version>
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
## Initiate a call

The following code example shows the three main steps to use Alibaba Cloud Java SDK:

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

## Debugging
If there is an environment variable DEBUG=sdk , all http request/response will work in debug mode.

## Configure the connection pool
Multiple SDK clients share the same connection pool, configure the pool in the initialization phase of the client
```java
// Create and initialize a DefaultAcsClient instance
DefaultProfile profile = DefaultProfile.getProfile(
"<your-region-id>",          // The region ID
"<your-access-key-id>",      // The AccessKey ID of the RAM account
"<your-access-key-secret>"); // The AccessKey Secret of the RAM account

// Multiple SDK clients share the same connection pool, set the
// parameters for this pool here such as maxRequestsPerHost, timeout, etc.
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
clientConfig.setMaxRequestsPerHost(6);
clientConfig.setMaxRequests(60);

profile.setHttpClientConfig(clientConfig);
IAcsClient client = new DefaultAcsClient(profile);
```
