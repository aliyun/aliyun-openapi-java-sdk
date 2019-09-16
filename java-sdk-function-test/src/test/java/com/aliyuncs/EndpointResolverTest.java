package com.aliyuncs;

import com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.regions.ProductDomain;
import org.junit.Assert;
import org.junit.Test;

public class EndpointResolverTest extends BaseTest {

    @Test
    public void endpointInExceptionTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile();
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        ProductDomain domain = client.getDomain(request, "cn-qingdao");
        Assert.assertEquals("ecs-cn-hangzhou.aliyuncs.com", domain.getDomainName());

        domain = client.getDomain(request, new String("cn-qingdao"));
        Assert.assertEquals("ecs-cn-hangzhou.aliyuncs.com", domain.getDomainName());
    }

    @Test
    public void endpointNotInExceptionTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile();
        DefaultAcsClient client = new DefaultAcsClient(profile);
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        ProductDomain domain = client.getDomain(request, "cn-xxxxx");
        Assert.assertEquals("ecs.cn-xxxxx.aliyuncs.com", domain.getDomainName());
    }
}
