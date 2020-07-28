[← 异常](9-Exception-CN.md) | Endpoint[(English)](10-Endpoint-EN.md) | [首页 →](../README-CN.md)
***

## Endpoint

> Endpoint 是请求接口服务的网络域名，如 `ecs.cn-hangzhou.aliyuncs.com`

### Endpoint 寻址

[相关源码](../aliyun-java-sdk-core/src/main/java/com/aliyuncs/endpoint/DefaultEndpointResolver.java)

1. 用户自定义

`用户自定义`是优先级最高的寻址逻辑，可以直接指定 endpoint 的具体内容。

```java
// 全局生效
DefaultProfile.addEndpoint("<RegionID>", "<Product>", "<Endpoint>");

// 只对当前 Request 生效
DescribeRegionsRequest request = new DescribeRegionsRequest();
request.setSysEndpoint("<Endpoint>");
```

2. Endpoint 拼接规则

在请求 VPC 网络时或产品 SDK 具有 Endpoint 数据文件时，当前寻址逻辑才会生效。
Endpoint 数据文件示例 ([Ecs Endpoint Data File](../aliyun-java-sdk-ecs/src/main/java/com/aliyuncs/ecs/Endpoint.java))

```java
// 公网请求
request.productNetwork = "public"; // 因为 `productNetwork` 的默认值为 `public`，所以默认情况下不需要配置 `productNetwork`

// 跨域请求
request.productNetwork = "share";

// IPV6 请求
request.productNetwork = "ipv6";

// 代理请求
request.productNetwork = "proxy";

// 内部请求
request.productNetwork = "inner";

// IPV4/IPV6 双协议栈
request.productNetwork = "dualstack";

// VPC 请求
request.productNetwork = "vpc";
// 或者通过启用`enableUsingVpcEndpoint`配置来访问 vpc 网络
DefaultProfile profile = DefaultProfile.getProfile("<RegionID>", "<AccessKeyId>", "<AccessKeySecret>");
profile.enableUsingVpcEndpoint();
```

3. 根据 Java SDK Core 中的 [endpoints.json](../aliyun-java-sdk-core/src/main/resources/endpoints.json) 数据文件进行寻址

内部操作，无需额外配置。

4. 请求 Location 服务接口，从远端获取

需要产品 SDK 具备 `ServiceCode`

***
[← 异常](9-Exception-CN.md) | Endpoint[(English)](10-Endpoint-EN.md) | [首页 →](../README-CN.md)
