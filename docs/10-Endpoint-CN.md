[← 异常](9-Exception-CN.md) | Endpoint[(English)](10-Endpoint-EN.md) | [首页 →](../README-CN.md)
***

## Endpoint
Endpoint 是请求访问的域名

优先级：request > profile > rules
 
```java
DefaultProfile profile = DefaultProfile.getProfile("regionId", "AccessKeyId", "AccessKeySecret");
IAcsClient client = new DefaultAcsClient(profile);
// 全局生效
DefaultProfile.addEndpoint("regionId", "product", "your endpoint");

DescribeRegionsRequest regionsRequest = new DescribeRegionsRequest();
// 只对当前request生效
regionsRequest.setSysEndpoint("your endpoint");

// 拼接规则设置网络,参数：share、 inner、 vpc、 public
regionsRequest.productNetwork = "public";
DescribeRegionsResponse regionsResponse = client.getAcsResponse(regionsRequest);

```

拼接规则方式需要产品端支持并符合规范方可使用。

***
[← 异常](9-Exception-CN.md) | Endpoint[(English)](10-Endpoint-EN.md) | [首页 →](../README-CN.md)
