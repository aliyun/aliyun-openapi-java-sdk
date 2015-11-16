## Welcome to Aliyun SDK

Aliyun SDK 2.0 aimed to provide a unified and full stack SDK solution for you to build applications on aliyun.

(新版的阿里云SDK，提供一套统一的、全产品的阿里云API编程套件，方便开发者快速的在阿里云上搭建自己的应用。)

### Requirements
- `Java 6+`

### License

licensed under the [Apache License 2.0](https://www.apache.org/licenses/)

### How to insall (如何获得SDK) ###

We provide different installing ways for different programming language.（不同的语言有不同的下载和安装方式)：

-  Use maven to install compiled jars.（mvn方式安装依赖）

**Add maven respository(添加maven库)**

```xml
<repositories>
		<repository>
			<id>sonatype-nexus-staging</id>
			<name>Sonatype Nexus Staging</name>
			<url>https://oss.sonatype.org/service/local/staging/deploy/maven2/</url>
			<releases>
				<enabled>true</enabled>
			</releases>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
</repositories>
```

**Add dependencies(添加jar包依赖)**

```xml
<dependencies>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-core</artifactId>
		<version>2.1.7</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-sts</artifactId>
		<version>2.1.6</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-yundun</artifactId>
		<version>2.1.3</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-slb</artifactId>
		<version>2.0.0-rc1</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-oms</artifactId>
		<version>2.0.1</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-ecs</artifactId>
		<version>2.0.0-rc2</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-rds</artifactId>
		<version>2.0.0-rc1</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-bss</artifactId>
		<version>2.0.0-rc1</version>
	</dependency>
	<dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-ocs</artifactId>
		<version>2.0.0-rc1</version>
	</dependency>
    <dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-cms</artifactId>
		<version>2.0.0</version>
	</dependency>
    <dependency>
		<groupId>com.aliyun</groupId>
		<artifactId>aliyun-java-sdk-batchcompute</artifactId>
		<version>2.1.0</version>
	</dependency>
	<dependency>
	  <groupId>com.aliyun</groupId>
	  <artifactId>aliyun-java-sdk-ossadmin</artifactId>
	  <version>2.0.0</version>
	</dependency>
</dependencies>
```

-  (待补充其他语言的下载安装方式)

### A simple java request（一个简单的API调用示例） ###

```java
public void sample() {
	DescribeInstancesRequest describe = new DescribeInstancesRequest();
	IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "<your accessKey>", "<your accessSecret>");
	IAcsClient client = new DefaultAcsClient(profile);
	try {
    	DescribeInstancesResponse response = client.getAcsResponse(describe);
    }catch (ServerException e) {
		e.printStackTrace();
	} 
	catch (ClientException e) {
    	e.printStackTrace();
	} 
}
```

### Inside the code（SDK 的交互类设计） ###

-  You need to get a AccessKeyId and AccessSecret pair first. AccessSecret is kinda like your password. Please note that you should keep it by your self.(请先在官网申请一对访问阿里云API的钥匙，需要注意的是AccessSecret类似你的登录口令，不要给第三方看到。)
 
-  DescribeInstanceRequest contains every parameters to send to Aliyun. (Request 类是所有API参数的容器。)
A request is reusable both in a single thread and muti-threaded application. But when you change a parameter of a request, you should not use it in muti-threaded application. （一个预设值好的Request是可以重用的，不管是单线程还是多线程模式。但是如果需要随时改变一个Request参数时，最好不要在多线程环境下使用。）

- DefaultAcsClient is a reusable parameter parser to parse your request and compose them into a http request.(Client类的作用是将用户的请求翻译成HTTP调用。)

- IAcsClient/DefaultAcsClient contains raw interfaces to let your get XML/JSON data, please use the "doAction" interface methods when you just want to get raw data. If you use the "getAcsResponse" method, you will have to specify a class name to objectize the raw data.(SDK的交互接口包含两类，一类是“doAction”接口，只返回XML/JSON数据，不做对象化；另一类是“getAcsResponse”接口，需要您指定一个要对象化的类)。

- Before you use the Client to send request，you should specify a credential. (在使用Client发API请求之前，您应该先指定自己的访问钥匙。)

- DescribeInstanceResponse contains all information you can find in API Reference which is objectified by client. (Response类是调用的返回结果，具体信息请参照阿里云开发者频道)

- Java programming language provides exception system for error handling. We wrapped all kinds exceptions into ClientException and ServerException. All you have to do is to identify the error code and do action differently.(Java版的SDK，我们把所有的Checked Exception封装成了API的客户端和服务器端错误。您可以区分每一个请求的ErrorCode来做不同的事情。)

- Client will retry when server error happens unless you set the "autoRetry" property false. (当SDK遇到阿里云服务器端错误时，Client会自动重试。您也可以通过将autoRetry属性置为false，不重试。)

### Profile interface (公共参数接口) ###

We provide a profile system for you to unify your common parameters entry. It could help if you want to manage your application's behavior. 
Plus， with client object， you still can temporarily change some parameter, such as RegionId.

