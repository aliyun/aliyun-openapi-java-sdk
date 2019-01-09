package com.aliyuncs.endpoint;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsRequest;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LocationServiceEndpointResolverTest {

    @Test
    public void testResolverLocationServiceCode() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);
        assertNull(resolver.resolve(request));

        request.locationServiceCode = "";
        assertNull(resolver.resolve(request));
    }

    @Test
    public void testIsRegionIdValid() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);

        assertFalse(resolver.isRegionIdValid(request));

        request.locationServiceCode = "locationServiceCode";
        request.regionId = "cn-hangzhou";
        assertTrue(resolver.isRegionIdValid(request));
    }

    @Test
    public void testIsProductCodeValid() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);

        assertFalse(resolver.isProductCodeValid(request));
        request.locationServiceCode = "locationServiceCode";
        request.productCodeLower = "ecs";
        assertTrue(resolver.isProductCodeValid(request));
    }

    @Test
    public void testInvalidRegionIdResolver() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);

        request.regionId = "cn-hangzhou";
        request.productCode = "oss";
        request.productCodeLower = "oss";
        request.endpointType = "openAPI";
        request.locationServiceCode = "locationServiceCode";

        ClientException clientException = mock(ClientException.class);
        when(clientException.getErrCode()).thenReturn("InvalidRegionId");
        when(clientException.getErrMsg()).thenReturn("The specified region does not exist.");
        doThrow(clientException).when(client).getAcsResponse(any(DescribeEndpointsRequest.class));

        assertTrue(resolver.isRegionIdValid(request));
        assertNull(resolver.resolve(request));
        assertNull(resolver.resolve(request));
        assertFalse(resolver.isRegionIdValid(request));
    }

    @Test
    public void testIsProductCodeValidResolver() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);

        request.regionId = "cn-hangzhou";
        request.productCode = "oss";
        request.productCodeLower = "oss";
        request.endpointType = "openAPI";
        request.locationServiceCode = "locationServiceCode";

        ClientException clientException = mock(ClientException.class);
        when(clientException.getErrCode()).thenReturn("Illegal Parameter");
        when(clientException.getErrMsg()).thenReturn("Please check the parameters");
        doThrow(clientException).when(client).getAcsResponse(any(DescribeEndpointsRequest.class));
        assertTrue(resolver.isProductCodeValid(request));
        assertNull(resolver.resolve(request));
        assertNull(resolver.resolve(request));
        assertFalse(resolver.isProductCodeValid(request));
    }

    @Test
    public void testResolverException() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);

        request.regionId = "cn-hangzhou";
        request.productCode = "oss";
        request.productCodeLower = "oss";
        request.endpointType = "openAPI";
        request.locationServiceCode = "locationServiceCode";

        ClientException clientException3 = mock(ClientException.class);
        when(clientException3.getErrCode()).thenReturn("Illegal");
        doThrow(clientException3).when(client).getAcsResponse(any(DescribeEndpointsRequest.class));
        try {
            resolver.resolve(request);
        } catch (Exception e) {
            assertTrue(e instanceof ClientException);
        }
    }

    @Test
    public void testResolverResponse() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);
        request.regionId = "cn-hangzhou";
        request.productCode = "oss";
        request.productCodeLower = "oss";
        request.endpointType = "openAPI";
        request.locationServiceCode = "locationServiceCode";

        DescribeEndpointsResponse response = mock(DescribeEndpointsResponse.class);
        doReturn(response).when(client).getAcsResponse(any(DescribeEndpointsRequest.class));
        DescribeEndpointsResponse.Endpoint endpoint = mock(DescribeEndpointsResponse.Endpoint.class);
        doReturn("openAPI").when(endpoint).getType();
        doReturn("locationServiceCode").when(endpoint).getSerivceCode();
        doReturn("cdn.locationServiceCode.cn-xian.openAPI").when(endpoint).getEndpoint();
        List<DescribeEndpointsResponse.Endpoint> endpoints = new ArrayList<DescribeEndpointsResponse.Endpoint>();
        endpoints.add(endpoint);
        doReturn(endpoints).when(response).getEndpoints();

        assertEquals("cdn.locationServiceCode.cn-xian.openAPI", resolver.resolve(request));
        assertEquals("cdn.locationServiceCode.cn-xian.openAPI", resolver.resolve(request));
        assertTrue(resolver.isRegionIdValid(request));
        assertTrue(resolver.isProductCodeValid(request));

        doReturn("serviceCode").when(endpoint).getSerivceCode();
        request.regionId = "cn-shanghai";
        request.productCode = "cds";
        request.productCodeLower = "cds";
        assertNull(resolver.resolve(request));
    }

    @Test
    public void setLocationServiceEndpointTest(){
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);
        resolver.setLocationServiceEndpoint("test");
        assertEquals("test", resolver.locationServiceEndpoint);
    }
}
