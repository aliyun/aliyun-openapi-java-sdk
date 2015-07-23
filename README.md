# Open API SDK for Java Developers

## Requirements

- Java 6+

## Build

```shell
git clone ...
cd aliyun-openapi-java-sdk
mvn clean packge -DskipTests
```

- to run unit tests, you will have to configure aliyun-sdk.properties files in your user directory, and make sure your project has corresponding service enabled, eg. openmr.

## Example
	public void sample() {
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "<your accessKey>", "<your accessSecret>");
		IAcsClient client = new DefaultAcsClient(profile);
		DescribeRegionsRequest describeRegionsRequest = new DescribeRegionsRequest();
		try {
			DescribeRegionsResponse describeRegionsResponse = client.getAcsResponse(describeRegionsRequest);
			//todo something.
		} 
		catch (ServerException e) {
			//todo something.
		}
		catch (ClientException e) {
			//todo something.
		}
	}
## Authors && Contributors
- [Zuhe]()
- [Ma Lijie](https://github.com/malijiefoxmail)

## License

licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0.html)
