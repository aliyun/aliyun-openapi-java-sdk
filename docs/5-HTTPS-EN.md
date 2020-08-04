[← Timeout](4-Timeout-EN.md) | HTTPS Configurations[(中文)](5-HTTPS-CN.md) | [Proxy Configurations →](6-Proxy-EN.md)
***

## HTTPS Configurations
Priority: Client > Default


1.  Ignore certificate

This must be set when the project first creates the client.
Otherwise you need to close the last client with the command `ApacheHttpClient.getInstance().close()`.

```java
// Client HTTPS configurations
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// Configure not to verify the server certificates
clientConfig.setIgnoreSSLCerts(true);

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
 
```

2.  Customize the configuration of certificate validation

`KeyManager` and `X509TrustManager` are the interface. User implementation is required.

```java
// Client HTTPS configurations
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// Configure user-defined TrustManagers
clientConfig.setX509TrustManagers(clientTrustManagers);
// Configure user-defined KeyManagers
clientConfig.setKeyManagers(clientKeyManagers);

IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
 
```

***
[← Timeout](4-Timeout-EN.md) | HTTPS Configurations[(中文)](5-HTTPS-CN.md) | [Proxy Configurations →](6-Proxy-EN.md)