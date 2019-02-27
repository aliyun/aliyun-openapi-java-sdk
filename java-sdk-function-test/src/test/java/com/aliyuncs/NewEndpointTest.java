package com.aliyuncs;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.http.HttpUtil;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisRequest;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeRegionsResponse;
import com.aliyuncs.endpoint.ChainedEndpointResolver;
import com.aliyuncs.endpoint.DefaultEndpointResolver;
import com.aliyuncs.endpoint.EndpointResolver;
import com.aliyuncs.endpoint.EndpointResolverBase;
import com.aliyuncs.endpoint.InternalLocationServiceEndpointResolver;
import com.aliyuncs.endpoint.LocalConfigGlobalEndpointResolver;
import com.aliyuncs.endpoint.LocalConfigRegionalEndpointResolver;
import com.aliyuncs.endpoint.LocationServiceEndpointResolver;
import com.aliyuncs.endpoint.ResolveEndpointRequest;
import com.aliyuncs.endpoint.UserCustomizedEndpointResolver;
import com.aliyuncs.endpoint.UserVpcEndpointResolver;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ErrorCodeConstant;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.ram.model.v20150501.ListAccessKeysRequest;
import com.aliyuncs.ram.model.v20150501.ListAccessKeysResponse;
import com.aliyuncs.ros.model.v20150901.DescribeResourcesRequest;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class NewEndpointTest extends BaseTest {
    private EndpointResolver endpointResolver;
    private UserCustomizedEndpointResolver userCustomizedEndpointResolver;
    private LocalConfigRegionalEndpointResolver localConfigRegionalEndpointResolver;
    private LocalConfigGlobalEndpointResolver localConfigGlobalEndpointResolver;
    private LocationServiceEndpointResolver locationServiceEndpointResolver;

    public void initEnv(String testLocalConfig, DefaultAcsClient client, boolean isUsingVpcEndpoint,
            boolean isUsingInternalLocationService) {
        List<EndpointResolverBase> resolverChain = new ArrayList<EndpointResolverBase>();

        userCustomizedEndpointResolver = new UserCustomizedEndpointResolver();
        if (testLocalConfig == null) {
            localConfigRegionalEndpointResolver = new LocalConfigRegionalEndpointResolver();
            localConfigGlobalEndpointResolver = new LocalConfigGlobalEndpointResolver();
        } else {
            localConfigRegionalEndpointResolver = new LocalConfigRegionalEndpointResolver(testLocalConfig);
            localConfigGlobalEndpointResolver = new LocalConfigGlobalEndpointResolver(testLocalConfig);
        }
        if (isUsingInternalLocationService) {
            locationServiceEndpointResolver = new InternalLocationServiceEndpointResolver(client != null ? client
                    : this.client);
        } else {
            locationServiceEndpointResolver = new LocationServiceEndpointResolver(client != null ? client
                    : this.client);
        }
        resolverChain.add(userCustomizedEndpointResolver);
        if (isUsingVpcEndpoint) {
            resolverChain.add(new UserVpcEndpointResolver());
        }
        resolverChain.add(localConfigRegionalEndpointResolver);
        resolverChain.add(localConfigGlobalEndpointResolver);
        resolverChain.add(locationServiceEndpointResolver);

        endpointResolver = new ChainedEndpointResolver(resolverChain);
    }

    public void initEnv(String testLocalConfig) {
        initEnv(testLocalConfig, null, false, false);
    }

    public void initEnv() {
        initEnv(null);
    }

    public String resolve(String regionId, String productCode, String locationServiceCode, String endpointType)
            throws ClientException {
        ResolveEndpointRequest request = new ResolveEndpointRequest(regionId, productCode, locationServiceCode,
                endpointType);
        return endpointResolver.resolve(request);
    }

    public String resolve(String regionId, String productCode) throws ClientException {
        return resolve(regionId, productCode, null, null);
    }

    @Test
    public void testProductsWithLocationService() throws ClientException {
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        DescribeRegionsResponse response = this.client.getAcsResponse(request);
        Assert.assertTrue(response.getRegions().size() > 0);
    }

    @Test
    public void testProductsWithoutLocationService() throws ClientException {
        ListAccessKeysRequest request = new ListAccessKeysRequest();
        ListAccessKeysResponse response = this.client.getAcsResponse(request);
        Assert.assertTrue(response.getAccessKeys().size() > 0);
    }

    @Test
    public void testAddNewEndpointManually() throws ClientException {

        DefaultAcsClient myClient = getClientWithRegionId("cn-ningbo");

        DescribeRegionsRequest request = new DescribeRegionsRequest();
        try {
            myClient.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
            Assert.assertEquals("No such region 'cn-ningbo'. Please check your region ID.", e.getErrMsg());
        }

        DefaultProfile.addEndpoint("cn-ningbo", // which does not exist at all
                "Ecs", "abc.cn-ningbo.endpoint-test.exception.com");

        try {
            myClient.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_TESTABILITY, e.getErrCode());
            Assert.assertEquals("abc.cn-ningbo.endpoint-test.exception.com", e.getErrMsg());
        }
    }

    @Test
    public void testAddExistingEndpointManually() throws ClientException {
        DefaultAcsClient myClient = getClientWithRegionId("cn-hangzhou");
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        DescribeRegionsResponse response = myClient.getAcsResponse(request);
        Assert.assertTrue(response.getRegions().size() > 0);

        DefaultProfile.addEndpoint("cn-hangzhou", "Ecs", "abc.cn-hangzhou.endpoint-test.exception.com");

        try {
            myClient.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_TESTABILITY, e.getErrCode());
            Assert.assertEquals("abc.cn-hangzhou.endpoint-test.exception.com", e.getErrMsg());
        }

        // Reset user customized endpoint
        DefaultEndpointResolver.predefinedEndpointResolver = new UserCustomizedEndpointResolver();
    }

    @Test
    public void testRegionalEndpointComesFromLocalConfig() throws ClientException {
        String testConfig = "" + "{\n" + "  \"regional_endpoints\" : {\n" + "    \"abc\" : {\n"
                + "      \"mars-ningbo\" : \"ecs.mars-ningbo.aliyuncs.com\"\n" + "    }\n" + "  }\n" + "}";

        initEnv(testConfig);

        Assert.assertEquals("ecs.mars-ningbo.aliyuncs.com", resolve("mars-ningbo", "abc"));
    }

    @Test
    public void testGlobalEndpointComesFromLocalConfig() throws ClientException {
        String testConfig = "" + "{\n" + "  \"regional_endpoints\" : {\n" + "    \"abc\" : {\n"
                + "      \"mars-ningbo\" : \"ecs.mars-ningbo.aliyuncs.com\"\n" + "    }\n" + "  },\n"
                + "  \"global_endpoints\" : {\n" + "    \"abc\" : \"ecs.mars.aliyuncs.com\"\n" + "  },\n"
                + "  \"regions\" : [\"mars-ningbo\", \"mars-hangzhou\", \"mars-shanghai\"]\n" + "}";

        initEnv(testConfig);

        Assert.assertEquals("ecs.mars-ningbo.aliyuncs.com", resolve("mars-ningbo", "abc"));
        Assert.assertEquals("ecs.mars.aliyuncs.com", resolve("mars-hangzhou", "abc"));
        Assert.assertEquals("ecs.mars.aliyuncs.com", resolve("mars-shanghai", "abc"));
    }

    @Test
    public void testEndpointComesFromLocationService() throws ClientException {
        initEnv("{}"); // empty local config

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals("ecs-cn-hangzhou.aliyuncs.com", resolve("cn-hangzhou", "ecs", "ecs", null));
        }
        Assert.assertEquals(1, locationServiceEndpointResolver.locationServiceCallCounter);
    }

    @Test
    public void testLocationServiceMiss() throws ClientException {
        initEnv("{}"); // empty local config

        // No openAPI data
        for (int i = 0; i < 3; i++) {
            try {
                resolve("cn-hangzhou", "Ram", "ram", "openAPI");
                Assert.fail();
            } catch (ClientException e) {
                Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
                Assert.assertTrue(e.getErrMsg().startsWith(
                        "No endpoint in the region 'cn-hangzhou' for product 'Ram'."));
            }
        }
        Assert.assertEquals(1, locationServiceEndpointResolver.locationServiceCallCounter);

        // Bad region ID
        for (int i = 0; i < 3; i++) {
            try {
                resolve("mars", "Ram", "ram", "openAPI");
                Assert.fail();
            } catch (ClientException e) {
                Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
                Assert.assertEquals("No such region 'mars'. Please check your region ID.", e.getErrMsg());
            }
        }
        // Bad region ID with another product
        try {
            resolve("mars", "Ecs", "ecs", "openAPI");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
            Assert.assertEquals("No such region 'mars'. Please check your region ID.", e.getErrMsg());
        }
        Assert.assertEquals(2, locationServiceEndpointResolver.locationServiceCallCounter);

        // Bad product code
        for (int i = 0; i < 3; i++) {
            try {
                resolve("cn-hangzhou", "InvalidProductCode", "InvalidProductCode", "openAPI");
                Assert.fail();
            } catch (ClientException e) {
                Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
                Assert.assertTrue(e.getErrMsg().startsWith("" + "No endpoint for product 'InvalidProductCode'. \n"
                        + "Please check the product code, or set an endpoint for your request explicitly.\n"));
            }
        }
        // Bad product code with another region ID
        try {
            resolve("cn-beijing", "InvalidProductCode", "InvalidProductCode", "openAPI");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
            Assert.assertTrue(e.getErrMsg().startsWith("" + "No endpoint for product 'InvalidProductCode'. \n"
                    + "Please check the product code, or set an endpoint for your request explicitly.\n"));
        }
        Assert.assertEquals(3, locationServiceEndpointResolver.locationServiceCallCounter);
    }

    @Test
    public void testTryToGetEndpointWithInvalidRegionId() {
        initEnv();
        try {
            System.out.println(resolve("mars", "Ecs"));
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
            Assert.assertEquals("No such region 'mars'. Please check your region ID.", e.getErrMsg());
        }
    }

    @Test
    public void testTryToGetEndpointWithInvalidProductCode() {
        initEnv();
        try {
            resolve("cn-beijing", "InvalidProductCode");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
            System.out.println(e.getErrMsg());
            Assert.assertTrue(e.getErrMsg().startsWith("" + "No endpoint for product 'InvalidProductCode'. \n"
                    + "Please check the product code, or set an endpoint for your request explicitly.\n"));
        }
    }

    @Test
    public void testInnerApiEndpoint() throws ClientException {
        initEnv();
        Assert.assertEquals("ram-share.aliyuncs.com", resolve("cn-hangzhou", "Ram", "ram", "innerAPI"));
    }

    @Test
    public void testGetInnerApiEndpointBypassLocalConfig() throws ClientException {
        String testConfig = "" + "{\n" + "  \"ram\" : {\n" + "    \"regional_endpoints\" : [\n" + "      {\n"
                + "        \"region\" : \"cn-hangzhou\",\n"
                + "        \"endpoint\" : \"ram.mars-ningbo.aliyuncs.com\"\n" + "      }\n" + "    ],\n"
                + "    \"global_endpoint\" : \"ram.mars.aliyuncs.com\"\n" + "  }\n" + "}";
        initEnv(testConfig);
        Assert.assertEquals("ram-share.aliyuncs.com", resolve("cn-hangzhou", "Ram", "ram", "innerAPI"));
    }

    @Test
    public void testGetInnerApiEndpointByManuallyAdding() throws ClientException {
        initEnv();
        userCustomizedEndpointResolver.putEndpointEntry("cn-hangzhou", "Ram",
                "ram.cn-hangzhou.endpoint-test.exception.com");
        Assert.assertEquals("ram.cn-hangzhou.endpoint-test.exception.com", resolve("cn-hangzhou", "Ram", "ram",
                "innerAPI"));
    }

    @Test
    public void testCanNotConnectLocationService() throws ClientException {
        initEnv();
        locationServiceEndpointResolver.setLocationServiceEndpoint("location-on-mars.aliyuncs.com");

        try {
            resolve("cn-hangzhou", "Ecs", "ecs", "innerAPI");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
        }
    }

    @Test
    public void testInvalidAccessKeyId() throws ClientException {
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "BadAccessKeyId", accesskeyId,
                accesskeySecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        initEnv(null, client, false, false);
        try {
            resolve("cn-hangzhou", "Ecs", "ecs", "innerAPI");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("InvalidAccessKeyId.NotFound", e.getErrCode());
        }
    }

    @Test
    public void testInvalidAccessKeySecret() {
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accesskeyId, "BadAccesskeySecret");
        DefaultAcsClient client = new DefaultAcsClient(profile);
        initEnv(null, client, false, false);
        try {
            resolve("cn-hangzhou", "Ecs", "ecs", "innerAPI");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.InvalidAccessKeySecret", e.getErrCode());
        }
    }

    @Test
    @Ignore
    public void testLocalClockScrewWhenCallLocationService() {
        throw new NotImplementedException();
    }

    @Test
    public void testCallRpcRequestWithClient() throws ClientException {
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        DescribeRegionsResponse response = this.client.getAcsResponse(request);
        Assert.assertTrue(response.getRegions().size() > 0);
    }

    @Test
    public void testCallRoaRequestWithClient() throws ClientException {
        DescribeResourcesRequest request = new DescribeResourcesRequest();
        request.setStackId("StackId");
        request.setStackName("StackName");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("StackNotFound", e.getErrCode());
        }
    }

    @Test
    public void testLocationServiceCodeNotEqualsProductCode() throws ClientException {
        DescribeApisRequest request = new DescribeApisRequest();
        DescribeApisResponse response = this.client.getAcsResponse(request);
        Assert.assertNotNull(response.getRequestId());
    }

    @Test
    public void testLocationServiceCodeNotEqualsProductCode2() throws ClientException {
        initEnv("{}");
        this.client.setEndpointResolver(endpointResolver);

        for (int i = 0; i < 3; i++) {
            DescribeApisRequest request = new DescribeApisRequest();
            this.client.getAcsResponse(request);
        }
        Assert.assertEquals(1, locationServiceEndpointResolver.locationServiceCallCounter);
        initEnv();
        this.client.setEndpointResolver(endpointResolver);
    }

    @Test
    public void testDocSample() throws ClientException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setSysEndpoint("ecs-cn-hangzhou.aliyuncs.com");
        DescribeInstancesResponse response = this.client.getAcsResponse(request);
        Assert.assertTrue(response.getInstances().size() > 0);
    }

    @Test
    public void testRkvstore() throws ClientException {
        EndpointResolver resolver = new DefaultEndpointResolver(this.client);
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-hangzhou", "R-kvstore", null, null);
        Assert.assertEquals("r-kvstore.aliyuncs.com", resolver.resolve(request));
    }

    @Test
    public void testDtsRegion() throws ClientException {
        EndpointResolver resolver = new DefaultEndpointResolver(this.client);
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-chengdu", "Dts", null, null);

        try {
            resolver.resolve(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
            Assert.assertEquals(e.getErrMsg(), "No endpoint in the region 'cn-chengdu' for product 'Dts'. \n"
                    + "You can set an endpoint for your request explicitly.\n"
                    + "Or you can use the other available regions: cn-qingdao cn-beijing cn-zhangjiakou cn-huhehaote cn-hangzhou cn-shanghai cn-shenzhen cn-hongkong ap-southeast-1\n"
                    + "See https://www.alibabacloud.com/help/zh/doc-detail/92049.htm\n");
        }
    }

    @Test
    @Ignore
    public void testSetLocationEndpoint() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-blah", accesskeyId, accesskeySecret);
        profile.enableUsingInternalLocationService();
        DefaultAcsClient client2 = new DefaultAcsClient(profile);

        DescribeInstancesRequest request = new DescribeInstancesRequest();
        try {
            client2.getAcsResponse(request);
        } catch (ClientException e) {
            Assert.assertEquals(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR, e.getErrCode());
            Assert.assertEquals("No such region 'cn-blah'. Please check your region ID.", e.getErrMsg());
        }
    }

    @Test
    public void testSetSysEndpointCompareAddEndpointPriority() throws ClientException {
        initEnv();
        this.client.setEndpointResolver(endpointResolver);
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        userCustomizedEndpointResolver.putEndpointEntry("cn-hangzhou", "ecs", "add.endpoint");
        try {
            client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertTrue(e.getErrMsg().contains("Server unreachable: java.net.UnknownHostException: add.endpoint"));
            }

        request.setSysEndpoint("request.set.error.endpoint");
        userCustomizedEndpointResolver.putEndpointEntry("cn-hangzhou", "ecs", "add.point");
        try {
            client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertTrue(e.getErrMsg().contains("Server unreachable: java.net.UnknownHostException: request.set.error.endpoint"));

        }
    }

    @Test
    public void testAddEndpointCompareUserVpcPriority() throws ClientException {
        initEnv(null, null, true, false);
        Assert.assertEquals("ecs-vpc.cn-hefei.aliyuncs.com", resolve("cn-hefei", "ecs", "ecs", null));
        userCustomizedEndpointResolver.putEndpointEntry("cn-hefei", "ecs", "test-vpc-addEndpoint");
        Assert.assertEquals("test-vpc-addEndpoint", resolve("cn-hefei", "ecs", "ecs", null));
    }

    @Test
    public void testUserVpcCompareRegionalPriority() throws ClientException {
        String testConfig = "" + "{\n" + "  \"regional_endpoints\" : {\n" + "    \"ecs\" : {\n"
                + "      \"cn-bozhou\" : \"test-regional\"\n" + "    }\n" + "  }\n" + "}";
        initEnv(testConfig);
        Assert.assertEquals("test-regional", resolve("cn-bozhou", "ecs"));
        initEnv(testConfig, null, true, false);
        Assert.assertEquals("ecs-vpc.cn-bozhou.aliyuncs.com", resolve("cn-bozhou", "ecs"));
    }

    @Test
    public void testRegionalCompareGlobalEndpointPriority() throws ClientException {
        String testConfig = "" + "{\n" + "  \"regional_endpoints\" : {\n" + "    \"ecs\" : {\n"
                + "      \"cn-hefei\" : \"regional.endpoints\"\n" + "    }\n" + "  },\n"
                + "  \"global_endpoints\" : {\n" + "    \"ecs\" : \"global.endpoints\"\n" + "  },\n"
                + "  \"regions\" : [\"cn-hangzhou\", \"cn-hefei\", \"cn-shanghai\"]\n" + "}";
        initEnv(testConfig);
        Assert.assertEquals("regional.endpoints", resolve("cn-hefei", "ecs"));
    }

    @Test
    public void testGlobalCompareLocationServiceEndpointPriority() throws ClientException {
        initEnv("{}");
        Assert.assertEquals("ecs-cn-hangzhou.aliyuncs.com", resolve("cn-hangzhou", "ecs", "ecs", null));
        Assert.assertTrue(1 == locationServiceEndpointResolver.locationServiceCallCounter);
        String testConfig = "" + "{\n\"global_endpoints\" : {\n \"ecs\" : \"global.endpoints\"\n" + "  },\n"
                + "  \"regions\" : [\"cn-hangzhou\", \"cn-hefei\", \"cn-shanghai\"]\n" + "}";
        initEnv(testConfig);
        Assert.assertEquals("global.endpoints", resolve("cn-hangzhou", "ecs", "ecs", null));
    }

}
