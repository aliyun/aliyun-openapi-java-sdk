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

public class InternalLocationServiceEndpointResolver extends LocationServiceEndpointResolver {

    private final static String INNER_LOCATION_SERVICE_ENDPOINT = "location-inner.aliyuncs.com";
    private final static String INNER_LOCATION_SERVICE_API_VERSION = "2015-12-25";

    public InternalLocationServiceEndpointResolver(DefaultAcsClient client) {
        super(client);
        this.locationServiceEndpoint = INNER_LOCATION_SERVICE_ENDPOINT;
        this.locationServiceApiVersion = INNER_LOCATION_SERVICE_API_VERSION;
    }
}
