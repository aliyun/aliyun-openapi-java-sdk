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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBasicEndpointGroupRequest extends RpcAcsRequest<CreateBasicEndpointGroupResponse> {
	   

	private String clientToken;

	private String description;

	private String endpointAddress;

	private String endpointGroupRegion;

	private String endpointType;

	private String name;

	private String acceleratorId;

	private String endpointSubAddress;
	public CreateBasicEndpointGroupRequest() {
		super("Ga", "2019-11-20", "CreateBasicEndpointGroup", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getEndpointAddress() {
		return this.endpointAddress;
	}

	public void setEndpointAddress(String endpointAddress) {
		this.endpointAddress = endpointAddress;
		if(endpointAddress != null){
			putQueryParameter("EndpointAddress", endpointAddress);
		}
	}

	public String getEndpointGroupRegion() {
		return this.endpointGroupRegion;
	}

	public void setEndpointGroupRegion(String endpointGroupRegion) {
		this.endpointGroupRegion = endpointGroupRegion;
		if(endpointGroupRegion != null){
			putQueryParameter("EndpointGroupRegion", endpointGroupRegion);
		}
	}

	public String getEndpointType() {
		return this.endpointType;
	}

	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
		if(endpointType != null){
			putQueryParameter("EndpointType", endpointType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public String getEndpointSubAddress() {
		return this.endpointSubAddress;
	}

	public void setEndpointSubAddress(String endpointSubAddress) {
		this.endpointSubAddress = endpointSubAddress;
		if(endpointSubAddress != null){
			putQueryParameter("EndpointSubAddress", endpointSubAddress);
		}
	}

	@Override
	public Class<CreateBasicEndpointGroupResponse> getResponseClass() {
		return CreateBasicEndpointGroupResponse.class;
	}

}
