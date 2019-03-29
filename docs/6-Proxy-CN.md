[←  HTTPS 配置](5-HTTPS-CN.md) | 代理配置[(English)](6-Proxy-EN.md) | [调试 →](7-Debug-CN.md)
***

## 代理配置
优先级: Client > 环境变量

支持以下环境变量:
1.  HTTP_PROXY或者http_proxy
2.  HTTPS_PROXY
3.  NO_PROXY

```java
// Client 代理配置
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// 设置HTTP代理
clientConfig.setHttpProxy("http://127.0.0.1:9898");
// 设置HTTPS代理
clientConfig.setHttpsProxy("http://user:password@127.0.0.1:8989");
// 设置忽略代理地址列表
clientConfig.setNoProxy("127.0.0.1,localhost");

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
```

***
[← Https 配置](5-HTTPS-CN.md)  | 代理配置[(English)](6-Proxy-EN.md) | [调试 →](7-Debug-CN.md)