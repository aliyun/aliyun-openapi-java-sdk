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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class DescribeApiResponse extends AcsResponse {

    private String                    requestId;

    private String                    regionId;

    private String                    apiId;

    private String                    apiName;

    private String                    groupId;

    private String                    groupName;

    private String                    visibility;

    private String                    authType;

    private String                    resultType;

    private String                    resultSample;

    private String                    failResultSample;

    private String                    createdTime;

    private String                    modifiedTime;

    private String                    description;

    private List<SystemParameter>     systemParameters;

    private List<SystemParameter>     customSystemParameters;

    private List<ConstantParameter>   constantParameters;

    private List<RequestParameter>    requestParameters;

    private List<ServiceParameter>    serviceParameters;

    private List<ServiceParameterMap> serviceParametersMap;

    private List<ErrorCodeSample>     errorCodeSamples;

    private List<DeployedInfo>        deployedInfos;

    private RequestConfig             requestConfig;

    private ServiceConfig             serviceConfig;

    private OpenIdConnectConfig       openIdConnectConfig;

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

    public String getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SystemParameter> getSystemParameters() {
        return this.systemParameters;
    }

    public void setSystemParameters(List<SystemParameter> systemParameters) {
        this.systemParameters = systemParameters;
    }

    public List<SystemParameter> getCustomSystemParameters() {
        return customSystemParameters;
    }

    public void setCustomSystemParameters(List<SystemParameter> customSystemParameters) {
        this.customSystemParameters = customSystemParameters;
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

    public List<DeployedInfo> getDeployedInfos() {
        return this.deployedInfos;
    }

    public void setDeployedInfos(List<DeployedInfo> deployedInfos) {
        this.deployedInfos = deployedInfos;
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

    public OpenIdConnectConfig getOpenIdConnectConfig() {
        return openIdConnectConfig;
    }

    public void setOpenIdConnectConfig(OpenIdConnectConfig openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
    }

    public static class SystemParameter {

        private String parameterName;

        private String serviceParameterName;

        private String location;

        private String demoValue;

        private String description;

        public String getParameterName() {
            return this.parameterName;
        }

        public void setParameterName(String parameterName) {
            this.parameterName = parameterName;
        }

        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public void setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
        }

        public String getLocation() {
            return this.location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDemoValue() {
            return this.demoValue;
        }

        public void setDemoValue(String demoValue) {
            this.demoValue = demoValue;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class ConstantParameter {

        private String serviceParameterName;

        private String constantValue;

        private String location;

        private String description;

        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public void setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
        }

        public String getConstantValue() {
            return this.constantValue;
        }

        public void setConstantValue(String constantValue) {
            this.constantValue = constantValue;
        }

        public String getLocation() {
            return this.location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class RequestParameter {

        private String  apiParameterName;

        private String  location;

        private String  parameterType;

        private String  required;

        private String  defaultValue;

        private String  demoValue;

        private Long    maxValue;

        private Long    minValue;

        private Long    maxLength;

        private Long    minLength;

        private String  regularExpression;

        private String  jsonScheme;

        private String  enumValue;

        private String  docShow;

        private Integer docOrder;

        private String  description;

        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public void setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
        }

        public String getLocation() {
            return this.location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getParameterType() {
            return this.parameterType;
        }

        public void setParameterType(String parameterType) {
            this.parameterType = parameterType;
        }

        public String getRequired() {
            return this.required;
        }

        public void setRequired(String required) {
            this.required = required;
        }

        public String getDefaultValue() {
            return this.defaultValue;
        }

        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        public String getDemoValue() {
            return this.demoValue;
        }

        public void setDemoValue(String demoValue) {
            this.demoValue = demoValue;
        }

        public Long getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
        }

        public Long getMinValue() {
            return this.minValue;
        }

        public void setMinValue(Long minValue) {
            this.minValue = minValue;
        }

        public Long getMaxLength() {
            return this.maxLength;
        }

        public void setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
        }

        public Long getMinLength() {
            return this.minLength;
        }

        public void setMinLength(Long minLength) {
            this.minLength = minLength;
        }

        public String getRegularExpression() {
            return this.regularExpression;
        }

        public void setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
        }

        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public void setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
        }

        public String getEnumValue() {
            return this.enumValue;
        }

        public void setEnumValue(String enumValue) {
            this.enumValue = enumValue;
        }

        public String getDocShow() {
            return this.docShow;
        }

        public void setDocShow(String docShow) {
            this.docShow = docShow;
        }

        public Integer getDocOrder() {
            return this.docOrder;
        }

        public void setDocOrder(Integer docOrder) {
            this.docOrder = docOrder;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class ServiceParameter {

        private String serviceParameterName;

        private String location;

        private String parameterType;

        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public void setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
        }

        public String getLocation() {
            return this.location.toUpperCase();
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getParameterType() {
            return this.parameterType;
        }

        public void setParameterType(String parameterType) {
            this.parameterType = parameterType;
        }
    }

    public static class ServiceParameterMap {

        private String serviceParameterName;

        private String requestParameterName;

        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

        public void setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
        }

        public String getRequestParameterName() {
            return this.requestParameterName;
        }

        public void setRequestParameterName(String requestParameterName) {
            this.requestParameterName = requestParameterName;
        }
    }

    public static class DeployedInfo {

        private String stageName;

        private String effectiveVersion;

        private String deployedStatus;

        public String getStageName() {
            return this.stageName;
        }

        public void setStageName(String stageName) {
            this.stageName = stageName;
        }

        public String getEffectiveVersion() {
            return this.effectiveVersion;
        }

        public void setEffectiveVersion(String effectiveVersion) {
            this.effectiveVersion = effectiveVersion;
        }

        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        public void setDeployedStatus(String deployedStatus) {
            this.deployedStatus = deployedStatus;
        }
    }

    public static class ErrorCodeSample {

        private String code;

        private String message;

        private String description;

        public String getCode() {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class RequestConfig {

        private String requestProtocol;

        private String requestHttpMethod;

        private String requestPath;

        private String bodyFormat;

        private String postBodyDescription;

        public String getRequestProtocol() {
            return this.requestProtocol;
        }

        public void setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
        }

        public String getRequestHttpMethod() {
            return this.requestHttpMethod;
        }

        public void setRequestHttpMethod(String requestHttpMethod) {
            this.requestHttpMethod = requestHttpMethod;
        }

        public String getRequestPath() {
            return this.requestPath;
        }

        public void setRequestPath(String requestPath) {
            this.requestPath = requestPath;
        }

        public String getBodyFormat() {
            return this.bodyFormat;
        }

        public void setBodyFormat(String bodyFormat) {
            this.bodyFormat = bodyFormat;
        }

        public String getPostBodyDescription() {
            return this.postBodyDescription;
        }

        public void setPostBodyDescription(String postBodyDescription) {
            this.postBodyDescription = postBodyDescription;
        }
    }

    public static class ServiceConfig {

        private String    serviceProtocol;

        private String    serviceAddress;

        private String    serviceHttpMethod;

        private String    servicePath;

        private Integer   serviceTimeout;

        private String    mock;

        private String    mockResult;

        private boolean   serviceVpcEnable = false;

        private VpcConfig vpcConfig;

        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public void setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
        }

        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public void setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
        }

        public String getServiceHttpMethod() {
            return this.serviceHttpMethod;
        }

        public void setServiceHttpMethod(String serviceHttpMethod) {
            this.serviceHttpMethod = serviceHttpMethod;
        }

        public String getServicePath() {
            return this.servicePath;
        }

        public void setServicePath(String servicePath) {
            this.servicePath = servicePath;
        }

        public Integer getServiceTimeout() {
            return this.serviceTimeout;
        }

        public void setServiceTimeout(Integer serviceTimeout) {
            this.serviceTimeout = serviceTimeout;
        }

        public String getMock() {
            return mock;
        }

        public void setMock(String mock) {
            this.mock = mock;
        }

        public String getMockResult() {
            return mockResult;
        }

        public void setMockResult(String mockResult) {
            this.mockResult = mockResult;
        }
        
        public VpcConfig getVpcConfig() {
            return vpcConfig;
        }

        public void setVpcConfig(VpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
        }

        public boolean isServiceVpcEnable() {
            return serviceVpcEnable;
        }

        public void setServiceVpcEnable(boolean serviceVpcEnable) {
            this.serviceVpcEnable = serviceVpcEnable;
        }
    }

    public static class OpenIdConnectConfig {
        private String openIdApiType;

        private String idTokenParamName;

        private String publicKeyId;

        private String publicKey;

        public String getOpenIdApiType() {
            return openIdApiType;
        }

        public void setOpenIdApiType(String openIdApiType) {
            this.openIdApiType = openIdApiType;
        }

        public String getIdTokenParamName() {
            return idTokenParamName;
        }

        public void setIdTokenParamName(String idTokenParamName) {
            this.idTokenParamName = idTokenParamName;
        }

        public String getPublicKeyId() {
            return publicKeyId;
        }

        public void setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
        }

        public String getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }
    }

    public static class VpcConfig {

        private String  vpcId;

        private String  instanceId;

        private Integer port;

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

    }

    @Override
    public DescribeApiResponse getInstance(UnmarshallerContext context) {
        return DescribeApiResponseUnmarshaller.unmarshall(this, context);
    }

}
