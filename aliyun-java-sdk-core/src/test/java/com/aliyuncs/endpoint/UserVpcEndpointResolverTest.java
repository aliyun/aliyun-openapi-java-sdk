package com.aliyuncs.endpoint;

import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class UserVpcEndpointResolverTest {
    UserVpcEndpointResolver resolver;
    ResolveEndpointRequest request;

    @Before
    public void initObject(){
        resolver = new UserVpcEndpointResolver();
    }

    @Test
    public void isRegionIdValidTest(){
        request = mock(ResolveEndpointRequest.class);
        Assert.assertFalse(resolver.isRegionIdValid(request));

        request.regionId = "test";
        Assert.assertTrue(resolver.isRegionIdValid(request));
    }

    @Test
    public void isProductCodeValidTest(){
        request = mock(ResolveEndpointRequest.class);
        Assert.assertFalse(resolver.isProductCodeValid(request));

        request.productCode = "test";
        Assert.assertTrue(resolver.isProductCodeValid(request));
    }

    @Test
    public void makeEndpointKeyTest(){
        Assert.assertNull(resolver.makeEndpointKey(request));
    }

    @Test
    public void resolveTest() throws ClientException {
        request = new ResolveEndpointRequest("tesT", "TeSt",
                null, null);
        Assert.assertEquals("test-vpc.test.aliyuncs.com", resolver.resolve(request));
    }
}
