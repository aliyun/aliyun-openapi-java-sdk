[← 日志](8-Log-CN.md) | 异常[(English)](9-Exception-EN.md) | [首页 →](../README-CN.md)
***

# 问题

| 异常信息              |   解决办法       |
|----------------------|------------------|
| content has not been provided     | 升级到最新版本 |
| ExceptionInInitializerError |升级到最新版本|
| NoClassDefFoundError |添加缺少的依赖包|
| SocketTimeoutException has occurred on a socket read or accept. |设置合理的超时时间|
| Specified signature nonce was used already. |升级到最新版本|
| NoSuchMethodError |添加缺少的依赖包|
| MissingSecurityToken | 升级到最新版本 |
| Specified access key is not found |[检查AK的正确性](#Specified-access-key-is-not-found)|
| An invalid XML character (Unicode: 0x8) was found in the element content of the document |[验证xml是否合法](#xml-character)|
| Server response has a bad format type    | [更多](#Server-response-has-a-bad-format-type) |

## Specified access key is not found

原因及解决方案：

 1. Ak 没有相应的权限，联系对应的管理获取权限
 2. Ak 填写错误，请认证检查 AK 是否正确
 3. 使用环境不匹配，请确认当前环境下 AK 是真实有效的
 
## Server response has a bad format type

原因及解决方案：

返回的 http 协议没有指定数据格式

1. 设置 `request.setAcceptFormat(FormatType.JSON)` 如果无法解决在使用第二个方案
2. 使用 `HttpResponse response = client.doAction(request)` 接收返回

## xml character

原因及解决方案：

[官方文档说明](https://www.w3.org/TR/2000/REC-xml-20001006#NT-Char)

以下三段为非法字符，请不要在xml中出现

 1. 0x00 - 0x08
 2. 0x0b - 0x0c
 3. 0x0e - 0x1f



***
[← 日志](8-Log-CN.md) | 异常[(English)](9-Exception-EN.md) | [首页 →](../README-CN.md)
