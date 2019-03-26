[← Timeout](4-Timeout-EN.md) | HTTPS Configurations[(中文)](5-HTTPS-CN.md) | [Proxy Configurations →](6-Proxy-EN.md)
***

## HTTPS Configurations
Priority: Request > Client > Default

Support below configurations:

1.  Whether to verify the server certificates

2.  Configure X509TrustManagers(trusted server certificates)

3.  Configure KeyManagers(client certificates)

```java
// Client HTTPS configurations
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// Configure not to verify the server certificates
clientConfig.setIgnoreSSLCerts(true);
// Configure user-defined TrustManagers
clientConfig.setX509TrustManagers(clientTrustManagers);
// Configure user-defined KeyManagers
clientConfig.setKeyManagers(clientKeyManagers);

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
 
// Request HTTPS configurations(ApacheHttpClient will ignore the HTTPS configurations at the Request level)
request.setIgnoreSSLCerts(true);
request.setX509TrustManagers(requestTrustManagers);
request.setKeyManagers(requestKeyManagers);

client.getAcsResponse(request)
```

***
[← Timeout](4-Timeout-EN.md) | HTTPS Configurations[(中文)](5-HTTPS-CN.md) | [Proxy Configurations →](6-Proxy-EN.md)