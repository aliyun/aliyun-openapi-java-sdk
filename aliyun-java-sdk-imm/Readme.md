# aliyun-java-sdk-imm


## 1. Usage

### (1) 将下面的依赖加入 pom.xml

```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <optional>true</optional>
    <version>3.7.1</version>
</dependency>

<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-imm</artifactId>
    <optional>true</optional>
    <version>1.7.3</version>
</dependency>
```

### (2) 用法

构造:

```
IMMClient client = new IMMClient("cn-shanghai", accessKeyId, accessKeySecret);
```

> client 的 3 种用法:

第1种:

```
ListProjectsRequest req = new ListProjectsRequest();

ListProjectsResponse res = client.getResponse(req);
```

第2种:

```
ListProjectsRequest req = new ListProjectsRequest();

String resultJson = client.getResponseString(req);
```

第3种(适合逻辑在前端的 web 服务):

```
Map<String, String> map = new HashMap<String,String>();

map.put("Action","ListProjects");

String resultJson = client.getResponseString(map);
```

各种 Action，请参看[API文档](https://help.aliyun.com/document_detail/63881.html)。

