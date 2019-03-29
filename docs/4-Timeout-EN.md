[← Connection Pool](3-Pool-EN.md) | Timeout[(中文)](4-Timeout-CN.md) | [HTTPS Configurations →](5-HTTPS-EN.md)
***

## Timeout
Request Settings -> Client Settings -> Default Settings, priority from high to low;
The default ConnectTimeout is 5 seconds and the ReadTimeout is 10 seconds.

```java
//The client setting is valid for all requests
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
clientConfig.setReadTimeoutMillis(readTimeoutMillis);
clientConfig.setConnectionTimeoutMillis(connectionTimeoutMillis);
IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);

//The request setting, valid only for the current request
request.setSysReadTimeout(readTimeoutMillis);
request.setConnectionTimeoutMillis(connectionTimeoutMillis);
```

***
[← Connection Pool](3-Pool-EN.md) | Timeout[(中文)](4-Timeout-CN.md) | [HTTPS Configurations →](5-HTTPS-EN.md)