package com.aliyuncs;

import com.aliyuncs.auth.InstanceProfileCredentialsProvider;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class EcsMetaServerTest extends BaseTest {
    /**
     * Must be tested on the ECS server
     *
     * @throws ClientException
     */
    @Test
    @Ignore
    public void ecsMetaServerStsTokenTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(this.regionId);
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider("alice");
        DefaultAcsClient client = new DefaultAcsClient(profile, provider);
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = client.getAcsResponse(request);
        Assert.assertNotNull(response);
    }

    public void ecsHMACSM3Test() {
        try {
            IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
            profile.setSignatureMethod("HMAC-SM3");
            DefaultAcsClient client = new DefaultAcsClient(profile);
            DescribeInstancesRequest request = new DescribeInstancesRequest();
            request.setPageSize(10);
            DescribeInstancesResponse response;
            response = client.getAcsResponse(request);
            Assert.assertNotNull(response);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
