package com.aliyuncs.endpoint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsRequest;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsResponse;
import com.aliyuncs.exceptions.ClientException;

public class LocationServiceEndpointResolverTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
    public void testInvalidRegionIdResolverException() throws ClientException {
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
        when(clientException.getErrMsg()).thenReturn("The specified region does not exist--error msg");
        doThrow(clientException).when(client).getAcsResponse(any(DescribeEndpointsRequest.class));

        thrown.expect(ClientException.class);
        thrown.equals(clientException);
        resolver.resolve(request);
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
    public void testProductCodeValidResolverException() throws ClientException {
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
        when(clientException.getErrMsg()).thenReturn("Please check the parameters--error msg");
        doThrow(clientException).when(client).getAcsResponse(any(DescribeEndpointsRequest.class));

        thrown.expect(ClientException.class);
        thrown.equals(clientException);
        resolver.resolve(request);
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
        thrown.expect(ClientException.class);
        resolver.resolve(request);
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
        List<DescribeEndpointsResponse.Endpoint> endpoints = new ArrayList<DescribeEndpointsResponse.Endpoint>();
        DescribeEndpointsResponse.Endpoint endpoint1 = getEndpoint("innerAPI", "locationServiceCode",
                "cdn.locationServiceCode.cn-xian.openAPI");
        endpoints.add(endpoint1);
        DescribeEndpointsResponse.Endpoint endpoint2 = getEndpoint("openAPI", "serviceCode",
                "cdn.locationServiceCode.cn-xian.openAPI");
        endpoints.add(endpoint2);
        DescribeEndpointsResponse.Endpoint endpoint3 = getEndpoint("innerAPI", "serviceCode",
                "cdn.locationServiceCode.cn-xian.openAPI");
        endpoints.add(endpoint3);
        DescribeEndpointsResponse.Endpoint endpoint4 = getEndpoint("openAPI", "locationServiceCode",
                "cdn.locationServiceCode.cn-xian.openAPI");
        endpoints.add(endpoint4);
        doReturn(endpoints).when(response).getEndpoints();
        assertEquals("cdn.locationServiceCode.cn-xian.openAPI", resolver.resolve(request));
        assertTrue(resolver.isRegionIdValid(request));
        assertTrue(resolver.isProductCodeValid(request));
    }

    private DescribeEndpointsResponse.Endpoint getEndpoint(String openAPI, String serivceCode, String endpoints) {
        DescribeEndpointsResponse.Endpoint endpoint = mock(DescribeEndpointsResponse.Endpoint.class);
        doReturn(openAPI).when(endpoint).getType();
        doReturn(serivceCode).when(endpoint).getSerivceCode();
        doReturn(endpoints).when(endpoint).getEndpoint();
        return endpoint;
    }

    @Test
    public void setLocationServiceEndpointTest() {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);
        resolver.setLocationServiceEndpoint("test");
        assertEquals("test", resolver.locationServiceEndpoint);
    }

    @Test
    public void testGetValidRegionIdsByProduct() {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        LocationServiceEndpointResolver resolver = new LocationServiceEndpointResolver(client);
        assertNull(resolver.getValidRegionIdsByProduct("ecs"));
    }
}
