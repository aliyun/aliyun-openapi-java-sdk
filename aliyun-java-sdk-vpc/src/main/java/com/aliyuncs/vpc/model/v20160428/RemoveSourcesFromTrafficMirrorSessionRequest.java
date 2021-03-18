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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveSourcesFromTrafficMirrorSessionRequest extends RpcAcsRequest<RemoveSourcesFromTrafficMirrorSessionResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private List<String> trafficMirrorSourceIdss;

	private Boolean dryRun;

	private String trafficMirrorSessionId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public RemoveSourcesFromTrafficMirrorSessionRequest() {
		super("Vpc", "2016-04-28", "RemoveSourcesFromTrafficMirrorSession", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public List<String> getTrafficMirrorSourceIdss() {
		return this.trafficMirrorSourceIdss;
	}

	public void setTrafficMirrorSourceIdss(List<String> trafficMirrorSourceIdss) {
		this.trafficMirrorSourceIdss = trafficMirrorSourceIdss;	
		if (trafficMirrorSourceIdss != null) {
			for (int i = 0; i < trafficMirrorSourceIdss.size(); i++) {
				putQueryParameter("TrafficMirrorSourceIds." + (i + 1) , trafficMirrorSourceIdss.get(i));
			}
		}	
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

	public String getTrafficMirrorSessionId() {
		return this.trafficMirrorSessionId;
	}

	public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
		this.trafficMirrorSessionId = trafficMirrorSessionId;
		if(trafficMirrorSessionId != null){
			putQueryParameter("TrafficMirrorSessionId", trafficMirrorSessionId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<RemoveSourcesFromTrafficMirrorSessionResponse> getResponseClass() {
		return RemoveSourcesFromTrafficMirrorSessionResponse.class;
	}

}