(在SDK的全局参数配置profile中，您可以提供一套全局参数的访问入口，在多次访问中共用。另外，Client类也提供了一种灵活性，让您可以暂时改变某个全局参数，例如：RegionId)

### About "RegionId" (地域的选择) ###
Business requirements and availability is one of key feature of cloud computing. We recommend you to choose the nearest region from your business location and it is good practise that to do some disaster backups in different regions. (RegionId是SDK的全局参数，您在选择地域的时候首先应该考虑的是业务就近原则。另外，在不同地域做适当的灾备也是推荐的。)

(Aliyun all regions)当前阿里云的RegionId列表
cn-beijing
cn-qingdao
cn-hangzhou
cn-hongkong
cn-shenzhen
us-west-1

You can also add custom regionId to regionId list, this situation usually use in proprietary cloud or  proprietary domain, sample code as follows:（您还可以添加自定义RegionId到RegionId列表,此种情况通常用于专有云、或专有域，示例代码如下：）

### How to add a custom endpoint（如何添加自定义的RegionId和Endpoint） ###

```java
DefaultProfile.addEndpoint("cn-shanghai-et2-test02", "cn-shanghai-et2-test02", "Ecs", "ecs.aliyuncs.com");
IClientProfile profile = DefaultProfile.getProfile("cn-shanghai-et2-test02", "<your accessKey>", "<your accessSecret>");
IAcsClient client = new DefaultAcsClient(profile);
```

### Implement your credential refreshing (配置您的访问密钥更新机制) ###

Normally， it's not safe to use only one credential from the beginning. You could implement ICredentialProvider interface to provider you own refreshing algorithm.(密钥对就像登录密码一样，有泄漏的风险。当您需要按需更新密钥时，您可以实现ICredentialProvider接口，自定义更新的机制)

In our sample code, we provider a filed credential which stored AccessKeyId and AccessSecret in a file. (代码示例里，我们简单的将访问密钥放在了文件中，具体请参照Java版的示例代码。)

### Multi-threaded application (多线程编程) ###

Although， request is reusable in muti-threaded application. It is strongly recommended that you wrap all your atomic requests into a runnable task class. And use thread pool to execute your threads. Below is a basic sample to show how to wrap muti-requests and excecute them asynchronously. Please check our sample code. (尽管request可以在多线程模型中使用，但是如果有的线程改变了Request参数，可能会造成其他线程运行的不可确定性。所以建议您封装原子的API Request到一个Task类，然后使用线程池来运行多个分立的任务。)
    
Java Smple code(Java示例代码)

```java
ExecutorService pool = Executors.newFixedThreadPool(3);
Thread t1 = new LaunchDeleteInstanceTask();
Thread t2 = new LaunchDeleteInstanceTask();
Thread t3 = new LaunchDeleteInstanceTask();
pool.execute(t1);
pool.execute(t2);
pool.execute(t3);
pool.shutdown();
```

### Sample codes (示例代码说明) ###

 - simle. This sample illustrates a versy simple request. （简单示例代码）
 
 - reusable. This sample illustrates how to delete all ECS instances by request and client reusing. (这段代码演示了如何重复使用Request 和 Client 循环删除一个Region下所有示例)
 
 - threaded. This sample illustrates how to wrap som requests into a thread object and run it in thread pool. （该示例演示了如何将原子请求封装成线程，并在线程池里并发执行。）

 - osssample. Just to illustate new version SDK's capability of full stack. (仅仅是演示OSS的调用能力)

### Code interface (代码接口) ###
 - IClientProfile (公共参数)
 
 DefaultProfile contains sha-hamc1 signer, internal endpoints configration. (默认的Profile包含hmac1签名器和一个内建的接入点列表)

```java
public ISigner getSigner();									//取得签名器
public String getRegionId();								//取得RegionId
public FormatType getFormat();								//取得格式
public Credential getCredential();							//取得密钥
public List<Endpoint> getEndpoints() throws ClientException;//取得接入点列表
```

- IEndpointsProvider (接入点提供器)

InternalEndpointsParser provide a embed endpoint list.(InternalEndpointsParser类提供一个内建接入点列表)

```java
public List<Endpoint> getEndpoints() throws ClientException;//取得接入点列表
```

- ICredentialProvider (密钥提供器)
 
When you want to fresh your key/secret pair customly, you should implement this interface and assign to Profile. (当需要定时或者自定义更新密钥时，需要实现此接口并赋值给Client)

```java
public Credential fresh();//刷新密钥的机制
```
- IAcsClient Parameters（Client 接口参数说明）

The "doAction" interfaces return raw http response whithout parsing http content. You will feel very useful when you are using xlt to translate xml file directly. ("doAction"类接口返回的是http本身，响应对象以二进制的方式存在http body体内。某些用户需要直接转换XML到HTML时，应该会效率更高。)  

AcsRequest request       : 请求参数

boolean autoRetry        : 自动重试，遇到500+或者流控错误自动重试

int maxRetryNumber       : 重试次数，默认3次

String regionId          : 地域Id，默认无

Credential credential	: 密钥，默认无

ISigner signer			: 签名器，默认sha-hmac1

