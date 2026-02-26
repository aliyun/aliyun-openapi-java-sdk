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
public class AttachLogStoreToEndpointGroupRequest extends RpcAcsRequest<AttachLogStoreToEndpointGroupResponse> {
	   

	private String clientToken;

	private String slsLogStoreName;

	private String listenerId;

	private List<String> endpointGroupIdss;

	private String slsProjectName;

	private String slsRegionId;

	private String acceleratorId;
	public AttachLogStoreToEndpointGroupRequest() {
		super("Ga", "2019-11-20", "AttachLogStoreToEndpointGroup", "gaplus");
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

	public String getSlsLogStoreName() {
		return this.slsLogStoreName;
	}

	public void setSlsLogStoreName(String slsLogStoreName) {
		this.slsLogStoreName = slsLogStoreName;
		if(slsLogStoreName != null){
			putQueryParameter("SlsLogStoreName", slsLogStoreName);
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

	public String getSlsProjectName() {
		return this.slsProjectName;
	}

	public void setSlsProjectName(String slsProjectName) {
		this.slsProjectName = slsProjectName;
		if(slsProjectName != null){
			putQueryParameter("SlsProjectName", slsProjectName);
		}
	}

	public String getSlsRegionId() {
		return this.slsRegionId;
	}

	public void setSlsRegionId(String slsRegionId) {
		this.slsRegionId = slsRegionId;
		if(slsRegionId != null){
			putQueryParameter("SlsRegionId", slsRegionId);
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
	public Class<AttachLogStoreToEndpointGroupResponse> getResponseClass() {
		return AttachLogStoreToEndpointGroupResponse.class;
	}

}
