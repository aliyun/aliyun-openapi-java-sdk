package com.aliyuncs;

import com.aliyuncs.auth.InstanceProfileCredentialsProvider;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class EcsMetaServerTest extends BaseTest{
    /**
     * Must be tested on the ECS server
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
}
