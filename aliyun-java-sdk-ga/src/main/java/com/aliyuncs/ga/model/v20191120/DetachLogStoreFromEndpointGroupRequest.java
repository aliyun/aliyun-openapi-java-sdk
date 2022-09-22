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
public class DetachLogStoreFromEndpointGroupRequest extends RpcAcsRequest<DetachLogStoreFromEndpointGroupResponse> {
	   

	private String clientToken;

	private String listenerId;

	private List<String> endpointGroupIdss;

	private String acceleratorId;
	public DetachLogStoreFromEndpointGroupRequest() {
		super("Ga", "2019-11-20", "DetachLogStoreFromEndpointGroup", "gaplus");
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

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
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

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	@Override
	public Class<DetachLogStoreFromEndpointGroupResponse> getResponseClass() {
		return DetachLogStoreFromEndpointGroupResponse.class;
	}

}
