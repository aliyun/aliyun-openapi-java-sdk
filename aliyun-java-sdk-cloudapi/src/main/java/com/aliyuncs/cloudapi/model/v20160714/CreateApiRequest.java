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

import com.alibaba.fastjson.JSON;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.*;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateApiRequest extends RpcAcsRequest<CreateApiResponse> {
	
	public CreateApiRequest() {
		super("CloudAPI", "2016-07-14", "CreateApi", "apigateway");
	}

	private String groupId;

	private String apiName;

	private String visibility;

	private String description;

	private String authType;

	private String requestConfig;

	private String serviceConfig;

	private String requestParameters;

	private String systemParameters;

	private String constantParameters;

	private String serviceParameters;

	private String serviceParametersMap;

	private String resultType;

	private String resultSample;
	
	private String failResultSample;

	private String errorCodeSamples;
	
	private String openIdConnectConfig;
	
	private String allowSignatureMethod;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		putQueryParameter("ApiName", apiName);
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
		putQueryParameter("Visibility", visibility);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
		putQueryParameter("AuthType", authType);
	}

	public String getRequestConfig() {
		return this.requestConfig;
	}

	public void setRequestConfig(String requestConfig) {
		this.requestConfig = requestConfig;
		putQueryParameter("RequestConfig", requestConfig);
	}

	public String getServiceConfig() {
		return this.serviceConfig;
	}
	
	public void setServiceConfig(String serviceConfig) {
		this.serviceConfig = serviceConfig;
		putQueryParameter("ServiceConfig", serviceConfig);
	}

	public String getRequestParameters() {
		return this.requestParameters;
	}

	public void setRequestParameters(String requestParameters) {
		this.requestParameters = requestParameters;
		putQueryParameter("RequestParameters", requestParameters);
	}

	public String getSystemParameters() {
		return this.systemParameters;
	}

	public void setSystemParameters(String systemParameters) {
		this.systemParameters = systemParameters;
		putQueryParameter("SystemParameters", systemParameters);
	}

	public String getConstantParameters() {
		return this.constantParameters;
	}

	public void setConstantParameters(String constantParameters) {
		this.constantParameters = constantParameters;
		putQueryParameter("ConstantParameters", constantParameters);
	}

	public String getServiceParameters() {
		return this.serviceParameters;
	}

	public void setServiceParameters(String serviceParameters) {
		this.serviceParameters = serviceParameters;
		putQueryParameter("ServiceParameters", serviceParameters);
	}

	public String getServiceParametersMap() {
		return this.serviceParametersMap;
	}

	public void setServiceParametersMap(String serviceParametersMap) {
		this.serviceParametersMap = serviceParametersMap;
		putQueryParameter("ServiceParametersMap", serviceParametersMap);
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
		putQueryParameter("ResultType", resultType);
	}

	public String getResultSample() {
		return this.resultSample;
	}

	public void setResultSample(String resultSample) {
		this.resultSample = resultSample;
		putQueryParameter("ResultSample", resultSample);
	}
	
	public String getFailResultSample() {
		return this.failResultSample;
	}

	public void setFailResultSample(String failResultSample) {
		this.failResultSample = failResultSample;
		putQueryParameter("FailResultSample", failResultSample);
	}

	public String getErrorCodeSamples() {
		return this.errorCodeSamples;
	}

	public void setErrorCodeSamples(String errorCodeSamples) {
		this.errorCodeSamples = errorCodeSamples;
		putQueryParameter("ErrorCodeSamples", errorCodeSamples);
	}
	
	public void setRequestConfig(RequestConfig requestConfig) {
		if (null != requestConfig) {
			setRequestConfig(JSON.toJSONString(requestConfig));
		}
	}
	
	public void setServiceConfig(ServiceConfig ServiceConfig) {
		if (null != ServiceConfig) {
			setServiceConfig(JSON.toJSONString(ServiceConfig));
		}
	}
	
	public void setRequestParameters(List<RequestParameter> list) {
		if (null != list) {
			setRequestParameters(JSON.toJSONString(list));
		}
	}
	
	public void setSystemParameters(List<SystemParameter> list) {
		if (null != list) {
			setSystemParameters(JSON.toJSONString(list));
		}
	}
	
	public void setConstantParameters(List<ConstantParameter> list) {
		if (null != list) {
			setConstantParameters(JSON.toJSONString(list));
		}
	}
	
	public void setServiceParameters(List<ServiceParameter> list) {
		if (null != list) {
			setServiceParameters(JSON.toJSONString(list));
		}
	}
	
	public void setServiceParametersMap(List<ServiceParameterMap> list) {
		if (null != list) {
			setServiceParametersMap(JSON.toJSONString(list));
		}
	}
	
	public void setErrorCodeSamples(List<ErrorCodeSample> list) {
		if (null != list) {
			setErrorCodeSamples(JSON.toJSONString(list));
		}
	}
	
	public void setOpenIdConnectConfig(OpenIdConnectConfig openIdConnectConfig) {
	    if (null != openIdConnectConfig) {
	        setOpenIdConnectConfig(JSON.toJSONString(openIdConnectConfig));
	    }
	}

    public String getOpenIdConnectConfig() {
        return openIdConnectConfig;
    }

    public void setOpenIdConnectConfig(String openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        putQueryParameter("OpenIdConnectConfig", openIdConnectConfig);
    }

    public String getAllowSignatureMethod() {
        return allowSignatureMethod;
    }

    public void setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        putQueryParameter("AllowSignatureMethod", allowSignatureMethod);
    }

    @Override
	public Class<CreateApiResponse> getResponseClass() {
		return CreateApiResponse.class;
	}

}
