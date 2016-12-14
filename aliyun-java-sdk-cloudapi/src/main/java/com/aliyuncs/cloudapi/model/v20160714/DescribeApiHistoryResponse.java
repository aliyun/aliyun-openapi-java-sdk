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
package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ConstantParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.OpenIdConnectConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceParameterMap;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.SystemParameter;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiHistoryResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String groupId;

	private String groupName;

	private String stageName;

	private String apiId;

	private String apiName;

	private String description;

	private String historyVersion;

	private String status;

	private String visibility;

	private String authType;

	private String resultType;

	private String resultSample;

	private String failResultSample;

	private String deployedTime;

	private List<ErrorCodeSample> errorCodeSamples;

	private List<SystemParameter> systemParameters;
	
	private List<SystemParameter> customSystemParameters;

	private List<ConstantParameter> constantParameters;

	private List<RequestParameter> requestParameters;

	private List<ServiceParameter> serviceParameters;

	private List<ServiceParameterMap> serviceParametersMap;

	private RequestConfig requestConfig;

	private ServiceConfig serviceConfig;
	
	private OpenIdConnectConfig openIdConnectConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getApiId() {
		return this.apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHistoryVersion() {
		return this.historyVersion;
	}

	public void setHistoryVersion(String historyVersion) {
		this.historyVersion = historyVersion;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getResultSample() {
		return this.resultSample;
	}

	public void setResultSample(String resultSample) {
		this.resultSample = resultSample;
	}

	public String getDeployedTime() {
		return this.deployedTime;
	}

	public void setDeployedTime(String deployedTime) {
		this.deployedTime = deployedTime;
	}

	public List<SystemParameter> getSystemParameters() {
		return this.systemParameters;
	}

	public void setSystemParameters(List<SystemParameter> systemParameters) {
		this.systemParameters = systemParameters;
	}

	public List<ConstantParameter> getConstantParameters() {
		return this.constantParameters;
	}

	public void setConstantParameters(List<ConstantParameter> constantParameters) {
		this.constantParameters = constantParameters;
	}

	public List<RequestParameter> getRequestParameters() {
		return this.requestParameters;
	}

	public void setRequestParameters(List<RequestParameter> requestParameters) {
		this.requestParameters = requestParameters;
	}

	public List<ServiceParameter> getServiceParameters() {
		return this.serviceParameters;
	}

	public void setServiceParameters(List<ServiceParameter> serviceParameters) {
		this.serviceParameters = serviceParameters;
	}

	public List<ServiceParameterMap> getServiceParametersMap() {
		return this.serviceParametersMap;
	}

	public void setServiceParametersMap(List<ServiceParameterMap> serviceParametersMap) {
		this.serviceParametersMap = serviceParametersMap;
	}

	public RequestConfig getRequestConfig() {
		return this.requestConfig;
	}

	public void setRequestConfig(RequestConfig requestConfig) {
		this.requestConfig = requestConfig;
	}

	public ServiceConfig getServiceConfig() {
		return this.serviceConfig;
	}

	public void setServiceConfig(ServiceConfig serviceConfig) {
		this.serviceConfig = serviceConfig;
	}
	
	public String getFailResultSample() {
		return failResultSample;
	}

	public void setFailResultSample(String failResultSample) {
		this.failResultSample = failResultSample;
	}

	public List<ErrorCodeSample> getErrorCodeSamples() {
		return errorCodeSamples;
	}

	public void setErrorCodeSamples(List<ErrorCodeSample> errorCodeSamples) {
		this.errorCodeSamples = errorCodeSamples;
	}
	
    public List<SystemParameter> getCustomSystemParameters() {
        return customSystemParameters;
    }

    public void setCustomSystemParameters(List<SystemParameter> customSystemParameters) {
        this.customSystemParameters = customSystemParameters;
    }

    public OpenIdConnectConfig getOpenIdConnectConfig() {
        return openIdConnectConfig;
    }

    public void setOpenIdConnectConfig(OpenIdConnectConfig openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
    }

	@Override
	public DescribeApiHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiHistoryResponseUnmarshaller.unmarshall(this, context);
	}

}
