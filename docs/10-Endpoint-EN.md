[← 异常](9-Exception-EN.md) | Endpoint[(中文)](10-Endpoint-CN.md) | [首页 →](../README.md)
***

## Endpoint

> Endpoint is the domain name of the service API. like `ecs.cn-hangzhou.aliyuncs.com`

### Search Endpoint

[Related source code](../aliyun-java-sdk-core/src/main/java/com/aliyuncs/endpoint/DefaultEndpointResolver.java)

1. User custom defined

`User custom defined` is the highest-priority logic to search endpoint and allows you to specify endpoint specifics directly.

```java
// Global effect
DefaultProfile.addEndpoint("<RegionID>", "<Product>", "<Endpoint>");

// Only works for the current request
DescribeRegionsRequest request = new DescribeRegionsRequest();
request.setSysEndpoint("<Endpoint>");
```

2. Endpoint Splicing Rules

`Endpoint Splicing Rules` does not take effect until the vpc network is enabled or the product SDK has an Endpoint data file.
Endpoint Data File Example : ([Ecs Endpoint Data File](../aliyun-java-sdk-ecs/src/main/java/com/aliyuncs/ecs/Endpoint.java))

```java
// Public network request(default)
request.productNetwork = "public"; // Since the default value of `productNetwork` is `public`, there is no need to configure `productNetwork` by default.

// Share-domain request
request.productNetwork = "share";

// Ipv6 network request
request.productNetwork = "ipv6";

// Proxy network request
request.productNetwork = "proxy";

// Internal network request
request.productNetwork = "inner";

// Ipv4/Ipv6 Dual Stack
request.productNetwork = "dualstack";

// Vpc network request
request.productNetwork = "vpc";
// Or access the vpc network by enabling the `enableUsingVpcEndpoint` configuration
DefaultProfile profile = DefaultProfile.getProfile("<RegionID>", "<AccessKeyId>", "<AccessKeySecret>");
profile.enableUsingVpcEndpoint();
```

3. Search endpoint from the [endpoints.json](../aliyun-java-sdk-core/src/main/resources/endpoints.json) endpoint data file in the Java SDK Core
Internal operation, no additional configuration required.

4. Request Location Service API to get `Endpoint` from the remote end.

Requires product SDK with `ServiceCode`.

***
[← 异常](9-Exception-EN.md) | Endpoint[(中文)](10-Endpoint-CN.md) | [首页 →](../README.md)
