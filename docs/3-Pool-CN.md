[← 客户端](2-Client-CN.md) | 连接池[(English)](3-Pool-EN.md) | [超时机制 →](4-Timeout-CN.md)
***

## 配置连接池
默认多个SDK client共享一个连接池，可以在初始化client阶段设置连接池参数
```java
// 创建DefaultAcsClient实例并初始化
DefaultProfile profile = DefaultProfile.getProfile(
"<your-region-id>",          // 地域ID
"<your-access-key-id>",      // RAM账号的AccessKey ID
"<your-access-key-secret>"); // RAM账号Access Key Secret

// 多个SDK client共享一个连接池，此处设置该连接池的参数，
// 比如每个host的最大连接数，超时时间等
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
clientConfig.setMaxRequestsPerHost(6);
clientConfig.setConnectionTimeoutMillis(30000L);
clientConfig.setMaxIdleConnections(20);

profile.setHttpClientConfig(clientConfig);
IAcsClient client = new DefaultAcsClient(profile);
```

***
[← 客户端](2-Client-CN.md) | 连接池[(English)](3-Pool-EN.md) | [超时机制 →](4-Timeout-CN.md)