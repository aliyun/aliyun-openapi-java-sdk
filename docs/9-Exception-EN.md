[← Log](8-Log-EN.md) | Exception[(中文)](9-Exception-CN.md) |[Home →](../README.md)
***

# Questions

| exception               |    solutions      |
|----------------------|------------------|
| content has not been provided     | Upgrade to the latest version |
| ExceptionInInitializerError |Upgrade to the latest version|
| NoClassDefFoundError |Add missing dependency packages|
| SocketTimeoutException has occurred on a socket read or accept. |Set a reasonable timeout|
| Specified signature nonce was used already. |Upgrade to the latest version|
| NoSuchMethodError |Add missing dependency packages|
| MissingSecurityToken | Upgrade to the latest version |
| Specified access key is not found |[heck the correctness of AK](#Specified-access-key-is-not-found)|
| An invalid XML character (Unicode: 0x8) was found in the element content of the document |[Verify that the XML is valid](#xml-character)|
| Server response has a bad format type    | [more](#Server-response-has-a-bad-format-type) |

## Specified access key is not found

Reasons and solutions:

 1. Ak doesn't have permission, contact the administrator to get permission
 2. Ak error, check the correctness of AK
 3. Environment mismatch, please confirm that AK is valid in the current environment
 
## Server response has a bad format type

Reasons and solutions:

The response does not specify a data format

1. `request.setAcceptFormat(FormatType.JSON)`. Add this code, if this cannot be fixed then you can use the second solution
2. `HttpResponse response = client.doAction(request)` you could use this code to receive the returned data

## xml character

Reasons and solutions:

[Official documentation](https://www.w3.org/TR/2000/REC-xml-20001006#NT-Char)

The following three kinds of characters are illegal, please don't appear in XML

 1. 0x00 - 0x08
 2. 0x0b - 0x0c
 3. 0x0e - 0x1f

***
[← Log](8-Log-EN.md) | Exception[(中文)](9-Exception-CN.md) |[Home →](../README.md)
