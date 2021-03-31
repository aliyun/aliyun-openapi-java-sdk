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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddServiceTimeConfigRequest extends RoaAcsRequest<AddServiceTimeConfigResponse> {
	   

	private String path;

	private String serviceType;

	private String consumerAppId;

	private String appId;

	private String serviceVersion;

	private String namespace;

	private String serviceName;

	private String source;

	private String region;

	private String serviceGroup;

	private String consumerAppName;

	private String timeout;
	public AddServiceTimeConfigRequest() {
		super("Edas", "2017-08-01", "AddServiceTimeConfig", "Edas");
		setUriPattern("/pop/sp/api/timeout/add");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("Path", path);
		}
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

	public String getConsumerAppId() {
		return this.consumerAppId;
	}

	public void setConsumerAppId(String consumerAppId) {
		this.consumerAppId = consumerAppId;
		if(consumerAppId != null){
			putQueryParameter("ConsumerAppId", consumerAppId);
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

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
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

	public String getConsumerAppName() {
		return this.consumerAppName;
	}

	public void setConsumerAppName(String consumerAppName) {
		this.consumerAppName = consumerAppName;
		if(consumerAppName != null){
			putQueryParameter("ConsumerAppName", consumerAppName);
		}
	}

	public String getTimeout() {
		return this.timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout);
		}
	}

	@Override
	public Class<AddServiceTimeConfigResponse> getResponseClass() {
		return AddServiceTimeConfigResponse.class;
	}

}