FormatType format		: 返回值格式，默认XML

List<Endpoint> endpoints: 接入点列表，默认jar包内建

- IAcsClient Interfaces (Client 接口列表)

```java
public HttpResponse doAction(AcsRequestrequest, 
		boolean autoRetry, 			
		int maxRetryCounts) 
		throws ClientException, ServerException ;
	public HttpResponse doAction(AcsRequest request, 
		IClientProfile profile) 
		throws ClientException, ServerException;
public HttpResponse doAction(AcsRequest<T> request, 
	String regionId,
	Credential credential) 
	throws ClientException, ServerException;
public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request) 
	throws ServerException, ClientException;
public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, 
	boolean autoRetry, int maxRetryCounts) 
	throws ServerException, ClientException;
public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, 
	IClientProfile profile) 
	throws ServerException, ClientException;
public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, 
	String regionId, Credential credential) 
	throws ServerException, ClientException;
public <T extends AcsResponse> HttpResponse doAction(
	AcsRequest<T> request, 		
	boolean autoRetry, 
	int maxRetryCounts, 
	IClientProfile profile) 
	throws ClientException, ServerException;
public <T extends AcsResponse> HttpResponse doAction(
	AcsRequest<T> request, 
	boolean autoRetry, int maxRetryNumber,
	String regionId, Credential credential,
	ISigner signer, FormatType format, 
	List<Endpoint> endpoints) 
	throws ClientException, ServerException；
public HttpResponse doAction(AcsRequest request, 
	boolean autoRetry, 
		int maxRetryNumber,
	String regionId, 
		Credential credential,
	ISigner signer, 
		FormatType format, 
	List<Endpoint> endpoints) 
		throws ClientException, ServerException;
```

### SDK Exceptions (SDK的自有异常) ###
Besides API returned errors, SDK wrapped some platform exceptions to  ClientExceptions, please note belows. (除了API自己返回的错误，SDK还将一些平台错误封装成用户异常，可以通过ClientException.getErrCode的方式进行判断)

<table>
	<tr>
		<td>SDK.MissingEndpointsFiler</td>
		<td>内部Endpoint文件缺失</td>
	</tr>
	<tr>
		<td>SDK.InvalidEndpointsFile</td>
		<td>提供的内部Endpoint文件不合法</td>
	</tr>
	<tr>
		<td>SDK.EndpointsFileMalformed</td>
		<td>XML内容不是期望的内容</td>
	</tr>
	<tr>
		<td>SDK.InvalidProfile</td>
		<td>提供的Profile为空</td>
	</tr>
	<tr>
		<td>SDK.UnsupportedEncoding</td>
		<td>出现了不支持的编码（不支持UTF-8）</td>
	</tr>
	<tr>
		<td>SDK.InvalidRegionId</td>
		<td>通过RegionId找不到对应的Endpoint</td>
	</tr>
	<tr>
		<td>SDK.InvalidAccessSecret</td>
		<td>无效的密钥</td>
	</tr>
	<tr>
		<td>SDK.ServerUnreachable</td>
		<td>服务器不可达</td>
	</tr>
	<tr>
		<td>SDK.InvalidMD5Algorithm</td>
		<td>调用环境不支持MD5摘要</td>
	</tr>
	<tr>
		<td>SDK.InvalidResponseClass</td>
		<td>Client无法将HTTP返回解析成对象</td>
	</tr>
	<tr>
		<td>SDK.InvalidXMLParser</td>
		<td>XML Paser配置错误</td>
	</tr>
	<tr>
		<td>SDK.InvalidXMLFormat</td>
		<td>XML格式错误</td>
	</tr>
	<tr>
		<td>SDK.InvalidXMLContent</td>
		<td>XML内容错误</td>
	</tr>
</table>

 
### Set accept format for AcsRequest.(设置API返回格式) ###

```java
public void setAcceptFormat(FormatType acceptFormat)
```

Available format type is XML, JSON, RAW, which will be mapped into “Accept” in http requests.(AcsRequest的接口支持XML、JSON和RAW格式的返回值，AcsRequest会自动将Format转换成Accept的头部)

### Set http content for AcsRequest.(设置HTTP请求的Body体) ###

```java
public void setContent(byte[] content, 
		String encoding,
		FormatType format)
```

This function provide a entry for you to specify content in http request. AcsRequest will calculate MD5 sum of provided content and add it into http headers. Please note that some REST-Rpc styled APIs will ingnore this part。(这个接口为HTTP提供Body体，并且会自动计算BODY部分的MD5值。但是像ECS、SLB、RDS等RPC风格的API会自动忽略这个值)

### Parameter utility functions.(API快捷函数) ###

Base64Helper类

```java
public synchronized static String encode(String string, String encoding)
	throws UnsupportedEncodingException;//Base64编码

public synchronized static String decode(String string, String encoding)
	throws UnsupportedEncodingException;//Base64解码
```

ParameterHelper类

```java
public static String getISO8601Time(Date date); //取得ISO8601日期
public static String getRFC2616Date(Date date); //取得RFC2616日期
public static String md5Sum(byte[] buff);       //计算MD5摘要
```
