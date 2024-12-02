package com.aliyuncs;

import com.aliyuncs.auth.BasicCredentials;
import com.aliyuncs.auth.OIDCCredentialsProvider;
import com.aliyuncs.auth.STSAssumeRoleSessionCredentialsProvider;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.sts.model.v20150401.*;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Test;

public class CredentialsTest extends BaseTest {

    @Test
    public void ramRoleArnProviderTest() throws ClientException {
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

    @Test
    public void oidcProviderTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(this.regionId);
        String roleArn = System.getenv("ALIBABA_CLOUD_ROLE_ARN");
        String tokenFilePath = System.getenv("ALIBABA_CLOUD_OIDC_TOKEN_FILE");
        String providerArn = System.getenv("ALIBABA_CLOUD_OIDC_PROVIDER_ARN");

        OIDCCredentialsProvider provider = new OIDCCredentialsProvider(roleArn, providerArn, tokenFilePath, "sessionname", this.regionId);
        DefaultAcsClient client = new DefaultAcsClient(profile, provider);
        GetCallerIdentityRequest request = new GetCallerIdentityRequest();
        GetCallerIdentityResponse response = client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertEquals("AssumedRoleUser", response.getIdentityType());
        Assert.assertTrue(response.getArn().endsWith("/sessionname"));
    }

    @Test
    public void oidcProviderForDefaultCredentialsProviderTest() throws ClientException {
        DefaultAcsClient client = new DefaultAcsClient(this.regionId);
        GetCallerIdentityRequest request = new GetCallerIdentityRequest();
        GetCallerIdentityResponse response = client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertEquals("AssumedRoleUser", response.getIdentityType());
        Assert.assertTrue(response.getArn().contains("oidc-role-for-java-sdk-v1-ci"));
    }
}
