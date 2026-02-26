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
public class CreateBasicAccelerateIpEndpointRelationsRequest extends RpcAcsRequest<CreateBasicAccelerateIpEndpointRelationsResponse> {
	   

	private String clientToken;

	private String acceleratorId;

	private List<AccelerateIpEndpointRelations> accelerateIpEndpointRelations;
	public CreateBasicAccelerateIpEndpointRelationsRequest() {
		super("Ga", "2019-11-20", "CreateBasicAccelerateIpEndpointRelations", "gaplus");
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

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public List<AccelerateIpEndpointRelations> getAccelerateIpEndpointRelations() {
		return this.accelerateIpEndpointRelations;
	}

	public void setAccelerateIpEndpointRelations(List<AccelerateIpEndpointRelations> accelerateIpEndpointRelations) {
		this.accelerateIpEndpointRelations = accelerateIpEndpointRelations;	
		if (accelerateIpEndpointRelations != null) {
			for (int depth1 = 0; depth1 < accelerateIpEndpointRelations.size(); depth1++) {
				if (accelerateIpEndpointRelations.get(depth1) != null) {
					
						putQueryParameter("AccelerateIpEndpointRelations." + (depth1 + 1) + ".AccelerateIpId" , accelerateIpEndpointRelations.get(depth1).getAccelerateIpId());
						putQueryParameter("AccelerateIpEndpointRelations." + (depth1 + 1) + ".EndpointId" , accelerateIpEndpointRelations.get(depth1).getEndpointId());
				}
			}
		}	
	}

	public static class AccelerateIpEndpointRelations {

		private String accelerateIpId;

		private String endpointId;

		public String getAccelerateIpId() {
			return this.accelerateIpId;
		}

		public void setAccelerateIpId(String accelerateIpId) {
			this.accelerateIpId = accelerateIpId;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}
	}

	@Override
	public Class<CreateBasicAccelerateIpEndpointRelationsResponse> getResponseClass() {
		return CreateBasicAccelerateIpEndpointRelationsResponse.class;
	}

}
