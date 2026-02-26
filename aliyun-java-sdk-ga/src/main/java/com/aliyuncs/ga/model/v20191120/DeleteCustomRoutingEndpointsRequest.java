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
public class DeleteCustomRoutingEndpointsRequest extends RpcAcsRequest<DeleteCustomRoutingEndpointsResponse> {
	   

	private String clientToken;

	private List<String> endpointIdss;

	private String endpointGroupId;
	public DeleteCustomRoutingEndpointsRequest() {
		super("Ga", "2019-11-20", "DeleteCustomRoutingEndpoints", "gaplus");
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

	public List<String> getEndpointIdss() {
		return this.endpointIdss;
	}

	public void setEndpointIdss(List<String> endpointIdss) {
		this.endpointIdss = endpointIdss;	
		if (endpointIdss != null) {
			for (int i = 0; i < endpointIdss.size(); i++) {
				putQueryParameter("EndpointIds." + (i + 1) , endpointIdss.get(i));
			}
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

	@Override
	public Class<DeleteCustomRoutingEndpointsResponse> getResponseClass() {
		return DeleteCustomRoutingEndpointsResponse.class;
	}

}
