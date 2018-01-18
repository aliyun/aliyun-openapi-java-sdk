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

import java.util.ArrayList;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyApiRequest extends RpcAcsRequest<ModifyApiResponse> {
	
	public ModifyApiRequest() {
		super("CloudAPI", "2016-07-14", "ModifyApi", "apigateway");
	}

	private String groupId;

	private String apiId;

	private String apiName;

	private String description;

	private String visibility;

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

	public String getApiId() {
		return this.apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
		putQueryParameter("ApiId", apiId);
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		putQueryParameter("ApiName", apiName);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
		putQueryParameter("Visibility", visibility);
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
		return failResultSample;
	}

	public void setFailResultSample(String failResultSample) {
		this.failResultSample = failResultSample;
		putQueryParameter("FailResultSample", failResultSample);
	}

	public String getErrorCodeSamples() {
		return errorCodeSamples;
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
	
	
	public void putRequestParameter(RequestParameter requestParameter) {
		List<RequestParameter> list = new ArrayList<RequestParameter>();
		if (null != this.requestParameters) {
			list = JSON.parseArray(this.requestParameters, RequestParameter.class);
			if (null != list) {
				for(RequestParameter rp : list) {
					if (rp.getApiParameterName().equals(requestParameter.getApiParameterName())) {
						list.remove(rp);
						break;
					}
				}
			} else {
				list = new ArrayList<RequestParameter>();
			}
		}
		list.add(requestParameter);
		setRequestParameters(list);
	}
	
	public void removeRequestParameter(String apiParameterName) {
		if (null != this.requestParameters) {
			List<RequestParameter> list = JSON.parseArray(this.requestParameters, RequestParameter.class);
			if (null != list) {
				for(RequestParameter rp : list) {
					if (null != rp.getApiParameterName()) {
						if (rp.getApiParameterName().equals(apiParameterName)) {
							list.remove(rp);
							break;
						}
					}
				}
				if (0 < list.size()) {
					setRequestParameters(list);
				} else {
					setRequestParameters((String)null);
				}
			}
		}
	}
	
	public void setSystemParameters(List<SystemParameter> list) {
		if (null != list) {
			setSystemParameters(JSON.toJSONString(list));
		}
	}
	
	public void putSystemParameter(SystemParameter systemParameter) {
		List<SystemParameter> list = new ArrayList<SystemParameter>();
		if (null != this.systemParameters) {
			list = JSON.parseArray(this.systemParameters, SystemParameter.class);
			if (null != list) {
				for(SystemParameter sp : list) {
					if (sp.getParameterName().equals(systemParameter.getParameterName())) {
						list.remove(sp);
						break;
					}
				}
			} else {
				list = new ArrayList<SystemParameter>();
			}
		}
		list.add(systemParameter);
		setSystemParameters(list);
	}
	
	public void removeSystemParameter(String parameterName) {
		if (null != this.systemParameters) {
			List<SystemParameter> list = JSON.parseArray(this.systemParameters, SystemParameter.class);
			if (null != list) {
				for(SystemParameter sp : list) {
					if (null != sp.getParameterName()) {
						if (sp.getParameterName().equals(parameterName)) {
							list.remove(sp);
							break;
						}
					}
				}
				if (0 < list.size()) {
					setSystemParameters(list);
				} else {
					setSystemParameters((String)null);
				}
			}
		}
	}
		
	public void setConstantParameters(List<ConstantParameter> list) {
		if (null != list) {
			setConstantParameters(JSON.toJSONString(list));
		}
	}

	public void putConstantParameter(ConstantParameter constantParameter) {
		List<ConstantParameter> list = new ArrayList<ConstantParameter>();
		if (null != this.constantParameters) {
			list = JSON.parseArray(this.constantParameters, ConstantParameter.class);
			if (null != list) {
				for(ConstantParameter cp : list) {
					if (cp.getServiceParameterName().equals(constantParameter.getServiceParameterName())) {
						list.remove(cp);
						break;
					}
				}
			} else {
				list = new ArrayList<ConstantParameter>();
			}
		}
		list.add(constantParameter);
		setConstantParameters(list);
	}
	
	public void removeConstantParameter(String serviceParameterName) {
		if (null != this.constantParameters) {
			List<ConstantParameter> list = JSON.parseArray(this.constantParameters, ConstantParameter.class);
			if (null != list) {
				for(ConstantParameter cp : list) {
					if (null != cp.getServiceParameterName()) {
						if (cp.getServiceParameterName().equals(serviceParameterName)) {
							list.remove(cp);
							break;
						}
					}
				}
				if (0 < list.size()) {
					setConstantParameters(list);
				} else {
					setConstantParameters((String)null);
				}
			}
		}
	}
	
	
	public void setServiceParameters(List<ServiceParameter> list) {
		if (null != list) {
			setServiceParameters(JSON.toJSONString(list));
		}
	}
	

	public void putServiceParameter(ServiceParameter serviceParameter) {
		List<ServiceParameter> list = new ArrayList<ServiceParameter>();
		if (null != this.serviceParameters) {
			list = JSON.parseArray(this.serviceParameters, ServiceParameter.class);
			if (null != list) {
				for(ServiceParameter sp : list) {
					if (sp.getServiceParameterName().equals(serviceParameter.getServiceParameterName())) {
						list.remove(sp);
						break;
					}
				}
			} else {
				list = new ArrayList<ServiceParameter>();
			}
		}
		list.add(serviceParameter);
		setServiceParameters(list);
	}
	
	public void removeServiceParameter(String serviceParameterName) {
		if (null != this.serviceParameters) {
			List<ServiceParameter> list = JSON.parseArray(this.serviceParameters, ServiceParameter.class);
			if (null != list) {
				for(ServiceParameter sp : list) {
					if (null != sp.getServiceParameterName()) {
						if (sp.getServiceParameterName().equals(serviceParameterName)) {
							list.remove(sp);
							break;
						}
					}
				}
				if (0 < list.size()) {
					setServiceParameters(list);
				} else {
					setServiceParameters((String)null);
				}
			}
		}
	}
	
	
	public void setServiceParametersMap(List<ServiceParameterMap> list) {
		if (null != list) {
			setServiceParametersMap(JSON.toJSONString(list));
		}
	}
	
	public void putServiceParametersMap(ServiceParameterMap serviceParameterMap) {
		List<ServiceParameterMap> list = new ArrayList<ServiceParameterMap>();
		if (null != this.serviceParametersMap) {
			list = JSON.parseArray(this.serviceParametersMap, ServiceParameterMap.class);
			if (null != list) {
				for(ServiceParameterMap sp : list) {
					if (sp.getRequestParameterName().equals(serviceParameterMap.getRequestParameterName()) && 
						sp.getServiceParameterName().equals(serviceParameterMap.getServiceParameterName())) {
						list.remove(sp);
						break;
					}
				}
			} else {
				list = new ArrayList<ServiceParameterMap>();
			}
		}
		list.add(serviceParameterMap);
		setServiceParametersMap(list);
	}
	
	public void removeServiceParametersMap(String requestParameterName, String serviceParameterName) {
		if (null != this.serviceParametersMap) {
			List<ServiceParameterMap> list = JSON.parseArray(this.serviceParametersMap, ServiceParameterMap.class);
			if (null != list) {
				for(ServiceParameterMap sp : list) {
					if (null != sp.getRequestParameterName() && null != sp.getServiceParameterName()) {
						if (sp.getRequestParameterName().equals(requestParameterName) && 
								sp.getServiceParameterName().equals(serviceParameterName)) {
							list.remove(sp);
							break;
						}
					}
				}
				if (0 < list.size()) {
					setServiceParametersMap(list);
				} else {
					setServiceParametersMap((String)null);
				}
			}
		}
	}
	
	public void setErrorCodeSamples(List<ErrorCodeSample> list) {
		if (null != list) {
			setErrorCodeSamples(JSON.toJSONString(list));
		}
	}
	
	public void putErrorCodeSample(ErrorCodeSample errorCodeSample) {
		List<ErrorCodeSample> list = new ArrayList<ErrorCodeSample>();
		if (null != this.errorCodeSamples) {
			list = JSON.parseArray(this.errorCodeSamples, ErrorCodeSample.class);
			if (null != list) {
				for(ErrorCodeSample es : list) {
					if (es.getCode().equals(errorCodeSample.getCode())) {
						list.remove(es);
						break;
					}
				}
			} else {
				list = new ArrayList<ErrorCodeSample>();
			}
		}
		list.add(errorCodeSample);
		setErrorCodeSamples(list);
	}
	
	public void removeErrorCodeSample(String errCode) {
		if (null != this.errorCodeSamples) {
			List<ErrorCodeSample> list = JSON.parseArray(this.errorCodeSamples, ErrorCodeSample.class);
			if (null != list) {
				for(ErrorCodeSample es : list) {
					if (null != es.getCode()) {
						if (es.getCode().equals(errCode)) {
							list.remove(es);
							break;
						}
					}
				}
				if (0 < list.size()) {
					setErrorCodeSamples(list);
				} else {
					setErrorCodeSamples((String)null);
				}
			}
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
	public Class<ModifyApiResponse> getResponseClass() {
		return ModifyApiResponse.class;
	}

}
