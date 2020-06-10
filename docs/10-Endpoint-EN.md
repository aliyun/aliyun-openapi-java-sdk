[← 异常](9-Exception-EN.md) | Endpoint[(中文)](10-Endpoint-CN.md) | [首页 →](../README.md)
***

## Endpoint
The endpoint is the domain you want to access

Priority：request > profile > rules
 
```java
DefaultProfile profile = DefaultProfile.getProfile("regionId", "AccessKeyId", "AccessKeySecret");
IAcsClient client = new DefaultAcsClient(profile);
// global
DefaultProfile.addEndpoint("regionId", "product", "your endpoint");

DescribeRegionsRequest regionsRequest = new DescribeRegionsRequest();
// Only the current request is valid
regionsRequest.setSysEndpoint("your endpoint");

// Splicing rules set the network; parameter:share、 inner、 vpc、 public
regionsRequest.productNetwork = "public";
DescribeRegionsResponse regionsResponse = client.getAcsResponse(regionsRequest);

```

Splicing rules need to be supported by the product side and conform to the specification before they can be used。

***
[← 异常](9-Exception-EN.md) | Endpoint[(中文)](10-Endpoint-CN.md) | [首页 →](../README.md)
