[← Client](2-Client-EN.md) | Connection Pool[(中文)](3-Pool-CN.md) | [Timeout →](4-Timeout-EN.md)
***

## Configure the connection pool
Multiple SDK clients share the same connection pool, configure the pool in the initialization phase of the client
```java
// Create and initialize a DefaultAcsClient instance
DefaultProfile profile = DefaultProfile.getProfile(
"<your-region-id>",          // The region ID
"<your-access-key-id>",      // The AccessKey ID of the RAM account
"<your-access-key-secret>"); // The AccessKey Secret of the RAM account

// Multiple SDK clients share the same connection pool, set the
// parameters for this pool here such as maxRequestsPerHost, timeout, etc.
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
clientConfig.setMaxRequestsPerHost(6);
clientConfig.setMaxRequests(60);

profile.setHttpClientConfig(clientConfig);
IAcsClient client = new DefaultAcsClient(profile);
```

***
[← Client](2-Client-EN.md) | Connection Pool[(中文)](3-Pool-CN.md) | [Timeout →](4-Timeout-EN.md)

