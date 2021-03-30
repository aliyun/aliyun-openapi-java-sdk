[← 超时机制](4-Timeout-CN.md) | HTTPS 配置[(English)](5-HTTPS-EN.md) | [代理配置 →](6-Proxy-CN.md)
***

## 使用 HTTPS 请求方式

```java
request.setSysProtocol(com.aliyuncs.http.ProtocolType.HTTPS);
```

## HTTPS配置

优先级: Client > Default

1. 忽略证书

必须在第一次创建 client 的时候进行设置，否则需要使用 `ApacheHttpClient.getInstance().close()` 来关闭上一个 client 才能生效。

```java
// Client HTTPS配置
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// 设置不校验服务端证书
clientConfig.setIgnoreSSLCerts(true);

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
 
```

2. 自定义配置证书校验

KeyManager 和 X509TrustManager 是两个接口需要自行实现

```java
// Client HTTPS配置
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// 设置自定义的TrustManagers
clientConfig.setX509TrustManagers(clientTrustManagers);
// 设置自定义的KeyManagers
clientConfig.setKeyManagers(clientKeyManagers);

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
 
```

***
[← 超时机制](4-Timeout-CN.md) | HTTPS 配置[(English)](5-HTTPS-EN.md) | [代理配置 →](6-Proxy-CN.md)
