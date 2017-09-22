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
package com.aliyuncs.profile;

import java.util.List;

import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.regions.Endpoint;

public interface IClientProfile {

    public ISigner getSigner();

    public String getRegionId();

    public FormatType getFormat();

    @Deprecated
    public Credential getCredential();

    public void setLocationConfig(String regionId, String product, String endpoint);

    public List<Endpoint> getEndpoints() throws ClientException;

    public List<Endpoint> getEndpoints(String regionId, String product) throws ClientException;

    public List<Endpoint> getEndpoints(String product, String regionId, String serviceCode, String endpointType)
        throws ClientException;

    /**
     * This method exists because ClientProfile holds too much modules like endpoint management
     * @param credentialsProvider
     */
    public void setCredentialsProvider(AlibabaCloudCredentialsProvider credentialsProvider);
}
