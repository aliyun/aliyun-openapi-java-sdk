[← 超时机制](4-Timeout-CN.md) | HTTPS 配置[(English)](5-HTTPS-EN.md) | [代理配置 →](6-Proxy-CN.md)
***

## HTTPS配置
优先级: Request > Client > Default

支持以下配置项:
1.  是否校验服务端证书 
2.  设置X509TrustManagers(信任的服务端证书)
3.  设置 KeyManagers(客户端证书)

```java
// Client HTTPS配置
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// 设置不校验服务端证书
clientConfig.setIgnoreSSLCerts(true);
// 设置自定义的TrustManagers
clientConfig.setX509TrustManagers(clientTrustManagers);
// 设置自定义的KeyManagers
clientConfig.setKeyManagers(clientKeyManagers);

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
 
// Request HTTPS配置(ApacheHttpClient会忽略Request级别的HTTPS配置)
request.setIgnoreSSLCerts(true);
request.setX509TrustManagers(requestTrustManagers);
request.setKeyManagers(requestKeyManagers);

client.getAcsResponse(request)
```

***
[← 超时机制](4-Timeout-CN.md) | HTTPS 配置[(English)](5-HTTPS-EN.md) | [代理配置 →](6-Proxy-CN.md)