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
public class DeleteEndpointGroupsRequest extends RpcAcsRequest<DeleteEndpointGroupsResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private List<String> endpointGroupIdss;
	public DeleteEndpointGroupsRequest() {
		super("Ga", "2019-11-20", "DeleteEndpointGroups", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public List<String> getEndpointGroupIdss() {
		return this.endpointGroupIdss;
	}

	public void setEndpointGroupIdss(List<String> endpointGroupIdss) {
		this.endpointGroupIdss = endpointGroupIdss;	
		if (endpointGroupIdss != null) {
			for (int i = 0; i < endpointGroupIdss.size(); i++) {
				putQueryParameter("EndpointGroupIds." + (i + 1) , endpointGroupIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteEndpointGroupsResponse> getResponseClass() {
		return DeleteEndpointGroupsResponse.class;
	}

}
