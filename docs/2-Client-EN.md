[← Installation](1-Installation-EN.md) | Client[(中文)](2-Client-CN.md) | [Connection Pool →](3-Pool-EN.md)
***

### Using AccessKey call

```java
package com.testprogram;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ecs.model.v20140526.*;
public class Main {
    public static void main(String[] args) {
        // Create and initialize a DefaultAcsClient instance
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // The region ID
            "<your-access-key-id>",      // The AccessKey ID of the RAM account
            "<your-access-key-secret>"); // The AccessKey Secret of the RAM account
        IAcsClient client = new DefaultAcsClient(profile);
        // Create an API request and set parameters
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        // Initiate the request and handle the response or exceptions
        DescribeInstancesResponse response;
        try {
            response = client.getAcsResponse(request);
            for (DescribeInstancesResponse.Instance instance:response.getInstances()) {
                System.out.println(instance.getPublicIpAddress());
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
```

### Use the default credential provider chain

The default credential provider chain looks for available credentials, with following order:

1.System Properties

Look for environment credentials in system properties. If the `alibabacloud.accessKeyId` and `alibabacloud.accessKeyIdSecret` system properties are defined and not empty, the program will use them to create default credentials.

2.Environment Credentials

Look for environment credentials in environment variable. If the `ALIBABA_CLOUD_ACCESS_KEY_ID` and `ALIBABA_CLOUD_ACCESS_KEY_SECRET` environment variables are defined and are not empty, the program will use them to create default credentials.

3.Credentials File

If there is `~/.alibabacloud/credentials default file (Windows shows C:\Users\USER_NAME\.alibabacloud\credentials)`, the program automatically creates credentials with the specified type and name. The default file is not necessarily exist, but a parse error will throw an exception. The name of configuration item is lowercase.This configuration file can be shared between different projects and between different tools. Because it is outside of the project and will not be accidentally committed to the version control. The path to the default file can be modified by defining the `ALIBABA_CLOUD_CREDENTIALS_FILE` environment variable. If not configured, use the default configuration `default`. You can also set the environment variables `ALIBABA_CLOUD_PROFILE` to use the configuration.

```ini
[default]                          # default setting
enable = true                      # Enable，Enabled by default if this option is not present
type = access_key                  # Certification type: access_key
access_key_id = foo                # Key
access_key_secret = bar            # Secret

[client1]                          # configuration that is named as `client1`
type = ecs_ram_role                # Certification type: ecs_ram_role
role_name = EcsRamRoleTest         # Role Name

[client2]                          # configuration that is named as `client2`
enable = false                     # Disable
type = ram_role_arn                # Certification type: ram_role_arn
region_id = cn-test                # required 
access_key_id = foo
access_key_secret = bar
role_arn = role_arn
role_session_name = session_name

[client3]                          # configuration that is named as `client3`
type = rsa_key_pair                # Certification type: rsa_key_pair
public_key_id = publicKeyId        # Public Key ID
private_key_file = /your/pk.pem    # Private Key file
```
4.Instance RAM Role

If the environment variable `ALIBABA_CLOUD_ECS_METADATA` is defined and not empty, the program will take the value of the environment variable as the role name and request <http://100.100.100.200/latest/meta-data/ram/security-credentials/> to get the temporary Security credentials.

```java
package com.testprogram;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ecs.model.v20140526.*;
public class Main {
    public static void main(String[] args) {
        IAcsClient client = new DefaultAcsClient("your-region-id");
        // Create an API request and set parameters
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        // Initiate the request and handle the response or exceptions
        DescribeInstancesResponse response;
        try {
        response = client.getAcsResponse(request);
        for (DescribeInstancesResponse.Instance instance:response.getInstances()) {
            System.out.println(instance.getPublicIpAddress());
        }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}

```

### Using BearerToken call

Only CCC supports this method

```java
package com.testprogram;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersRequest;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse;
public class Main {
    public static void main(String[] args) {
        // Create and initialize a DefaultAcsClient instance
        DefaultProfile profile = DefaultProfile.getProfile("<your-region-id>"); // The region ID
        BearerTokenCredentials bearerTokenCredential = new BearerTokenCredentials("<your-bearer-token>");
        DefaultAcsClient client = new DefaultAcsClient(profile, bearerTokenCredential);
        // Create an API request and set parameters
        ListPhoneNumbersRequest request = new ListPhoneNumbersRequest();
        request.getInstanceId("yourId");
        request.setOutboundOnly(true);
        // Initiate the request and handle the response or exceptions
        ListPhoneNumbersResponse response;
        try {
            response = client.getAcsResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
```

***
[← Installation](1-Installation-EN.md) | Client[(中文)](2-Client-CN.md) | [Connection Pool →](3-Pool-EN.md)