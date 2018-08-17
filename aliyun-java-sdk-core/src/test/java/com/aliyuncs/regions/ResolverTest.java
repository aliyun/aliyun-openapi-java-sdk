package com.aliyuncs.regions;

import java.util.List;

import com.aliyuncs.BaseTest;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author VK.Gao
 * @date 2018/03/13
 */
public class ResolverTest extends BaseTest {

    @Test
    public void testResolver() throws Exception {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", properties.getProperty("accessKeyId"),
            properties.getProperty("accessSecret"));
        Assert.assertNotNull("ecs:cn-hangzhou", resolveEndpoint(profile, "cn-hangzhou", "ecs"));
        Assert.assertNotNull("ess:cn-hangzhou", resolveEndpoint(profile, "cn-hangzhou", "ess"));
        Assert.assertNotNull("aegis:cn-hangzhou", resolveEndpoint(profile, "cn-hangzhou", "aegis"));
        Assert.assertNull("apigateway:us-east-1", resolveEndpoint(profile, "us-east-1", "cloudapi"));
        Assert.assertNotNull("apigateway:cn-beijing", resolveEndpoint(profile, "cn-beijing", "cloudapi"));
    }

    private ProductDomain resolveEndpoint(DefaultProfile profile, String regionId, String product) throws Exception {
        List<Endpoint> endpoints;
        try {
            endpoints = profile.getEndpoints(product, regionId, null, "openAPI");
        } catch (Throwable e) {
            endpoints = profile.getEndpoints(regionId, product);
        }
        return Endpoint.findProductDomain(regionId, product, endpoints);
    }
}
