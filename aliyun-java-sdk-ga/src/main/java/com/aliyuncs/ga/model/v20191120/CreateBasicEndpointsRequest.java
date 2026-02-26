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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBasicEndpointsRequest extends RpcAcsRequest<CreateBasicEndpointsResponse> {
	   

	private List<Endpoints> endpoints;

	private String clientToken;

	private String acceleratorId;

	private String endpointGroupId;
	public CreateBasicEndpointsRequest() {
		super("Ga", "2019-11-20", "CreateBasicEndpoints", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Endpoints> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<Endpoints> endpoints) {
		this.endpoints = endpoints;	
		if (endpoints != null) {
			for (int depth1 = 0; depth1 < endpoints.size(); depth1++) {
				if (endpoints.get(depth1) != null) {
					
						putQueryParameter("Endpoints." + (depth1 + 1) + ".Name" , endpoints.get(depth1).getName());
						putQueryParameter("Endpoints." + (depth1 + 1) + ".EndpointType" , endpoints.get(depth1).getEndpointType());
						putQueryParameter("Endpoints." + (depth1 + 1) + ".EndpointAddress" , endpoints.get(depth1).getEndpointAddress());
						putQueryParameter("Endpoints." + (depth1 + 1) + ".EndpointSubAddress" , endpoints.get(depth1).getEndpointSubAddress());
						putQueryParameter("Endpoints." + (depth1 + 1) + ".EndpointSubAddressType" , endpoints.get(depth1).getEndpointSubAddressType());
						putQueryParameter("Endpoints." + (depth1 + 1) + ".EndpointZoneId" , endpoints.get(depth1).getEndpointZoneId());
				}
			}
		}	
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

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
		if(endpointGroupId != null){
			putQueryParameter("EndpointGroupId", endpointGroupId);
		}
	}

	public static class Endpoints {

		private String name;

		private String endpointType;

		private String endpointAddress;

		private String endpointSubAddress;

		private String endpointSubAddressType;

		private String endpointZoneId;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getEndpointAddress() {
			return this.endpointAddress;
		}

		public void setEndpointAddress(String endpointAddress) {
			this.endpointAddress = endpointAddress;
		}

		public String getEndpointSubAddress() {
			return this.endpointSubAddress;
		}

		public void setEndpointSubAddress(String endpointSubAddress) {
			this.endpointSubAddress = endpointSubAddress;
		}

		public String getEndpointSubAddressType() {
			return this.endpointSubAddressType;
		}

		public void setEndpointSubAddressType(String endpointSubAddressType) {
			this.endpointSubAddressType = endpointSubAddressType;
		}

		public String getEndpointZoneId() {
			return this.endpointZoneId;
		}

		public void setEndpointZoneId(String endpointZoneId) {
			this.endpointZoneId = endpointZoneId;
		}
	}

	@Override
	public Class<CreateBasicEndpointsResponse> getResponseClass() {
		return CreateBasicEndpointsResponse.class;
	}

}
