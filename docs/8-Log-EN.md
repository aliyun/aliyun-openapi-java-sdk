[← Debug](7-Debug-EN.md) | Log[(中文)](8-Log-CN.md) |[Exception →](9-Exception-EN.md)

***

# Log
## Logger configuration
To start the logging function, pass in an object that implements the `org.slf4j.Logger` interface

```java
IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
// configure logger
profile.setLogger(logger);
// configure log format
profile.setLogFormat(format);
DefaultAcsClient client = new DefaultAcsClient(profile);
client.getAcsResponse(request);
```
## Log format
### Default format
`{method} {uri} HTTP/{version} {code} {cost} {hostname} {pid}`
### Configure format
```java
profile.setLogFormat(format)
```

### Variables

The following variable substitutions are supported:

| Variable |   Describe  |
|----------|-------------|
| {request}     | Full HTTP request message |
| {response}     | Full HTTP response message |
| {ts}     | ISO 8601 date in GMT |
| {date_iso_8601}     | ISO 8601 date in GMT |
| {date_common_log}     | Apache common log date using the configured timezone |
| {host}     | Host of the request |
| {method}     | Method of the request |
| {uri}     | URI of the request |
| {version}     | Protocol version |
| {target}     | Request target of the request (path + query + fragment) |
| {hostname}     | Hostname of the machine that sent the request |
| {code}     | Status code of the response (if available) |
| {phrase}     | Reason phrase of the response  (if available) |
| {req_header_*}     | Replace `*` with the lowercased name of a request header to add to the message |
| {res_header_*}     | Replace `*` with the lowercased name of a response header to add to the message |
| {req_headers}     | Request headers |
| {res_headers}     | Response headers |
| {req_body}     | Request body |
| {res_body}     | Response body |
| {pid}     | PID |
| {cost}     | Cost Time |
| {start_time}     | Start Time |
| {time}     | Log Time |

***
[← Debug](7-Debug-EN.md) | Log[(中文)](8-Log-CN.md) |[Exception →](9-Exception-EN.md)
