package com.aliyuncs;

import com.aliyuncs.auth.BasicCredentials;
import com.aliyuncs.auth.STSAssumeRoleSessionCredentialsProvider;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Test;

public class CredentialsTest extends BaseTest {

    @Test
    public void sdkManageTokenTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(this.regionId);
        BasicCredentials basicCredentials = new BasicCredentials(this.tokenAccesskeyId, this.tokenAccesskeySecret);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(
                basicCredentials,
                this.roleArn,
                profile
        );
        DefaultAcsClient client = new DefaultAcsClient(profile, provider);
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }



}
