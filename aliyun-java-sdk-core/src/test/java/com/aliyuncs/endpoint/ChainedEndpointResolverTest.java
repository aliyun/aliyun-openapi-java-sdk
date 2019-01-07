package com.aliyuncs.endpoint;

import com.aliyuncs.exceptions.ClientException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ChainedEndpointResolverTest {

    @Test
    public void testChainedEndpointResolver() throws ClientException {

        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        request.regionId = "cn-hangzhou";
        request.productCode = "productCode";

        LocalConfigGlobalEndpointResolver resolver1 = mock(LocalConfigGlobalEndpointResolver.class);
        LocalConfigGlobalEndpointResolver resolver2 = mock(LocalConfigGlobalEndpointResolver.class);
        List<EndpointResolverBase> resolverChain = new ArrayList<EndpointResolverBase>();
        resolverChain.add(resolver1);
        resolverChain.add(resolver2);
        ChainedEndpointResolver resolver = new ChainedEndpointResolver(resolverChain);

        when(resolver1.resolve(request)).thenReturn(null);
        when(resolver2.resolve(request)).thenReturn("String");
        assertEquals("String", resolver.resolve(request));

        when(resolver2.resolve(request)).thenReturn(null);
        when(resolver1.isProductCodeValid(request)).thenReturn(false);
        when(resolver2.isProductCodeValid(request)).thenReturn(false);
        try {
            resolver.resolve(request);
        } catch (Exception e) {
            assertTrue(e instanceof ClientException);
        }
        when(resolver1.isProductCodeValid(request)).thenReturn(true);
        when(resolver1.isRegionIdValid(request)).thenReturn(false);
        when(resolver2.isRegionIdValid(request)).thenReturn(false);
        try {
            resolver.resolve(request);
        } catch (Exception e) {
            assertTrue(e instanceof ClientException);
        }

        when(resolver1.isProductCodeValid(request)).thenReturn(true);
        when(resolver1.isRegionIdValid(request)).thenReturn(true);
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("string1");
        when(resolver1.getValidRegionIdsByProduct(request.productCode)).thenReturn(null);
        when(resolver2.getValidRegionIdsByProduct(request.productCode)).thenReturn(hashSet);
        try {
            resolver.resolve(request);
        } catch (Exception e) {
            assertTrue(e instanceof ClientException);
        }

        when(resolver2.getValidRegionIdsByProduct(request.productCode)).thenReturn(null);
        try {
            resolver.resolve(request);
        } catch (Exception e) {
            assertTrue(e instanceof ClientException);
        }
    }

}
