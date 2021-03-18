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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTrafficMirrorSessionAttributeRequest extends RpcAcsRequest<UpdateTrafficMirrorSessionAttributeResponse> {
	   

	private String trafficMirrorTargetType;

	private Long resourceOwnerId;

	private String clientToken;

	private Boolean enabled;

	private String trafficMirrorSessionName;

	private String trafficMirrorSessionDescription;

	private Boolean dryRun;

	private String trafficMirrorSessionId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer priority;

	private Long ownerId;

	private String trafficMirrorTargetId;

	private String trafficMirrorFilterId;

	private Integer virtualNetworkId;
	public UpdateTrafficMirrorSessionAttributeRequest() {
		super("Vpc", "2016-04-28", "UpdateTrafficMirrorSessionAttribute", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTrafficMirrorTargetType() {
		return this.trafficMirrorTargetType;
	}

	public void setTrafficMirrorTargetType(String trafficMirrorTargetType) {
		this.trafficMirrorTargetType = trafficMirrorTargetType;
		if(trafficMirrorTargetType != null){
			putQueryParameter("TrafficMirrorTargetType", trafficMirrorTargetType);
		}
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

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getTrafficMirrorSessionName() {
		return this.trafficMirrorSessionName;
	}

	public void setTrafficMirrorSessionName(String trafficMirrorSessionName) {
		this.trafficMirrorSessionName = trafficMirrorSessionName;
		if(trafficMirrorSessionName != null){
			putQueryParameter("TrafficMirrorSessionName", trafficMirrorSessionName);
		}
	}

	public String getTrafficMirrorSessionDescription() {
		return this.trafficMirrorSessionDescription;
	}

	public void setTrafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
		this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
		if(trafficMirrorSessionDescription != null){
			putQueryParameter("TrafficMirrorSessionDescription", trafficMirrorSessionDescription);
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
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

	public String getTrafficMirrorTargetId() {
		return this.trafficMirrorTargetId;
	}

	public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
		this.trafficMirrorTargetId = trafficMirrorTargetId;
		if(trafficMirrorTargetId != null){
			putQueryParameter("TrafficMirrorTargetId", trafficMirrorTargetId);
		}
	}

	public String getTrafficMirrorFilterId() {
		return this.trafficMirrorFilterId;
	}

	public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
		this.trafficMirrorFilterId = trafficMirrorFilterId;
		if(trafficMirrorFilterId != null){
			putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
		}
	}

	public Integer getVirtualNetworkId() {
		return this.virtualNetworkId;
	}

	public void setVirtualNetworkId(Integer virtualNetworkId) {
		this.virtualNetworkId = virtualNetworkId;
		if(virtualNetworkId != null){
			putQueryParameter("VirtualNetworkId", virtualNetworkId.toString());
		}
	}

	@Override
	public Class<UpdateTrafficMirrorSessionAttributeResponse> getResponseClass() {
		return UpdateTrafficMirrorSessionAttributeResponse.class;
	}

}
