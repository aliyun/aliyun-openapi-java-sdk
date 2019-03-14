# 阿里云开发者Java工具套件

[![Maven Central](https://img.shields.io/maven-central/v/com.aliyun/aliyun-java-sdk-core.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.aliyun%22%20AND%20a:%22aliyun-java-sdk-core%22)
[![Build Status](https://travis-ci.org/aliyun/aliyun-openapi-java-sdk.svg?branch=master)](https://travis-ci.org/aliyun/aliyun-openapi-java-sdk)
[![codecov](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/branch/master/graph/badge.svg)](https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/aef3826e57ca444fb217bab8edaed195)](https://www.codacy.com/app/aliyun/aliyun-openapi-java-sdk?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=aliyun/aliyun-openapi-java-sdk&amp;utm_campaign=Badge_Grade)
[![Appveyor Badge](https://ci.appveyor.com/api/projects/status/bymi868y6443gwdp?svg=true)](https://ci.appveyor.com/project/aliyun/aliyun-openapi-java-sdk)

[English document](./README.md)

欢迎使用阿里云开发者工具套件（SDK）。阿里云Java SDK让您不用复杂编程即可访问云服务器、云监控等多个阿里云服务。这里向您介绍如何获取阿里云Java SDK并开始调用。
如果您在使用 SDK 的过程中遇到任何问题，欢迎前往[阿里云SDK问答社区](https://yq.aliyun.com/tags/type_ask-tagid_23350)提问，提问前请阅读[提问引导](https://help.aliyun.com/document_detail/93957.html)。亦可在当前 GitHub [提交 Issues](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new)。

## 环境准备
1. 要使用阿里云Java SDK，您需要一个云账号以及一对`Access Key ID`和`Access Key Secret`。 请在阿里云控制台中的[AccessKey管理页面](https://usercenter.console.aliyun.com/?spm=5176.doc52740.2.3.QKZk8w#/manage/ak)上创建和查看您的Access Key，或者联系您的系统管理员。
2. 要使用阿里云SDK访问某个产品的API，您需要事先在[阿里云控制台](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w)中开通这个产品。
3. 阿里云Java SDK需要1.6以上的JDK。

## SDK获取和安装
无论您要使用哪个产品的开发工具包，都必须安装`SDK核心库`。比如，对云服务器SDK的调用，您需要安装`SDK核心库`和`云服务器`的SDK。
#### 通过Maven来管理项目依赖(推荐)
如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。您可以在[阿里云开发工具包](https://develop.aliyun.com/tools/sdk#/java)中下载各云产品的Maven依赖。
以最新版本的SDK核心库和最新版本的Ecs SDK为例，您只需在`pom.xml`中声明这两个开发工具包，如下所示：
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

如果 maven 没有从中央存储库下载 jar 包，则需要将此依赖项添加到`pom.xml`文件中，否则将报告 NoClassDefFoundError 异常
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.5</version>
</dependency>
```
## 开始调用

以下这个代码示例向您展示了调用阿里云Java SDK的3个主要步骤：
1. 创建DefaultAcsClient实例并初始化。
2. 创建API请求并设置参数。
3. 发起请求并处理应答或异常。

### 使用 AccessKey 调用
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
### 使用默认凭证提供链

默认凭证提供程序链查找可用的凭证，寻找顺序如下：

1.系统属性

在系统属性里寻找环境凭证，如果定义了 `alibabacloud.accessKeyId` 和 `alibabacloud.accessKeyIdSecret` 系统属性且不为空，程序将使用它们创建默认凭证。

2.环境凭证

在环境变量里寻找环境凭证，如果定义了 `ALIBABA_CLOUD_ACCESS_KEY_ID` 和 `ALIBABA_CLOUD_ACCESS_KEY_SECRET` 环境变量且不为空，程序将使用它们创建默认凭证。

3.配置文件

如果用户主目录存在默认文件 `~/.alibabacloud/credentials （Windows 为 C:\Users\USER_NAME\.alibabacloud\credentials）`，程序会自动创建指定类型和名称的凭证。默认文件可以不存在，但解析错误会抛出异常。配置名小写。不同的项目、工具之间可以共用这个配置文件，因为不在项目之内，也不会被意外提交到版本控制。
可以通过定义 `ALIBABA_CLOUD_CREDENTIALS_FILE` 环境变量修改默认文件的路径。通过 `AuthUtils.setClientType("default")` 来使用配置。 

```ini
[default]                          # 默认配置
enable = true                      # 启用，没有该选项默认不启用
type = access_key                  # 认证方式为 access_key
access_key_id = foo                # Key
access_key_secret = bar            # Secret

[client1]                          # 命名为 `client1` 的配置
type = ecs_ram_role                # 认证方式为 ecs_ram_role
role_name = EcsRamRoleTest         # Role Name

[client2]                          # 命名为 `client2` 的配置
enable = false                     # 不启用
type = ram_role_arn                # 认证方式为 ram_role_arn
region_id = cn-test                # 必填，获取session用的region
access_key_id = foo
access_key_secret = bar
role_arn = role_arn
role_session_name = session_name

[client3]                          # 命名为 `client4` 的配置
type = rsa_key_pair                # 认证方式为 rsa_key_pair
public_key_id = publicKeyId        # Public Key ID
private_key_file = /your/pk.pem    # Private Key 文件
```
4.实例 RAM 角色

如果定义了环境变量 `ALIBABA_CLOUD_ECS_METADATA` 且不为空，程序会将该环境变量的值作为角色名称，请求 <http://100.100.100.200/latest/meta-data/ram/security-credentials/> 获取临时安全凭证。

```java
package com.testprogram;
 import com.aliyuncs.DefaultAcsClient;
 import com.aliyuncs.IAcsClient;
 import com.aliyuncs.exceptions.ClientException;
 import com.aliyuncs.exceptions.ServerException;
 import com.aliyuncs.ecs.model.v20140526.*;
 public class Main {
     public static void main(String[] args) {
         IAcsClient client = new DefaultAcsClient("your-region-id");
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
### 使用 Bearertoken 调用
只有 CCC 这个产品支持此方式

```java
 package com.testprogram;
 import com.aliyuncs.profile.DefaultProfile;
 import com.aliyuncs.DefaultAcsClient;
 import com.aliyuncs.IAcsClient;
 import com.aliyuncs.exceptions.ClientException;
 import com.aliyuncs.exceptions.ServerException;
 import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersRequest;
 import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse;
 public class Main {
     public static void main(String[] args) {
         // 创建DefaultAcsClient实例并初始化
         DefaultProfile profile = DefaultProfile.getProfile(
             "<your-region-id>"         // 地域ID
         ); 
         BearerTokenCredentials bearerTokenCredential = new BearerTokenCredentials("<your-bearer-token>");
         DefaultAcsClient client = new DefaultAcsClient(profile, bearerTokenCredential);
         // 创建API请求并设置参数
         ListPhoneNumbersRequest request = new ListPhoneNumbersRequest();
         request.getInstanceId("yourId");
         request.setOutboundOnly(true);
         // 发起请求并处理应答或异常
         ListPhoneNumbersResponse response; 
         try {
             response = client.getAcsResponse(request);
             // 自己的逻辑
         } catch (ServerException e) {
             e.printStackTrace();
         } catch (ClientException e) {
             e.printStackTrace();
         }
     }
 }
```

## 调试
如果存在环境变量 `DEBUG=sdk` ，所有的http请求和响应都将启用调试输出。

## 配置连接池
默认多个SDK client共享一个连接池，可以在初始化client阶段设置连接池参数
```java
// 创建DefaultAcsClient实例并初始化
DefaultProfile profile = DefaultProfile.getProfile(
"<your-region-id>",          // 地域ID
"<your-access-key-id>",      // RAM账号的AccessKey ID
"<your-access-key-secret>"); // RAM账号Access Key Secret

// 多个SDK client共享一个连接池，此处设置该连接池的参数，
// 比如每个host的最大连接数，超时时间等
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
clientConfig.setMaxRequestsPerHost(6);
clientConfig.setConnectionTimeoutMillis(10000L);

profile.setHttpClientConfig(clientConfig);
IAcsClient client = new DefaultAcsClient(profile);
```

## 超时机制
Request 设置 -> Client 设置 -> 默认，优先级依次降低；
默认连接超时为5秒，读超时为10秒；
```java
//Client超时设置，对当前所有request有效
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
clientConfig.setReadTimeoutMillis(readTimeoutMillis);
clientConfig.setConnectionTimeoutMillis(connectionTimeoutMillis);
IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);

// request超时设置，仅对当前请求有效
request.setSysReadTimeout(readTimeoutMillis);
request.setConnectionTimeoutMillis(connectionTimeoutMillis);
```