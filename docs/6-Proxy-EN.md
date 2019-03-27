[← HTTPS Configurations](5-HTTPS-EN.md) | Proxy Configurations[(中文)](6-Proxy-CN.md) | [Debug →](7-Debug-EN.md)
***

## Proxy Configurations
Priority: Client > Environment variable

Support below environment variable:
1.  HTTP_PROXY or http_proxy
2.  HTTPS_PROXY
3.  NO_PROXY

```java
// Client proxy configurations
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// Configure HTTP proxy
clientConfig.setHttpProxy("http://127.0.0.1:9898");
// Configure HTTPS proxy
clientConfig.setHttpsProxy("http://user:password@127.0.0.1:8989");
// Configure host addresses bypass the proxy
clientConfig.setNoProxy("127.0.0.1,localhost");

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
```

***
[← HTTPS Configurations](5-HTTPS-EN.md) | Proxy Configurations[(中文)](6-Proxy-CN.md) | [Debug →](7-Debug-EN.md)
