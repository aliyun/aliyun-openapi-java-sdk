/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppServiceDetailRequest extends RoaAcsRequest<DescribeAppServiceDetailResponse> {
	   

	private String serviceType;

	private String nacosNamespaceId;

	private String appId;

	private String nacosInstanceId;

	private String serviceVersion;

	private String serviceName;

	private String serviceGroup;
	public DescribeAppServiceDetailRequest() {
		super("sae", "2019-05-06", "DescribeAppServiceDetail", "serverless");
		setUriPattern("/pop/v1/sam/service/describeAppServiceDetail");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType);
		}
	}

	public String getNacosNamespaceId() {
		return this.nacosNamespaceId;
	}

	public void setNacosNamespaceId(String nacosNamespaceId) {
		this.nacosNamespaceId = nacosNamespaceId;
		if(nacosNamespaceId != null){
			putQueryParameter("NacosNamespaceId", nacosNamespaceId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getNacosInstanceId() {
		return this.nacosInstanceId;
	}

	public void setNacosInstanceId(String nacosInstanceId) {
		this.nacosInstanceId = nacosInstanceId;
		if(nacosInstanceId != null){
			putQueryParameter("NacosInstanceId", nacosInstanceId);
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getServiceGroup() {
		return this.serviceGroup;
	}

	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
		if(serviceGroup != null){
			putQueryParameter("ServiceGroup", serviceGroup);
		}
	}

	@Override
	public Class<DescribeAppServiceDetailResponse> getResponseClass() {
		return DescribeAppServiceDetailResponse.class;
	}

}
