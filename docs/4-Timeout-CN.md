[← 连接池](3-Pool-CN.md) | 超时机制[(English)](4-Timeout-EN.md) | [Https 配置 →](5-HTTPS-CN.md)
***

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

***
[← 连接池](3-Pool-CN.md) | 超时机制[(English)](4-Timeout-EN.md) | [Https 配置 →](5-HTTPS-CN.md)

