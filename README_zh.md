# 阿里云开发者Java工具套件

[![Build Status](https://travis-ci.org/aliyun/aliyun-openapi-java-sdk.svg?branch=master)](https://travis-ci.org/aliyun/aliyun-openapi-java-sdk)
[![codecov](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/branch/master/graph/badge.svg)](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk)

欢迎使用阿里云开发者工具套件（SDK）。阿里云Java SDK让您不用复杂编程即可访问云服务器、云监控等多个阿里云服务。这里向您介绍如何获取阿里云Java SDK并开始调用。
如果您在使用 SDK 的过程中遇到任何问题，欢迎前往[阿里云SDK问答社区](https://yq.aliyun.com/tags/type_ask-tagid_23350)提问，提问前请阅读[提问引导](https://help.aliyun.com/document_detail/93957.html)。亦可在当前 GitHub [提交 Issues](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new)。

## 环境准备
1. 要使用阿里云Java SDK，您需要一个云账号以及一对`Access Key ID`和`Access Key Secret`。 请在阿里云控制台中的[AccessKey管理页面](https://usercenter.console.aliyun.com/?spm=5176.doc52740.2.3.QKZk8w#/manage/ak)上创建和查看您的Access Key，或者联系您的系统管理员
2. 要使用阿里云SDK访问某个产品的API，您需要事先在[阿里云控制台](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w)中开通这个产品。
3. 阿里云Java SDK需要1.6以上的JDK

## SDK获取和安装
无论您要使用哪个产品的开发工具包，都必须安装`SDK核心库`。比如，对云服务器SDK的调用，您需要安装`SDK核心库`和`云服务器`的SDK。
#### 通过Maven来管理项目依赖(推荐)
如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。您可以在[阿里云开发工具包](https://develop.aliyun.com/tools/sdk#/java)中下载各云产品的Maven依赖。
以`3.5.0`版本的SDK核心库和`3.0.0`版本的Ecs SDK为例，您只需在`pom.xml`中声明这两个开发工具包，如下所示：
```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>3.5.0</version>
</dependency>
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-ecs</artifactId>
    <version>3.0.0</version>
</dependency>
```
## 开始调用
以下这个代码示例向您展示了调用阿里云Java SDK的3个主要步骤：
1. 创建DefaultAcsClient实例并初始化
2. 创建API请求并设置参数
3. 发起请求并处理应答或异常


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


