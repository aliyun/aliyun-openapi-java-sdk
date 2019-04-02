[← 调试](7-Debug-CN.md) | 日志[(English)](8-Log-EN.md) | [首页 →](../README-CN.md)

***

# 日志
## 设置Logger
若要启动日志功能，请传入实现了`org.slf4j.Logger`接口的对象

```java
HttpClientConfig clientConfig = HttpClientConfig.getDefault();
// Client Logger配置
clientConfig.setLogger(logger);
// Client 日志格式配置
clientConfig.setLogFormat(format)
IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
profile.setHttpClientConfig(clientConfig);
DefaultAcsClient client = new DefaultAcsClient(profile);
client.getAcsResponse(request);
```
## 日志格式化
### 默认格式
`{method} {uri} HTTP/{version} {code} {cost} {hostname} {pid}`
### 设置格式
```java
clientConfig.setLogFormat(format)
```
### 变量
日志内容支持以下变量替换:
| 变量      |   描述       |
|----------|-------------|
| {request}     | 完整的HTTP请求消息 |
| {response}     | 完整的HTTP响应消息 |
| {ts}     | GMT中的 ISO 8601日期 |
| {date_iso_8601}     | GMT中的 ISO 8601日期 |
| {date_common_log}     | 使用配置的时区的Apache常用日志日期 |
| {host}     | 请求主机 |
| {method}     | 请求方法 |
| {uri}     | 请求的URI |
| {version}     | 协议版本 |
| {target}     | 请求目标 (path + query + fragment) |
| {hostname}     | 发送请求的计算机的主机名 |
| {code}     | 响应的状态代码（如果可用） |
| {phrase}     | 响应的原因短语（如果有） |
| {req_header_*}     | 将 `*` 替换为请求标头的小写名称以添加到消息中 |
| {res_header_*}     | 将 `*` 替换为响应头的小写名称以添加到消息中 |
| {req_headers}     | 请求头 |
| {res_headers}     | 响应头 |
| {req_body}     | 请求主体 |
| {res_body}     | 响应主体 |
| {pid}     | PID |
| {cost}     | 耗时 |
| {start_time}     | 开始时间 |
| {time}     | 日志记录时间 |

***
[← 调试](7-Debug-CN.md) | 日志[(English)](8-Logger-EN.md) | [首页 →](../README-CN.md)