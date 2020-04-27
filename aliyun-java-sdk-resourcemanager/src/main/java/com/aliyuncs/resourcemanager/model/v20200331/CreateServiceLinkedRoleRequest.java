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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateServiceLinkedRoleRequest extends RpcAcsRequest<CreateServiceLinkedRoleResponse> {
	   

	private String customSuffix;

	private String description;

	private String serviceName;
	public CreateServiceLinkedRoleRequest() {
		super("ResourceManager", "2020-03-31", "CreateServiceLinkedRole", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCustomSuffix() {
		return this.customSuffix;
	}

	public void setCustomSuffix(String customSuffix) {
		this.customSuffix = customSuffix;
		if(customSuffix != null){
			putQueryParameter("CustomSuffix", customSuffix);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	@Override
	public Class<CreateServiceLinkedRoleResponse> getResponseClass() {
		return CreateServiceLinkedRoleResponse.class;
	}

}
