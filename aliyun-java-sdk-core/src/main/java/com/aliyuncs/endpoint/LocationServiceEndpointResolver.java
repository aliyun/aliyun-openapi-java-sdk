/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.endpoint;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsRequest;

import java.util.HashSet;
import java.util.Set;

public class LocationServiceEndpointResolver extends EndpointResolverBase {

    private final static String DEFAULT_LOCATION_SERVICE_ENDPOINT = "location-readonly.aliyuncs.com";
    private final static String DEFAULT_LOCATION_SERVICE_API_VERSION = "2015-06-12";

    private DefaultAcsClient client;
    private Set<String> invalidProductCodes;
    private Set<String> validProductCodes;
    private Set<String> invalidRegionIds;
    private Set<String> validRegionIds;
    protected String locationServiceEndpoint = DEFAULT_LOCATION_SERVICE_ENDPOINT;
    protected String locationServiceApiVersion = DEFAULT_LOCATION_SERVICE_API_VERSION;

    public int locationServiceCallCounter = 0; // For test use

    public LocationServiceEndpointResolver(DefaultAcsClient client) {
        this.client = client;
        invalidProductCodes = new HashSet<String>();
        invalidRegionIds = new HashSet<String>();
        validProductCodes = new HashSet<String>();
        validRegionIds = new HashSet<String>();
    }

    public void setLocationServiceEndpoint(String endpoint) {
        locationServiceEndpoint = endpoint;
    }

    public String resolve(ResolveEndpointRequest request) throws ClientException {
        if (request.locationServiceCode == null || request.locationServiceCode.length() == 0) {
            return null;
        }

        if (invalidProductCodes.contains(request.productCodeLower)) {
            return null;
        }

        if (invalidRegionIds.contains(request.regionId)) {
            return null;
        }

        String key = makeEndpointKey(request);
        if (endpointsData.containsKey(key)) {
            // The endpoint can be null when last fetch is failed
            return endpointsData.get(key);
        }
        return getEndpointFromLocationService(key, request);
    }

    synchronized private String getEndpointFromLocationService(String key, ResolveEndpointRequest request)
            throws ClientException {
        if (endpointsData.containsKey(key)) {
            return endpointsData.get(key);
        }

        callLocationService(key, request);
        locationServiceCallCounter += 1;

        if (endpointsData.containsKey(key)) {
            return endpointsData.get(key);
        }

        return null;
    }

    private void callLocationService(String key, ResolveEndpointRequest request) throws ClientException {
        DescribeEndpointsRequest describeEndpointsRequest = new DescribeEndpointsRequest();
        describeEndpointsRequest.setProtocol(ProtocolType.HTTPS);
        describeEndpointsRequest.setAcceptFormat(FormatType.JSON);
        describeEndpointsRequest.setId(request.regionId);
        describeEndpointsRequest.setServiceCode(request.locationServiceCode);
        describeEndpointsRequest.setType(request.endpointType);
        describeEndpointsRequest.setEndpoint(locationServiceEndpoint);
        describeEndpointsRequest.setVersion(locationServiceApiVersion);

        DescribeEndpointsResponse response;
        try {
            response = client.getAcsResponse(describeEndpointsRequest);
        } catch (ClientException e) {
            if ("InvalidRegionId".equals(e.getErrCode())
                    && "The specified region does not exist.".equals(e.getErrMsg())) {
                // No such region
                invalidRegionIds.add(request.regionId);
                putEndpointEntry(key, null);
                return;
            } else if ("Illegal Parameter".equals(e.getErrCode())
                    && "Please check the parameters".equals(e.getErrMsg())) {
                // No such product
                invalidProductCodes.add(request.productCodeLower);
                putEndpointEntry(key, null);
                return;
            } else {
                throw e;
            }
        }

        // As long as code gets here
        // the product code and the region id is valid
        // the endpoint can be still not found
        validProductCodes.add(request.productCodeLower);
        validRegionIds.add(request.regionId);


        boolean foundFlag = false;
        for (DescribeEndpointsResponse.Endpoint endpoint : response.getEndpoints()) {
            if (endpoint.getSerivceCode().equals(request.locationServiceCode)
                    && endpoint.getType().equals(request.endpointType)) {
                foundFlag = true;
                putEndpointEntry(key, endpoint.getEndpoint());
                break;
            }
        }

        if (!foundFlag) {
            putEndpointEntry(key, null);
        }
    }

    @Override
    public boolean isProductCodeValid(ResolveEndpointRequest request) {
        if (request.locationServiceCode != null) {
            return !invalidProductCodes.contains(request.productCodeLower);
        }
        return false;
    }

    @Override
    public boolean isRegionIdValid(ResolveEndpointRequest request) {
        if (request.locationServiceCode != null) {
            return !invalidRegionIds.contains(request.regionId);
        }
        return false;
    }

    public String makeEndpointKey(ResolveEndpointRequest request) {
        return makeEndpointKey(
                request.productCode, request.locationServiceCode,
                request.regionId, request.endpointType
        );
    }

    public String makeEndpointKey(String productCode, String locationServiceCode, String regionId,
                                  String endpointType) {
        return productCode.toLowerCase() + "." + locationServiceCode + "."
                + regionId.toLowerCase() + "." + endpointType;
    }
}
