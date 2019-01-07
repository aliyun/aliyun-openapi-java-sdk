package com.aliyuncs;

import com.aliyuncs.auth.InstanceProfileCredentialsProvider;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 治强
 * @create 2018-11-29 17:10
 */
public class EcsMetaServerTest extends BaseTest{
    /**
     * 此测试必须放在ECS服务器上测试
     * @throws ClientException
     */
    @Test
    public void ecsMetaServerStsTokenTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(this.regionId);
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider("alice");
        DefaultAcsClient client = new DefaultAcsClient(profile, provider);
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = client.getAcsResponse(request);
        Assert.assertNotNull(response);
    }
}
